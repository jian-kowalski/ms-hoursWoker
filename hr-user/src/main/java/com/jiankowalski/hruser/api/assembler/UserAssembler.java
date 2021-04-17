package com.jiankowalski.hruser.api.assembler;

import com.jiankowalski.hruser.api.model.UserModel;
import com.jiankowalski.hruser.domain.model.User;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserAssembler {
    
    private final ModelMapper modelMapper;

    public UserAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UserModel toModel(User user){
        return modelMapper.map(user, UserModel.class);
     }
}
