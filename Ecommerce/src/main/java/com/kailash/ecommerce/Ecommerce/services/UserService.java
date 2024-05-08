package com.kailash.ecommerce.Ecommerce.services;

import com.kailash.ecommerce.Ecommerce.entities.User;
import com.kailash.ecommerce.Ecommerce.payloads.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto user, Integer userId);

    UserDto getUserById(Integer userId);
    List<UserDto> getAllUsers();
    void deleteUser(Integer userId);
}
