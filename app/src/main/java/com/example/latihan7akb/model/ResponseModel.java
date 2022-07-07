package com.example.latihan7akb.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

//10119199, Iqbal Fatur Nugraha, 06 Juli 2022

public class ResponseModel {
    @SerializedName("status")
    public int status;
    @SerializedName("error")
    public int error;
    @SerializedName("data")
    public List<DaftarBalitaStanting> data = new ArrayList<>();

    public int getStatus() {
        return status;
    }

    public List<DaftarBalitaStanting> getData() {
        return data;
    }
}
