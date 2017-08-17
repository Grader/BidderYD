package exampleJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Control {
    static final String BASE_URL = "http://www.umori.li/";

    public static LinksRetrofit getApi() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        LinksRetrofit linksRetrofit = retrofit.create(LinksRetrofit.class);
        return linksRetrofit;

    }
}
