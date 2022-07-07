package com.example.latihan7akb.API;

//10119199, Iqbal Fatur Nugraha, 06 Juli 2022
import com.example.latihan7akb.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

//10119199, Iqbal Fatur Nugraha, 06 Juli 2022

public interface ApiService {
    @GET("od_17148_persentase_balita_stunting_berdasarkan_kabupatenkota?limit=10")
    Call<ResponseModel> getBalita();
}
