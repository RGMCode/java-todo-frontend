package com.rgmcode.backend;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoServive {

    private ToDoRepo todoRepo = new ToDoRepo();

    public void addToDo(ToDo todos){
        todoRepo.addToDo(todos);
    }

    public List<ToDo> getAllTodos(){
        return todoRepo.getTodos();
    }

    public void delete(String id) {
        todoRepo.delete(id);
    }

}
