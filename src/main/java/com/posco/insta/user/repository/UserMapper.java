package com.posco.insta.user.repository;

import com.posco.insta.user.model.UserDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface UserMapper {
    List<UserDto> getUser();
    UserDto getUserById(UserDto userDto);

    int createUser(UserDto userDto);

    int deleteUser(UserDto userDto);

    Integer updateUserById(UserDto userDot);

    UserDto getUserByUserIdAndPassword(UserDto userDto);



}
