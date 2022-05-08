package com.example.mysqltodo.service;

import com.example.mysqltodo.model.Assignee;

import java.util.List;

public interface AssigneeService {
    List<Assignee> findAll();
}
