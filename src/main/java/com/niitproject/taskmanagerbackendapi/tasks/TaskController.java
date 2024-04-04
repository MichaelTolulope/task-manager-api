package com.niitproject.taskmanagerbackendapi.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("task-manager/api/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;


    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task){
        return new ResponseEntity<>(taskService.saveTask(task),HttpStatus.CREATED);
    }

    @GetMapping("tasksFor/{userId}")
    public ResponseEntity<List<Task>> getTasksByUserId(@PathVariable Long userId){
        return new ResponseEntity<>(taskService.getTaskById(userId), HttpStatus.OK) ;

    }
}
