package com.evn.bookstore.network.service;

import com.evn.bookstore.base.BaseResponse;
import com.evn.bookstore.model.User;

import retrofit2.Call;
import retrofit2.http.POST;

public interface UserService {
    @POST("user/sign-in")
    Call<BaseResponse<User>> signIn();
}
