package com.niitproject.taskmanagerbackendapi.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService{

    @Autowired
    TaskRepository taskRepository;

    public Task saveTask(Task task){

        return taskRepository.save(task);
    }

    public List<Task> getTaskById(Long userId){
        List<Task> tasksForUser = taskRepository.findByUserId(userId);

        return tasksForUser;

    }
}