package com.example.mysqltodo.service;

import com.example.mysqltodo.model.Todo;
import com.example.mysqltodo.repository.TodoRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {

    private final TodoRepos todorepo;

    @Override
    public List<Todo> findAll() {
        return todorepo.findAll();
    }
    @Override
    public List<Todo> findAllActive(Boolean done) {
        return todorepo.findAllByDoneEquals(done);
    }

}
