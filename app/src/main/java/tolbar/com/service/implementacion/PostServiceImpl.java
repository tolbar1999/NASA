package tolbar.com.service.implementacion;

import java.util.List;

import retrofit2.Call;
import tolbar.com.config.RetrofitConfig;
import tolbar.com.modelo.Post;
import tolbar.com.service.IPostService;

public class PostServiceImpl implements IPostService {

    private IPostService servicioPost = RetrofitConfig.getRetrofitConfig().create(IPostService.class);


    @Override
    public Call<List<Post>> listarTodos() {
        Call<List<Post>> call = servicioPost.listarTodos();
        return call;
    }

}
