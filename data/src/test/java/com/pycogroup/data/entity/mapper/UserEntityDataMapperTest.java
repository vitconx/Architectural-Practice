package com.pycogroup.data.entity.mapper;

import com.pycogroup.data.ApplicationTestCase;
import com.pycogroup.data.entity.UserEntity;
import com.pycogroup.domain.User;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by HieuVP on 1/5/16.
 */
public class UserEntityDataMapperTest extends ApplicationTestCase {
    private static final int FAKE_USER_ID = 123;
    private static final String FAKE_FULLNAME = "Tony Stark";

    private UserEntityDataMapper userEntityDataMapper;

    @Before
    public void setUp() throws Exception {
        userEntityDataMapper = new UserEntityDataMapper();
    }

    @Test
    public void testTransformUserEntity() {
        UserEntity userEntity = createFakeUserEntity();
        User user = userEntityDataMapper.transform(userEntity);
        assertThat(user, is(instanceOf(User.class)));
        assertThat(user.getUserId(), is(FAKE_USER_ID));
        assertThat(user.getFullName(), is(FAKE_FULLNAME));
    }

    @Test
    public void testTransformUserEntityList() {
        UserEntity mockUserEntityOne = mock(UserEntity.class);
        UserEntity mockUserEntityTwo = mock(UserEntity.class);

        List<UserEntity> userEntityList = new ArrayList<>();
        userEntityList.add(mockUserEntityOne);
        userEntityList.add(mockUserEntityTwo);

        List<User> userList = userEntityDataMapper.transform(userEntityList);
        assertThat(userList.toArray()[0], is(instanceOf(User.class)));
        assertThat(userList.toArray()[1], is(instanceOf(User.class)));
        assertThat(userList.size(), is(2));
    }

    private UserEntity createFakeUserEntity() {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserId(FAKE_USER_ID);
        userEntity.setFullname(FAKE_FULLNAME);
        return userEntity;
    }
}