package com.example.postpic.RestApi;

import android.widget.BaseAdapter;

import com.example.postpic.Models.Result;
import com.example.postpic.R;

import retrofit2.Call;

public class ManagerAll extends BaseManager {

    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance(){
        return ourInstance;
    }

    public Call<Result> getPics(String title, String image){
        Call<Result> x = getRestApi().addPic(title, image);
        return x;
    }
}
