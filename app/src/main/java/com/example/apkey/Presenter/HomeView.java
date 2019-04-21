package com.example.apkey.Presenter;

import com.example.apkey.Model.InstansiItem;
import java.util.List;

public interface HomeView {

    void onSucces(List<InstansiItem> intansiList);
    void onError(String errorMessage);
    void onFailure(String failureMessage);

}
