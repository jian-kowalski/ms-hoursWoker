package com.jiankowalski.hrpayroll.api.assembler;

import com.jiankowalski.hrpayroll.api.model.PaymentModel;
import com.jiankowalski.hrpayroll.domain.model.Payment;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PaymentAssembler {

    private final ModelMapper modelMapper;

    public PaymentAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public PaymentModel toModel(Payment payment) {
        return modelMapper.map(payment, PaymentModel.class);
    }
    
}
