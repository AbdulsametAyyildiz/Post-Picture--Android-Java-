package com.example.postpic.RestApi;

public class BaseManager {
    public static RestApi getRestApi(){
        RestApiClient restApiClient = new RestApiClient(BaseUrl.url);
        return restApiClient.getRestApi();
    }
}
