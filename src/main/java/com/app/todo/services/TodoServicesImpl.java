package com.app.todo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.todo.entity.TodoEntity;
import com.app.todo.model.TodoModel;
import com.app.todo.repository.TodoRepository;

@Service
public class TodoServicesImpl implements TodoServices {
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public String addTask(TodoModel todoModel) {
        TodoEntity todoEntity = new TodoEntity();
        BeanUtils.copyProperties(todoModel, todoEntity);
        todoRepository.save(todoEntity);
        return "Task Added Successfully";
    }

    @Override
    public List<TodoModel> getTasks() {
        List<TodoEntity> todoEntities = todoRepository.findAll();
        List<TodoModel> todoModels = new ArrayList<>();

        for (TodoEntity todoEntity : todoEntities) {
            TodoModel todoModel = new TodoModel();
            todoModel.setId(todoEntity.getId());
            todoModel.setTaskName(todoEntity.getTaskName());
            todoModel.setTaskDescription(todoEntity.getTaskDescription());
            todoModels.add(todoModel);
        }

        return todoModels;
    }
}
