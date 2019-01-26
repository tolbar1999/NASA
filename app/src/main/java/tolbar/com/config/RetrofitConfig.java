package tolbar.com.config;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConfig {

    public static Retrofit getRetrofitConfig() {
        Retrofit retrofit = new Retrofit.Builder().baseUrl(Constantes.HOST).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }

}
