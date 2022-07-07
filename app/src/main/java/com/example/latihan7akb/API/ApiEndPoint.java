package com.example.latihan7akb.API;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

//10119199, Iqbal Fatur Nugraha, 06 Juli 2022
public class ApiEndPoint {

    //private static final String BASE_URL = "http://10.0.2.2:3000/";
    private static final String BASE_URL = "https://satudata.jabarprov.go.id/api-backend/bigdata/dinkes/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient(){
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient =new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(okHttpClient)
                .build();

        return retrofit;

    }
}
