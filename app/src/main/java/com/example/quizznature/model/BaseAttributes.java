package com.example.quizznature.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BaseAttributes {
    @SerializedName("id")
    @Expose
    private Integer id;

    public Integer getId() {
        return id;
    }
}
