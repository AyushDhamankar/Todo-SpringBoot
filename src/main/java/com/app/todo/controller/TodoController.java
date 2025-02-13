package com.app.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.app.todo.model.TodoModel;
import com.app.todo.services.TodoServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@CrossOrigin("https://todo-springboot.netlify.app/")
public class TodoController {
    @Autowired
    private TodoServices todoServices;

    @PostMapping("/add")
    public String addTask(@RequestBody TodoModel todoModel) {
        return todoServices.addTask(todoModel);
    }
    
    @GetMapping("/tasks")
    public List<TodoModel> getTasks() {
        return todoServices.getTasks();
    }
    
}
