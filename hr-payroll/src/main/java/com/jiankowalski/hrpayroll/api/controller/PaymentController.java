package com.jiankowalski.hrpayroll.api.controller;

import com.jiankowalski.hrpayroll.api.assembler.PaymentAssembler;
import com.jiankowalski.hrpayroll.api.model.PaymentModel;
import com.jiankowalski.hrpayroll.domain.service.PaymentService;

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
    
    @GetMapping("/{workerId}/days/{days}")
    public PaymentModel getpPayment(@PathVariable Long workerId, @PathVariable Integer days) {
        return paymentAssembler.toModel(paymentService.getPayment(workerId, days));
    }

    
    
}
