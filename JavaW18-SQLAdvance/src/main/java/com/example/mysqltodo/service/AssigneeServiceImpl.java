package com.example.mysqltodo.service;

import com.example.mysqltodo.model.Assignee;
import com.example.mysqltodo.repository.AssigneeRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AssigneeServiceImpl implements AssigneeService{

    private final AssigneeRepo assigneerepo;
    @Override
    public List<Assignee> findAll() {
        return assigneerepo.findAll();
    }
}
