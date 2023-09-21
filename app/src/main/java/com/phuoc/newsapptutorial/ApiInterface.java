package com.phuoc.newsapptutorial;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    //https://newsapi.org/v2/top-headlines?country=us&apiKey=77209bd97d1d404d857df4e4f0052b26
    String BASE_URL = "https://newsapi.org/v2/";

    @GET("top-headlines")
    Call<mainNews> getNews (
            @Query("country") String country,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );

    @GET("top-headlines")
    Call<mainNews> getCategoryNews (
            @Query("country") String country,
            @Query("category") String category,
            @Query("pageSize") int pagesize,
            @Query("apiKey") String apikey
    );
}
