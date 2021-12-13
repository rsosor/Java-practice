package com.rsosor.practice.service;

import com.rsosor.practice.exception.EntityNotFoundException;
import com.rsosor.practice.utils.Issue;

public class IssueService {

    public Issue queryById(Long id) throws EntityNotFoundException {
        throw new EntityNotFoundException(id);
    }
}
