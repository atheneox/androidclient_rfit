package com.example.intruder.retrofit.Remote;

public class APIUtils {

    private APIUtils(){
    };

    public static final String API_URL = "http://127.0.0.1/api_rfit/public/"; //change ip

    public static UserService getUserService(){
        return RetrofitClient.getClient(API_URL).create(UserService.class);
    }

}