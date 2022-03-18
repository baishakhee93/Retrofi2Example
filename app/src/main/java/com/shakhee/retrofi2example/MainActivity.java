package com.shakhee.retrofi2example;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private List<Modle> mModleList = new ArrayList<>();
    private MainAdapter mMainAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recyclearView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mMainAdapter = new MainAdapter(this, mModleList);
        mRecyclerView.setAdapter(mMainAdapter);


        requestRetrofitService();


    }

    private void requestRetrofitService() {

      RetrofitServiceInterface retrofitService = RetrofitServiceGenerator.createRetrofitService(RetrofitServiceInterface.class);

        Call<List<Modle>> call = retrofitService.getService();


        call.enqueue(new Callback<List<Modle>>() {
            @Override
            public void onResponse(Call<List<Modle>> call, Response<List<Modle>> response) {

                if (response.isSuccessful()) {

                    for (Modle quote : response.body()) {
                        mModleList.add(quote);
                    }
                    mMainAdapter.notifyDataSetChanged();
                } else {

                    Log.e(TAG, response.message());

                }
            }

            @Override
            public void onFailure(Call<List<Modle>> call, Throwable t) {
                Log.e(TAG, t.getMessage());

            }


        });

    }
}