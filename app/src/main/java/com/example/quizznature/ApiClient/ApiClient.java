package com.example.quizznature.ApiClient;

import android.text.TextUtils;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static Retrofit retrofit;
    private static final String base_url = System.getenv("STRAPI_BASE_URL");
    private static final String token = System.getenv("STRAPI_TOKEN_API");

    public static final OkHttpClient client = new OkHttpClient.Builder().addInterceptor(new Interceptor() {
        @NonNull
        @Override
        public okhttp3.Response intercept(@NonNull Chain chain) throws IOException {
            Request newRequest = chain.request().newBuilder()
                    .addHeader("Authorization", "Bearer " + token)
                    .build();
            return chain.proceed(newRequest);
        }
    }).build();

    public static Retrofit ApiConnection(){
        if (TextUtils.isEmpty(base_url)) {
            throw new IllegalArgumentException("Base URL is null or empty");
        }
        if (TextUtils.isEmpty(token)) {
            throw new IllegalArgumentException("Token is null or empty");
        }
        if (retrofit == null) {
            try {
                retrofit = new Retrofit.Builder()
                        .baseUrl(base_url)
                        .client(client)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();
            } catch (IllegalArgumentException e) {
                // Gérer l'exception
                e.printStackTrace();
            }
        }
        return retrofit;
    }
}
