package com.jiankowalski.hrworker.domain.service;

import com.jiankowalski.hrworker.domain.exception.WorkerNotFound;
import com.jiankowalski.hrworker.domain.model.Worker;
import com.jiankowalski.hrworker.domain.repository.WorkerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

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

    public List<Worker> findAllWorkers() {
        return workerRepository.findAll();
    }

    public Worker findWorkerByID(Long workerId) {
        return workerRepository.findById(workerId)
                .orElseThrow(() -> new WorkerNotFound(workerId));
    }
}
