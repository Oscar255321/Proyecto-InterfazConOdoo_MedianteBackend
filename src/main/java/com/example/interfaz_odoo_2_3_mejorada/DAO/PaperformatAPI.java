package com.example.interfaz_odoo_2_3_mejorada.DAO;



import com.example.interfaz_odoo_2_3_mejorada.Modelos.Paperformat;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface PaperformatAPI {

    @Headers({
            "Content-type: application/json",
            "login:oabemal0810@g.educaand.es",
            "password:Oscar2510",
            "api-key:b2f0f8e9-6c72-4d4a-9d25-4d4565ac2360"
    })
    @GET("report_paperformat")
    Call<List<Paperformat>> obtenerFormatos(@Query("name") String nombre);

    @Headers({
            "Content-type: application/json",
            "login:oabemal0810@g.educaand.es",
            "password:Oscar2510",
            "api-key:b2f0f8e9-6c72-4d4a-9d25-4d4565ac2360"
    })
    @POST("report_paperformat")
    Call<Void> crearFormato(@Body Paperformat formato);

    @Headers({
            "Content-type: application/json",
            "login:oabemal0810@g.educaand.es",
            "password:Oscar2510",
            "api-key:b2f0f8e9-6c72-4d4a-9d25-4d4565ac2360"
    })
    @DELETE("report_paperformat/{name}")
    Call<Void> eliminarFormato(@Path("name") String nombre);

    @Headers({
            "Content-type: application/json",
            "login:oabemal0810@g.educaand.es",
            "password:Oscar2510",
            "api-key:b2f0f8e9-6c72-4d4a-9d25-4d4565ac2360"
    })
    @PUT("report_paperformat/{id}")
    Call<Void> editarFormato(@Path("id") int id, @Body Paperformat formato);
}
