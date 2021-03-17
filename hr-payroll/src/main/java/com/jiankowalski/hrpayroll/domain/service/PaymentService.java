package com.jiankowalski.hrpayroll.domain.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.jiankowalski.hrpayroll.domain.model.Payment;
import com.jiankowalski.hrpayroll.domain.model.Worker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PaymentService {
    
    private final RestTemplate restTemplate;


    @Value("${hr-worker.host}")
    private String workerHost;
    
    public Payment getPayment(Long workerId, Integer days){
        Worker worker = getWorker(workerId); 
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
    
    private Worker getWorker(Long workerId) {
        Map<String, String> uriVariable = new HashMap<>();
        uriVariable.put("workerId", workerId.toString());
        return restTemplate.getForObject(workerHost, Worker.class, uriVariable);
    }

    public PaymentService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

  
}
