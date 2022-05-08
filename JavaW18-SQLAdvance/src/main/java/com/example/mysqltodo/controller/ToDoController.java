package com.example.mysqltodo.controller;

import com.example.mysqltodo.model.Todo;
import com.example.mysqltodo.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class ToDoController {
    // private final TodoRepos todorepo;
    private final TodoService todoservice;

    @GetMapping(value = {"/todo","/"})
    public String todoList(Model model) {
        model.addAttribute("todos", todoservice.findAll());
        return "todo";
    }

//    @GetMapping(value = "/search")
//    public String searchTodo(Model model,
//                                 @RequestParam String search) {
//        model.addAttribute("todos", todoservice.searchInTitle(search));
//        return "todo";
//    }

    @GetMapping(value = "/todo", params = "done")
    public String todoListActive(Model model,
                                 @RequestParam boolean done) {
        model.addAttribute("todos", todoservice.findAllActive(done));
        return "todo";
    }

    @GetMapping(value = "/newtodo")
    public String newTodoForm(@ModelAttribute Todo todo) {
        return "newtodo";
    }

    @PostMapping(value = "/newtodo")
    public String addTodo(@ModelAttribute Todo todo) {
        todoservice.addNew(todo);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/delete")
    public String deleteTodo(@PathVariable Long id) {
        todoservice.deleteTodo(id);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edit")
    public String findTodo(Model model,
                           @PathVariable Long id) {
        model.addAttribute("todo", todoservice.findTodo(id));
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String updateTodo(@ModelAttribute Todo todo) {
        todoservice.updateTodo(todo);
        return "redirect:/todo";

    }

//
//    @GetMapping("/todos2")
//    public List<String> listAll() {
//        return todoservice.findAll().stream()
//                .map(Todo::getTitle)
//                .collect(Collectors.toList());
//    }

}
