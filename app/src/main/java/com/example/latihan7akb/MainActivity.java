package com.example.latihan7akb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.latihan7akb.API.ApiEndPoint;
import com.example.latihan7akb.API.ApiService;
import com.example.latihan7akb.adapter.BalitaStantingAdapter;
import com.example.latihan7akb.model.DaftarBalitaStanting;
import com.example.latihan7akb.model.ResponseModel;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
//10119199, Iqbal Fatur Nugraha, 06 Juli 2022
public class MainActivity extends AppCompatActivity {

    private BalitaStantingAdapter balitaStantingAdapter;
    private List<DaftarBalitaStanting> dbItems = new ArrayList<>();

    @BindView(R.id.recyclerViewBalita)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        balitaStantingAdapter = new BalitaStantingAdapter(this, dbItems);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(balitaStantingAdapter);

        loadDataBalita();
    }

    private void loadDataBalita() {

        //Declare Retrofit
        ApiService api = ApiEndPoint.getClient().create(ApiService.class);

        Call<ResponseModel> call = api.getBalita();
        call.enqueue(new Callback<ResponseModel>() {
            @Override
            public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                int message = response.body().getStatus();
                System.out.println("Message : "+message);
                dbItems = response.body().data;
                System.out.println("STATUS data "+dbItems);
                balitaStantingAdapter = new BalitaStantingAdapter(MainActivity.this, dbItems);
                recyclerView.setAdapter(balitaStantingAdapter);
            }

            @Override
            public void onFailure(Call<ResponseModel> call, Throwable t) {

                Toast.makeText(MainActivity.this, "Oops, your connection is WONGKY! ", Toast.LENGTH_SHORT).show();
            }
        });

    }
}