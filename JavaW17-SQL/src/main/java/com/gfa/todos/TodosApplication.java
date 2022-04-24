package com.gfa.todos;

import com.gfa.todos.repository.TodoRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class TodosApplication {
    private TodoRepos todoRepos;

    public static void main(String[] args) {
        SpringApplication.run(TodosApplication.class, args);
    }

}