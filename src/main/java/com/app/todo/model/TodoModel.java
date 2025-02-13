package com.app.todo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TodoModel {
    private int id;
    private String taskName;
    private String taskDescription;
}