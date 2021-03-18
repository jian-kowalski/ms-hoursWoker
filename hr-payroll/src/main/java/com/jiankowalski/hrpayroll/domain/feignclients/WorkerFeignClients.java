package com.jiankowalski.hrpayroll.domain.feignclients;

import com.jiankowalski.hrpayroll.api.model.WorkerModel;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", path = "/workers")
public interface WorkerFeignClients {

    @GetMapping("/{workerId}")
    WorkerModel findById(@PathVariable Long workerId);
    
}
