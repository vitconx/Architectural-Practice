package com.pycogroup.data.network;

import com.pycogroup.data.entity.UserEntity;

import java.util.List;

import rx.Observable;

/**
 * Created by HieuVP on 1/4/16.
 */
public interface RestApi {
    String API_BASE_URL = "http://www.android10.org/myapi/";
    String API_URL_GET_USER_LIST = API_BASE_URL + "users.json";
    String API_URL_GET_USER_DETAILS = API_BASE_URL + "user_";

    Observable<List<UserEntity>> userEntityList();

    Observable<UserEntity> userEntityById(final int userId);
}
