package com.example.mysqltodo.service;

import com.example.mysqltodo.model.Todo;

import java.util.List;


public interface TodoService {

    List<Todo> findAll();
    List<Todo> findAllActive(Boolean done);
    public void addNew(Todo todo);
    public void deleteTodo(Long id);
    Todo findTodo(Long id);
    public void updateTodo(Todo todo);
}
