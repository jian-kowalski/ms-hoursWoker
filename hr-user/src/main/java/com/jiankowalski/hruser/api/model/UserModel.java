package com.jiankowalski.hruser.api.model;

import java.util.HashSet;
import java.util.Set;

public class UserModel {

    private Long Id;
    private String name;
    private String email;
    private String password;
    private Set<RoleModel> roles = new HashSet<>();
    
    public Long getId() {
        return Id;
    }
    public void setId(Long id) {
        Id = id;
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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Set<RoleModel> getRoles() {
        return roles;
    }
    public void setRoles(Set<RoleModel> roles) {
        this.roles = roles;
    }
}
