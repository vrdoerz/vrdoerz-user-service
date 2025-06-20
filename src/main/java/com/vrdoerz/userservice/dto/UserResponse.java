package com.vrdoerz.userservice.dto;

import com.vrdoerz.userservice.model.UserRole;

public class UserResponse {

    private Long id;
    private String name;
    private String email;
    private String mobile;
    private String address;
    private UserRole role;

    public UserResponse() {
    }

    public UserResponse(Long id, String name, String email, String mobile, String address, UserRole role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
        this.address = address;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
