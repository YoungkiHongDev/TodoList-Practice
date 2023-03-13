package com.codepresso.todo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @GetMapping
    public String getTodoList() {
        return null;
    }

    @PostMapping
    public String addTodo() {
        return null;
    }

    @DeleteMapping
    public String deleteTodo() {
        return null;
    }
}
