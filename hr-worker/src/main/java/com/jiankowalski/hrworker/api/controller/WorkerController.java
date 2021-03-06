package com.jiankowalski.hrworker.api.controller;

import com.jiankowalski.hrworker.api.Model.WorkerModel;
import com.jiankowalski.hrworker.api.assembler.WorkerAssembler;
import com.jiankowalski.hrworker.domain.service.WorkerService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workers")
public class WorkerController {

    private static Logger logger = LoggerFactory.getLogger(WorkerController.class);

    private final Environment env;
    private final WorkerService workerService;
    private final WorkerAssembler workerAssembler;
    
    public WorkerController(WorkerService workerService, WorkerAssembler workerAssembler, Environment env) {
        this.workerService = workerService;
        this.workerAssembler = workerAssembler;
        this.env = env;
    }

    @GetMapping
    public List<WorkerModel> all(){
        return workerAssembler.toColletionModel(workerService.findAllWorkers());
    }

    @GetMapping("/{workerId}")
    public WorkerModel findById(@PathVariable Long workerId){
        logger.info(String.format("PORT = %s", env.getProperty("local.server.port")));
        return workerAssembler.toModel(workerService.findWorkerByID(workerId));
    }

}
