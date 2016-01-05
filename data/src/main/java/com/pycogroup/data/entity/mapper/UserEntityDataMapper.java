package com.pycogroup.data.entity.mapper;

import com.pycogroup.data.entity.UserEntity;
import com.pycogroup.domain.User;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by HieuVP on 1/5/16.
 */
@Singleton
public class UserEntityDataMapper {

    @Inject
    public UserEntityDataMapper() {
    }

    public User transform(UserEntity userEntity) {
        return null;
    }
}
