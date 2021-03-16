package com.jiankowalski.hrpayroll.domain.service;

import java.math.BigDecimal;

import com.jiankowalski.hrpayroll.domain.model.Payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    public Payment getPayment(Long workerId, Integer days){
        return new Payment("Bob", BigDecimal.valueOf(200.0), days);
    }
}
