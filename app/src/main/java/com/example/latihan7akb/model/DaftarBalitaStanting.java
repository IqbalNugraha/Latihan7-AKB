package com.example.latihan7akb.model;

import com.google.gson.annotations.SerializedName;

//10119199, Iqbal Fatur Nugraha, 06 Juli 2022

public class DaftarBalitaStanting {

    @SerializedName("id")
    public String id;
    @SerializedName("kode_provinsi")
    public String kode_provinsi;
    @SerializedName("nama_provinsi")
    public String nama_provinsi;
    @SerializedName("kode_kabupaten_kota")
    public String kode_kabupaten_kota;
    @SerializedName("nama_kabupaten_kota")
    public String nama_kabupaten_kota;
    @SerializedName("persentase_balita_stunting")
    public String persentase_balita_stunting;
    @SerializedName("satuan")
    public String satuan;
    @SerializedName("tahun")
    public String tahun;

    public String getId(){return id;}

    public String getKode_provinsi(){return kode_provinsi;}

    public String getNama_provinsi(){return nama_provinsi;}

    public String getKode_kabupaten_kota(){return kode_kabupaten_kota;}

    public String getNama_kabupaten_kota(){return nama_kabupaten_kota;}

    public String getPersentase_balita_stunting(){return persentase_balita_stunting;}

    public String getSatuan(){return satuan;}

    public String getTahun(){return tahun;}

}
