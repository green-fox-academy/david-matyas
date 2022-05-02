package com.example.mysqltodo.controller;

import com.example.mysqltodo.model.Todo;
import com.example.mysqltodo.repository.TodoRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequiredArgsConstructor
public class ToDoController {
    private final TodoRepos todorepo;

    @GetMapping("/todo")
            public String todoList(Model model)
    {
        model.addAttribute("todos",todorepo.findAll());
        return "todo";
    }


    @GetMapping("/todos2")
    public List<String> listAll() {
        return todorepo.findAll().stream()
                .map(Todo::getTitle)
                .collect(Collectors.toList());
    }

}
