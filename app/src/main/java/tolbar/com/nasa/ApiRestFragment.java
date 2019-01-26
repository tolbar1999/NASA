package tolbar.com.nasa;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tolbar.com.modelo.Post;
import tolbar.com.service.implementacion.PostServiceImpl;


public class ApiRestFragment extends Fragment {

    PostServiceImpl servicioPost = new PostServiceImpl();

    ListView listaPost;
    ArrayList<String> titulos = new ArrayList<>();
    ArrayAdapter arrayAdapter;

    public ApiRestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_api_rest, container, false);
        getActivity().setTitle("API REST");
        listaPost = view.findViewById(R.id.listaPost);

        arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, titulos);
        listaPost.setAdapter(arrayAdapter);
        listarTodosPost();

        return view;
    }


    private void listarTodosPost() {
        servicioPost.listarTodos().enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                Toast.makeText(getActivity(), "Hay " + response.body().size() + " registros :v", Toast.LENGTH_LONG).show();
                for (Post post : response.body()) {
                    titulos.add(post.getTitle());
                }
                arrayAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {
                Toast.makeText(getActivity(), "Ha ocurrido un error en la peticion:" + t.getMessage(), Toast.LENGTH_LONG).show();
            }
        });
    }

}
