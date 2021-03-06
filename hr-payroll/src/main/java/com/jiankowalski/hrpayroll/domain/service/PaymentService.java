package com.jiankowalski.hrpayroll.domain.service;

import java.math.BigDecimal;

import com.jiankowalski.hrpayroll.api.model.WorkerModel;
import com.jiankowalski.hrpayroll.domain.feignclients.WorkerFeignClients;
import com.jiankowalski.hrpayroll.domain.model.Payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    
    private final WorkerFeignClients WorkerFeignClients;
    
    public Payment getPayment(Long workerId, Integer days){
        WorkerModel worker = WorkerFeignClients.findById(workerId); 
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
    
    public PaymentService(WorkerFeignClients workerFeignClients) {
        WorkerFeignClients = workerFeignClients;
    }

    public Payment getpPaymentAlternative(Long workerId, Integer days) {
        return new Payment("Jian", BigDecimal.valueOf(200.0), days);
    }

}
