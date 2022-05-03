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

    @Override
    public void addNew(Todo todo) {
       todorepo.save(todo);
    }

    @Override
    public void deleteTodo(Long id) {
        todorepo.deleteById(id);
    }

    @Override
    public Todo findTodo(Long id) {
        return todorepo.findById(id).get();
    }

    @Override
    public void updateTodo(Todo todo) {
        todorepo.save(todo);
    }
}
