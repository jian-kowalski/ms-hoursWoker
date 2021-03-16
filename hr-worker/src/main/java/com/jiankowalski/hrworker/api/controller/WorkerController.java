package com.jiankowalski.hrworker.api.controller;

import com.jiankowalski.hrworker.api.Model.WorkerModel;
import com.jiankowalski.hrworker.api.assembler.WorkerAssembler;
import com.jiankowalski.hrworker.domain.model.Worker;
import com.jiankowalski.hrworker.domain.repository.WorkerRepository;
import com.jiankowalski.hrworker.domain.service.WorkerService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private final ModelMapper modelMapper;
    private final WorkerService workerService;
    private final WorkerRepository workerRepository;
    private final WorkerAssembler workerAssembler;

    public WorkerController(ModelMapper modelMapper, WorkerService workerService, WorkerRepository workerRepository, WorkerAssembler workerAssembler) {
        this.modelMapper = modelMapper;
        this.workerService = workerService;
        this.workerRepository = workerRepository;
        this.workerAssembler = workerAssembler;
    }

    @GetMapping
    public List<WorkerModel> all(){
        return workerAssembler.toColletionModel(workerRepository.findAll());
    }

    @GetMapping("/workerId")
    public WorkerModel get(@PathVariable Long workerId){
        return workerAssembler.toModel(workerService.getWorker(workerId));
    }

}
