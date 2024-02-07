package com.example.quizznature.ApiClient;

public class ApiClient {
    private static Retrofit retrofit;
    private static final String base_url = "http://192.168.100.1:1337";
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
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(base_url)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
