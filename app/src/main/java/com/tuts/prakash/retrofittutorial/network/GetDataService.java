package com.tuts.prakash.retrofittutorial.network;

import com.tuts.prakash.retrofittutorial.model.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;



public interface GetDataService {

    @GET("/api/v1/productitems")
    Call<List<RetroPhoto>> getAllPhotos();
}
