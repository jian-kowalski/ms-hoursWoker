package com.jiankowalski.hrworker.api.assembler;

import com.jiankowalski.hrworker.api.Model.WorkerModel;
import com.jiankowalski.hrworker.domain.model.Worker;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class WorkerAssembler {

    private final ModelMapper modelMapper;

    public WorkerAssembler(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public WorkerModel toModel(Worker worker){
       return modelMapper.map(worker, WorkerModel.class);
    }

    public List<WorkerModel> toColletionModel(List<Worker> workers){
        return workers.stream().map(this::toModel).collect(Collectors.toList());
    }
}
