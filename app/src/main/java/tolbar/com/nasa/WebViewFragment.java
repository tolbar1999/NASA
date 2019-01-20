package tolbar.com.nasa;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class WebViewFragment extends Fragment {


    private EditText txtUrl;
    private TextView txtResultadoUltimaVisita;
    private Button btnAbrirUrl;

    public WebViewFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_web_view, container, false);
        getActivity().setTitle("Web View");
        txtUrl = view.findViewById(R.id.txtUrl);
        txtResultadoUltimaVisita = view.findViewById(R.id.txtResultadoUltimaVisita);
        btnAbrirUrl = view.findViewById(R.id.btnAbrirUrl);

        SharedPreferences preferences = getActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);
        String ultimaVisita = preferences.getString("ultimaVisita", "N/A");
        txtResultadoUltimaVisita.setText(ultimaVisita);

        btnAbrirUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirUrl();
            }
        });

        return view;
    }

    public void abrirUrl() {
        SharedPreferences preferences = getActivity().getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("ultimaVisita", txtUrl.getText().toString());
        editor.commit();

        Intent intent = new Intent(getActivity(), WebViewActivity.class);
        intent.putExtra("txtUrl", txtUrl.getText().toString());
        startActivity(intent);
    }

}
