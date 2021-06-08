package com.example.postpic.RestApi;

import com.example.postpic.Models.Result;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface RestApi {
    @FormUrlEncoded
    @POST("getPic.php")
    Call<Result> addPic(@Field("title") String title, @Field("image") String image);
}
