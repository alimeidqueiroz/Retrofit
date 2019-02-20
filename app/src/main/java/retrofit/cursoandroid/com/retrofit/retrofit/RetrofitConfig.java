package retrofit.cursoandroid.com.retrofit.retrofit;

import retrofit.cursoandroid.com.retrofit.service.CEPService;
import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;

public class RetrofitConfig {

    private final Retrofit retrofit;


    public RetrofitConfig() {
        this.retrofit = new Retrofit.Builder()
                .baseUrl("http://ws.matheuscastiglioni.com.br/ws/")
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
    }


    public CEPService getCEPService() {
        return this.retrofit.create(CEPService.class);
    }
}


