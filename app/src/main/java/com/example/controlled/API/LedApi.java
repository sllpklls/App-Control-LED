package com.example.controlled.API;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface LedApi {
    @GET("effect")
    Call<Void> setEffect(@Query("name") String effectName);
}
