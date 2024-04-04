package com.niitproject.taskmanagerbackendapi.user;

import com.niitproject.taskmanagerbackendapi.tasks.Task;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.text.ParseException;
import java.util.List;
import java.util.Optional;

@RequestMapping(path = "task-manager/api/user")
@RestController
@Validated
public class UserController {
    @Autowired
    UserService userService;

//gets all users
    @GetMapping(value = "all")
    protected ResponseEntity<List<User>> getUsers(){

        return new ResponseEntity(userService.allUsers(), HttpStatus.OK);
    }

//gets a single user
    @GetMapping(path = "{Id}")
    protected ResponseEntity<User> getUser(@PathVariable("Id") Long Id){
        return new ResponseEntity<>( userService.singleUser(Id), HttpStatus.OK  );
    }
//creates a new user
    @PostMapping("/create-user")
    protected ResponseEntity<User> createUser(@Valid @RequestBody User newUser) throws ParseException{
        return new ResponseEntity<>(userService.saveUser(newUser),HttpStatus.CREATED);


    }
    @PutMapping("update/{Id}")
    public void updateUser(@RequestBody User newUser,@PathVariable("Id") Long Id) {
        userService.updateUser(Id,newUser);
        System.out.println("Updated user "+newUser.toString());
    }

    //add tasks
//    @PostMapping("tasks/add/{userId}")
//    protected void addTask(@RequestBody Task task, @PathVariable("userId") Long userId){
//        userService.addTask(task,userId);
//        System.out.println("task :"+task.getTaskName()+" has been added!");
//    }


//deletes a single user
    @DeleteMapping(path = "{userId}")
    public void deleteUser(@PathVariable("userId") Long userId){
        userService.deleteUser(userId);
        System.out.println("Deleted user with the id: "+userId);
    }
}
