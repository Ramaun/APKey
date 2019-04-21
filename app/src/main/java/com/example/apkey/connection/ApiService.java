package com.example.apkey.connection;

import com.example.apkey.Model.InstansiResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("api/instansi/semuainstansi")
    Call<InstansiResponse> getInstansi();
}
