package com.example.quizznature.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import okhttp3.Call;

public class DataResponse {
    @SerializedName("data")
    @Expose
    private List<BaseAttributes> data = null;

    public List<BaseAttributes> getData() {
        return data;
    }
}

