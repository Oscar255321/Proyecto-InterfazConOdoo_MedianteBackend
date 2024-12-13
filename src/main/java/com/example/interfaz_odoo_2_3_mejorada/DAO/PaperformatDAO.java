package com.example.interfaz_odoo_2_3_mejorada.DAO;


import com.example.interfaz_odoo_2_3_mejorada.Modelos.Paperformat;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.util.List;

public class PaperformatDAO {

    private final PaperformatDAO service;

    public PaperformatDAO(String baseUrl) {
        Retrofit retrofit = ConexionDB.getRetrofitInstance(baseUrl);
        service = retrofit.create(PaperformatDAO.class);
    }

    public Call<List<Paperformat>> obtenerFormatos(String nombre) {
        Call<List<Paperformat>> call = service.obtenerFormatos(nombre);
        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<List<Paperformat>> call, Response<List<Paperformat>> response) {
                if (response.isSuccessful()) {
                    List<Paperformat> formatos = response.body();
                    System.out.println(formatos);
                } else {
                    System.out.println("Error al obtener los formatos: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<Paperformat>> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return call;
    }

    public Call<Void> crearFormato(Paperformat formato) {
        Call<Void> call = service.crearFormato(formato);
        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    System.out.println("Formato creado correctamente.");
                } else {
                    System.out.println("Error al crear el formato: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return call;
    }

    public Call<Void> eliminarFormato(String nombre) {
        Call<Void> call = service.eliminarFormato(nombre);
        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    System.out.println("Formato eliminado correctamente.");
                } else {
                    System.err.println("Error al eliminar el formato: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return call;
    }

    public Call<Void> editarFormato(int id, Paperformat formato) {
        Call<Void> call = service.editarFormato(id, formato);
        call.enqueue(new Callback<>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                if (response.isSuccessful()) {
                    System.out.println("Formato editado correctamente.");
                } else {
                    System.err.println("Error al editar el formato: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                t.printStackTrace();
            }
        });
        return call;
    }
}


