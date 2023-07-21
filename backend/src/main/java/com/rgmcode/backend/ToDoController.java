package com.rgmcode.backend;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ToDoController {

    private final ToDoServive todoService = new ToDoServive();

    @PostMapping("/todo")
    public void addToDo(@RequestBody ToDo todos){
        todoService.addToDo(todos);
    }

    @GetMapping("/todo")
    public List<ToDo> getAllTodos(){
        return todoService.getAllTodos();
    }


//    @PutMapping(path = {"{id}/update", "{id}"})
//    public ToDo update(@PathVariable String id, @RequestBody ToDo todo) {
//        return todoService.update(todo);
//    }

    @DeleteMapping("/delete/{id}")
    void delete(@PathVariable String id) {
        todoService.delete(id);
    }


}
