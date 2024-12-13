package com.example.interfaz_odoo_2_3_mejorada.DAO;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ConexionDB {

        private static Retrofit retrofit;

        // Base URL, no incluyas el token en el baseUrl, solo la parte base
        static final String BASE_URL = "http://localhost:8081/";

        public static Retrofit getRetrofitInstance(String baseUrl) {
            if (retrofit == null) {
                // Crear Retrofit con GsonConverterFactory
                retrofit = new retrofit2.Retrofit.Builder()
                        .baseUrl(BASE_URL) // Base URL
                        .addConverterFactory(GsonConverterFactory.create()) // Serializador JSON
                        .build();
            }
            return retrofit;
        }}
