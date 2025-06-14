package com.vrdoerz.userservice.mapper;

import com.vrdoerz.userservice.dto.UserRegisterRequest;
import com.vrdoerz.userservice.dto.UserResponse;
import com.vrdoerz.userservice.model.User;
import com.vrdoerz.userservice.model.UserRole;

public class UserMapper {

    public static UserResponse toDto(User user) {
        if (user == null) return null;

        UserResponse response = new UserResponse();
        response.setId(user.getId());
        response.setName(user.getName());
        response.setEmail(user.getEmail());
        response.setMobile(user.getMobile());
        response.setAddress(user.getAddress());
        response.setRole(user.getRole());
        return response;
    }

    public static User toEntity(UserRegisterRequest request){
        User user = new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setMobile(request.getMobile());
        user.setAddress(request.getAddress());
        user.setRole(UserRole.valueOf(request.getRole()));
        return user;
    }
}
