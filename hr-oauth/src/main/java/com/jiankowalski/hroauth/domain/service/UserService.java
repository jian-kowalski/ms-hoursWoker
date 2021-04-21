package com.jiankowalski.hroauth.domain.service;

import com.jiankowalski.hroauth.domain.feignclients.UserFeignClient;
import com.jiankowalski.hroauth.domain.model.UserModel;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
   
    public UserService(UserFeignClient userFeignClient) {
        this.userFeignClient = userFeignClient;
    }

    private final UserFeignClient userFeignClient;


    public UserModel findUserByEmail(String email) {
        return userFeignClient.findUserByEmail(email);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userFeignClient.findUserByEmail(username);
    }
}
