package com.example.quizznature.model;

import com.google.gson.annotations.SerializedName;

public class DataRequest {

    @SerializedName("data")
    QuestionAttributes questionAttributes;
    QuizzAttributes quizzAttributes;

    public DataRequest(String text, String a, String b, String c, String d, String answer, Quizz quizzes, String name, String description, Question questions) {
        this.questionAttributes = new QuestionAttributes(text, a, b, c, d, answer, quizzes);
        this.quizzAttributes = new QuizzAttributes(name, description, questions);
    }

}
