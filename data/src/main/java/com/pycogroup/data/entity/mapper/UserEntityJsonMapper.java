package com.pycogroup.data.entity.mapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.pycogroup.data.entity.UserEntity;

import java.lang.reflect.Type;
import java.util.List;

import javax.inject.Inject;

/**
 * Created by HieuVP on 1/4/16.
 */
public class UserEntityJsonMapper {
    private final Gson gson;

    @Inject
    public UserEntityJsonMapper() {
        this.gson = new Gson();
    }

    public UserEntity transformUserEntity(String userJsonResponse) {
        Type userEntityType = new TypeToken<UserEntity>() {
        }.getType();
        return this.gson.fromJson(userJsonResponse, userEntityType);
    }

    public List<UserEntity> transformUserEntityList(String userListJsonResponse) {
        Type listOfUserEntityType = new TypeToken<List<UserEntity>>() {
        }.getType();
        return this.gson.fromJson(userListJsonResponse, listOfUserEntityType);
    }
}
