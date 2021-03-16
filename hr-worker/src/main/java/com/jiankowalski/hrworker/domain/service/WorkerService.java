package com.jiankowalski.hrworker.domain.service;

import com.jiankowalski.hrworker.domain.exception.WorkerNotFound;
import com.jiankowalski.hrworker.domain.model.Worker;
import com.jiankowalski.hrworker.domain.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class WorkerService {

    private final WorkerRepository workerRepository;

    public WorkerService(WorkerRepository workerRepository) {
        this.workerRepository = workerRepository;
    }

    @Transactional
    public Worker add(Worker worker){
        return workerRepository.save(worker);
    }

    public Worker getWorker(Long workerId) {
        return workerRepository.findById(workerId)
                .orElseThrow(() -> new WorkerNotFound(workerId));
    }
}
