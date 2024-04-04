package com.niitproject.taskmanagerbackendapi;

import com.niitproject.taskmanagerbackendapi.tasks.Task;
import com.niitproject.taskmanagerbackendapi.tasks.TaskStatus;
import com.niitproject.taskmanagerbackendapi.user.User;
import com.niitproject.taskmanagerbackendapi.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Date;


@Configuration
@SpringBootApplication
public class TaskManagerBackendApiApplication{

	public static void main(String[] args) {
		SpringApplication.run(TaskManagerBackendApiApplication.class, args);
	}

	@Autowired
	UserRepository userRepository;


//	@Override
//	public void run(String... args) throws Exception {
//		Date date1 = new Date(2002-03-03);
//
//		User user1 = new User("Michael","Olagunju",date1,"olagunjum99@gmail.com","michael1234");
//
//		Task task1 = new Task("do something","i want to do something","work", TaskStatus.Pending,date1,date1);
//		Task task2 = new Task("do something else","i want to do something else","pla", TaskStatus.Pending,date1,date1);
//		Task task3 = new Task("pick up ","pick up something from the store","work", TaskStatus.Pending,date1,date1);
//		Task task4 = new Task("buy some goodies","going to the mall to get some things","pla", TaskStatus.Pending,date1,date1);
//
//		user1.addTask(task1);
//		user1.addTask(task2);
//		user1.addTask(task3);
//		user1.addTask(task4);
//	}
}
