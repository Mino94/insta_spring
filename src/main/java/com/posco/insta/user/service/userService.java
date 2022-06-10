package com.posco.insta.user.service;

import com.posco.insta.user.model.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;


public interface userService {
    List<UserDto> findUser();
    UserDto findUserById(UserDto userDto);

    int createUser(UserDto userDto);

    int deleteUser(UserDto userDto);

    Integer updateUserById(UserDto userDot);

    UserDto serviceLogin(UserDto userDto);
}
