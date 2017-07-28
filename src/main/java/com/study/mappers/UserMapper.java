package com.study.mappers;

import com.study.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int saveUser(User user);

    User getUserByName(@Param("username") String username, @Param("password")String password);

    User getUserByEmail(@Param("email")String email, @Param("password")String password);

    int verifyPassword(@Param("userId")Integer userId, @Param("password")String password);

    int updatePassword(@Param("userId")Integer userId, @Param("password")String password);

    int verifyEmail(String email);

    void deleteUserById(Integer userId);
}
