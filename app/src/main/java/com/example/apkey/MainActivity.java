package com.example.apkey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.apkey.Model.InstansiItem;
import com.example.apkey.Presenter.HomeView;
import com.example.apkey.Presenter.InstansiPresenter;
import com.example.apkey.adapter.InstansiAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements HomeView {

    private RecyclerView recyclerView;
    private InstansiAdapter adapter;
    private InstansiPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rec_artikel);
        presenter = new InstansiPresenter(this, this);
        presenter.loadInstansi();
    }

    @Override
    public void onSucces(List<InstansiItem> instansiList) {
        adapter = new InstansiAdapter(getApplicationContext(), instansiList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onError(String errorMessage) {
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure(String failureMessage) {
        Toast.makeText(this, failureMessage, Toast.LENGTH_LONG).show();
    }

}
