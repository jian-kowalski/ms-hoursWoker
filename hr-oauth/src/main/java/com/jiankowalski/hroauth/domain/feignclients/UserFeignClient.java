package com.jiankowalski.hroauth.domain.feignclients;

import com.jiankowalski.hroauth.domain.model.UserModel;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

    @GetMapping("/search")
    UserModel findUserByEmail(@RequestParam String email);
    
}
