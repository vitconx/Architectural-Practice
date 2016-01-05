package com.pycogroup.data.entity.mapper;

import com.pycogroup.data.entity.UserEntity;
import com.pycogroup.domain.User;

import java.util.ArrayList;
import java.util.List;

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
        User user = null;
        if (userEntity != null) {
            user = new User(userEntity.getUserId());
            user.setCoverUrl(userEntity.getCoverUrl());
            user.setFullName(userEntity.getFullname());
            user.setDescription(userEntity.getDescription());
            user.setFollowers(userEntity.getFollowers());
            user.setEmail(userEntity.getEmail());
        }
        return user;
    }

    public List<User> transform(List<UserEntity> userEntityList) {
        List<User> userList = new ArrayList<>();
        User user;
        for (UserEntity userEntity : userEntityList) {
            user = transform(userEntity);
            if (user != null) {
                userList.add(user);
            }
        }
        return userList;
    }
}
