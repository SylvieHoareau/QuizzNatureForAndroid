package com.example.quizznature.Api;

import com.example.quizznature.model.DataRequest;
import com.example.quizznature.model.DataResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface ApiService {
    @GET("api/questions")
    Call<DataResponse> getQuestions();

    @POST("api/questions")
    Call<DataRequest> createQuestion(
            @Body DataRequest dataRequest
    );

    @PUT("api/questions/{id}")
    Call<DataRequest> updateQuestion(
            @Path("id") int id,
            @Body DataRequest dataRequest
    );

    @DELETE("api/questions/{id}")
    Call<DataRequest> deleteQuestion(
            @Path("id") int id
    );

    @GET("api/quizzes")
    Call<DataResponse> getQuizzes();

    @POST("api/quizzes")
    Call<DataRequest> createQuizzes(
            @Body DataRequest dataRequest
    );

    @PUT("api/quizzes/{id}")
    Call<DataRequest> updateQuizzes(
            @Path("id") int id,
            @Body DataRequest dataRequest
    );

    @DELETE("api/quizzes/{id}")
    Call<DataRequest> deleteQuizzes(
            @Path("id") int id
    );


}
