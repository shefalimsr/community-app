package com.example.pay1.community.api;


import com.example.pay1.community.api.response.FeedResource;
import com.example.pay1.community.api.response.FeedResponse;
import com.example.pay1.community.training.Feed;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface APIInterface {

    @GET("/api/getFeed")
    Call<List<FeedResource>> getList();

    @GET("/api/getFeed")
    Call<List<FeedResource>> getComp(@Query("feed_type") String feedType);

    @GET("/api/getFeed")
    Call<List<FeedResource>> getSlider(@Query("resource_representation_type") String resType);

}