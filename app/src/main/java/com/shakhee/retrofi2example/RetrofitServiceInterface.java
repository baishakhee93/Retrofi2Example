package com.shakhee.retrofi2example;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitServiceInterface {
    @GET("quotes")
    Call<List<Modle>> getService();

}
