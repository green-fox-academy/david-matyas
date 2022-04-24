package com.gfa.todos.controller;

import com.gfa.todos.model.Todo;
import com.gfa.todos.repository.TodoRepos;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class ToDoController {
    private final TodoRepos todo;

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "This is my first Todo";
    }
    @GetMapping("/list")
    @ResponseBody
    public String list() {
        return "This is my first Todo";
    }
    @GetMapping("/todo")
    public String todo(Model model) {
        return "todo";
    }
}
