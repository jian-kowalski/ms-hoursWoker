package com.jiankowalski.hrpayroll.api.controller;

import java.math.BigDecimal;

import com.jiankowalski.hrpayroll.api.assembler.PaymentAssembler;
import com.jiankowalski.hrpayroll.api.model.PaymentModel;
import com.jiankowalski.hrpayroll.domain.service.PaymentService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;
    private final PaymentAssembler paymentAssembler; 

    public PaymentController(PaymentService paymentService, PaymentAssembler paymentAssembler) {
        this.paymentService = paymentService;
        this.paymentAssembler = paymentAssembler;
    }
    
    @HystrixCommand(fallbackMethod = "getpPaymentAlternative")
    @GetMapping("/{workerId}/days/{days}")
    public PaymentModel getpPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        return paymentAssembler.toModel(paymentService.getPayment(workerId, days));
    }
    
    public PaymentModel getpPaymentAlternative(Long workerId, Integer days) {
        return paymentAssembler.toModel(paymentService.getpPaymentAlternative(workerId, days));
    }
    
    
}
