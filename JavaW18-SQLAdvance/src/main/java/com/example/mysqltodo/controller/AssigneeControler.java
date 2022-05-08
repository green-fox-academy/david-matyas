package com.example.mysqltodo.controller;

import com.example.mysqltodo.model.Assignee;
import com.example.mysqltodo.service.AssigneeService;
import com.example.mysqltodo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor

public class AssigneeControler {

    private final AssigneeService assigneeservice;


    @GetMapping(value = "/assignee")
    public String assigneeList(Model model) {
        model.addAttribute("assignees", assigneeservice.findAll());
        return "assignee";
    }

}
