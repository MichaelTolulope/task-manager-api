package com.niitproject.taskmanagerbackendapi.tasks;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.niitproject.taskmanagerbackendapi.user.User;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.sql.Date;
import java.time.LocalTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name = "Task")
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
private int taskId;
    @Column(
            name = "task-name",
            updatable = false,
            columnDefinition = "TEXT"
    )
private String taskName;
    @Column(
            name = "task-description",
            nullable = false,
            columnDefinition = "TEXT"
    )
private String taskDescription;
    @Column(
            name = "task-category",
            nullable = false,
            columnDefinition = "TEXT"
    )
private String category;
    @Column(
            name = "task-status",
            nullable = false,
            columnDefinition = "TEXT"
    )
private String status;

@Column(
        name = "time-created",
        nullable = false,
        columnDefinition = "TIME"
)
private LocalTime createdAt;


    @Column(
            name = "task-creation-date",
            nullable = false,
            columnDefinition = "TIMESTAMP"
    )
private Date taskCreationDate;


    @Column(
            name = "task-end-time",
            nullable = false,
            columnDefinition = "TIME"
    )
private LocalTime taskEndTime;


    @Column(
            name = "task-end-date",
            nullable = false,
            columnDefinition = "TIMESTAMP"
    )
private Date taskEndDate;

    @Column(
            name = "user-id",
            nullable = false
    )
private Long userId;



    public Task() {
    }

    public Task(int taskId, String taskName, String taskDescription, String category, String status, LocalTime createdAt, Date taskCreationDate, LocalTime taskEndTime, Date taskEndDate, Long userId) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.category = category;
        this.status = status;
        this.createdAt = createdAt;
        this.taskCreationDate = taskCreationDate;
        this.taskEndTime = taskEndTime;
        this.taskEndDate = taskEndDate;
        this.userId = userId;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalTime createdAt) {
        this.createdAt = createdAt;
    }

    public Date getTaskCreationDate() {
        return taskCreationDate;
    }

    public void setTaskCreationDate(Date taskCreationDate) {
        this.taskCreationDate = taskCreationDate;
    }

    public LocalTime getTaskEndTime() {
        return taskEndTime;
    }

    public void setTaskEndTime(LocalTime taskEndTime) {
        this.taskEndTime = taskEndTime;
    }

    public Date getTaskEndDate() {
        return taskEndDate;
    }

    public void setTaskEndDate(Date taskEndDate) {
        this.taskEndDate = taskEndDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
