package com.jiankowalski.hroauth.api;

import com.jiankowalski.hroauth.domain.model.UserModel;
import com.jiankowalski.hroauth.domain.service.UserService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    } 
    

    @GetMapping("/search")
    public UserModel findByEmail(@RequestParam String email){
        return userService.findUserByEmail(email);
    }
}
