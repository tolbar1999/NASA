package tolbar.com.service;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import tolbar.com.modelo.Post;

public interface IPostService {

    String RUTA_API = "/posts";

    @GET(RUTA_API)
    public Call<List<Post>> listarTodos();

}
