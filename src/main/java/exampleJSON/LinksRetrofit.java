package exampleJSON;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface LinksRetrofit {

    @POST("api-sandbox.direct.yandex.ru/v4/json/")
    Call<Object> createUser(@Body Object object);

}
