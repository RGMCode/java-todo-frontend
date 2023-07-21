package com.rgmcode.backend;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ToDoRepo {

    private final List<ToDo> todos = new ArrayList<>();


    public void addToDo(ToDo todo){
        todos.add(todo);
    }

    public List<ToDo> getTodos(){
        return todos;
    }

    public void delete(String id) {
        todos.remove(id);
    }

}
