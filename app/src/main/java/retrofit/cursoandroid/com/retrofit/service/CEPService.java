package retrofit.cursoandroid.com.retrofit.service;

import retrofit.cursoandroid.com.retrofit.model.CEP;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CEPService { //servico

    //defini ao serviço que a requisição trata-se do verbo GET (pegar)
    @GET("cep/find/{cep}/json")
    Call<CEP> buscarCEP(@Path("cep") String cep);//requisição{
}



