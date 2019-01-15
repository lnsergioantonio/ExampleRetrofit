package com.example.sergio.webservice;

import com.example.sergio.webservice.pojo.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostService {

    @GET("posts")
    Call<List<Post>> getPosts();
}
