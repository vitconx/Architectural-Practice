package com.pycogroup.data.network;

import android.content.Context;

import com.pycogroup.data.entity.UserEntity;
import com.pycogroup.data.entity.mapper.UserEntityJsonMapper;

import java.util.List;

import rx.Observable;

/**
 * Created by HieuVP on 1/4/16.
 */
public class RestApiImpl implements RestApi {
    private final Context context;
    private final UserEntityJsonMapper userEntityJsonMapper;

    public RestApiImpl(Context context, UserEntityJsonMapper userEntityJsonMapper) {
        if (context == null || userEntityJsonMapper == null) {
            throw new IllegalArgumentException("The constructor parameters cannot be null!!!");
        }
        this.context = context;
        this.userEntityJsonMapper = userEntityJsonMapper;
    }

    @Override
    public Observable<List<UserEntity>> userEntityList() {
        return null;
    }

    @Override
    public Observable<UserEntity> userEntityById(int userId) {
        return null;
    }
}
