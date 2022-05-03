package com.example.mysqltodo.service;

import com.example.mysqltodo.model.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TodoService {

    List<Todo> findAll();
    List<Todo> findAllActive(Boolean done);
}
