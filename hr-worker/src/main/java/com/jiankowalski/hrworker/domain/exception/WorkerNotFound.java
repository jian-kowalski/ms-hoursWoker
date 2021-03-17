package com.jiankowalski.hrworker.domain.exception;

import javax.persistence.NoResultException;

public class WorkerNotFound extends NoResultException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public WorkerNotFound(Long workerId) {
        super(String.format("worker not found for code %d", workerId));
    }
}
