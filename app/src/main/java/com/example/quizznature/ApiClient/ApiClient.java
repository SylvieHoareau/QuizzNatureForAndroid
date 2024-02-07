package com.example.quizznature.ApiClient;

public class ApiClient {
    private static Retrofit retrofit;
    private static final String base_url = "http://192.168.100.1:1337";
    private static final String token = "e0d158e6d28c74e87afae020935d62c9f9b179695d47746b488ba6897a57f92093c1a21063be92a0a2a936c92bda0f01110976c2d9262faf5a31536a0ba6de51572027777ae3879128fb29f28590b346ee37755b0945bdf3dcfcccee0ad952662a599ab3958bdb5fa91ddbeaca02e0095b81bba4f2507441aadfcc18ba5d4f51";

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
