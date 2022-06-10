package com.posco.insta.user.service;


import com.posco.insta.user.model.UserDto;
import com.posco.insta.user.repository.UserMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements userService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<UserDto> findUser() {
        return userMapper.getUser();
    }

    @Override
    public UserDto findUserById(UserDto userDto) {
        return userMapper.getUserById(userDto);
    }

    @Override
    public int createUser(UserDto userDto) {

        return userMapper.createUser(userDto);
    }

    @Override
    public int deleteUser(UserDto userDto) {
        return userMapper.deleteUser(userDto);
    }

    @Override
    public Integer updateUserById(UserDto userDot) {
        return userMapper.updateUserById(userDot);
    }

    @Override
    public UserDto serviceLogin(UserDto userDto) {
//        UserDto check = userMapper.getUserByIdAndPassword(userDto);
        return userMapper.getUserByUserIdAndPassword(userDto);
    }
}
