package exampleJSON;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pojo {

    @SerializedName("method")
    @Expose
    private String method;
    @SerializedName("locale")
    @Expose
    private String locale;
    @SerializedName("token")
    @Expose
    private String token;

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

}