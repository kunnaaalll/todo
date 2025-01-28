package com.example.todo.controller;


import com.example.todo.entity.Tasks;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping
public class todoController {

    private Map<Long , Tasks> tasks = new HashMap<>();

    @GetMapping
    public List<Tasks> getAll() {
        return  new ArrayList<>(tasks.values());
    }

    @PostMapping
    public boolean createTask(@RequestBody Tasks newTask) {
        tasks.put(newTask.getId(), newTask);
        return true;
    }

    @GetMapping("/id/{id}")
    public Tasks findTaskById(@PathVariable long id) {
        return tasks.get(id);
    }

    @DeleteMapping("/id/{id}")
    public Tasks deleteTask(@PathVariable long id) {
        return tasks.remove(id);
    }

    @PutMapping("/id/{id}")
    public Tasks updateTask(@PathVariable long id, @RequestBody Tasks newTask) {
        return tasks.put(id, newTask);
    }
}
