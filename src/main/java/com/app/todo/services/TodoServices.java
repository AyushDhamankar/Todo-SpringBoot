package com.app.todo.services;

import java.util.List;

import com.app.todo.model.TodoModel;

public interface TodoServices {
    public String addTask(TodoModel todoModel);
    public List<TodoModel> getTasks();
}
