package com.example.apkey.Presenter;

import android.content.Context;
import com.example.apkey.Model.InstansiResponse;
import com.example.apkey.connection.BaseApp;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InstansiPresenter{
    private Context context;
    private HomeView homeView;
    public InstansiPresenter(Context context, HomeView homeView) {
        this.context = context;
        this.homeView = homeView;
    }
    public void loadInstansi() {
        BaseApp.service.getInstansi().enqueue(new Callback<InstansiResponse>() {
            @Override
            public void onResponse(Call<InstansiResponse> call, Response<InstansiResponse> response) {
                if (response.isSuccessful()){
                    homeView.onSucces(response.body().getInstansi());
                } else {
                    homeView.onError(response.message());
                }
            }

            @Override
            public void onFailure(Call<InstansiResponse> call, Throwable t) {
                homeView.onFailure(t.getMessage());
            }
        });
    }
}

