package com.jiankowalski.hrworker.domain.repository;

import com.jiankowalski.hrworker.domain.model.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
