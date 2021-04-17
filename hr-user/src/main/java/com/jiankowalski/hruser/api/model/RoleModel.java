package com.jiankowalski.hruser.api.model;

public class RoleModel {
    
    private Long Id;

    private String roleName;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
