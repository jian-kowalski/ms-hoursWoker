package com.jiankowalski.hruser.api.controller;

import com.jiankowalski.hruser.api.assembler.UserAssembler;
import com.jiankowalski.hruser.api.model.UserModel;
import com.jiankowalski.hruser.domain.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    private final UserAssembler userAssembler;

    public UserController(UserService userService, UserAssembler userAssembler) {
        this.userService = userService;
        this.userAssembler = userAssembler;
    }

    // @GetMapping("/{email}")
    // public UserModel findById(@PathVariable String email){
    //     return userAssembler.toModel(userService.findUserByEmail(email));
    // }

     @GetMapping("/{id}")
    public UserModel findById(@PathVariable Long id) {
        return userAssembler.toModel(userService.findUserById(id));
    }

    
}
