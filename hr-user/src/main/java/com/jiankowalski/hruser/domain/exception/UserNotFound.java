package com.jiankowalski.hruser.domain.exception;

import javax.persistence.NoResultException;

public class UserNotFound extends NoResultException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public UserNotFound(String email) {
        super(String.format("user not found for email %s", email));
    }

    public UserNotFound(Long Id) {
        super(String.format("user not found for id %s", Id));
    }
}