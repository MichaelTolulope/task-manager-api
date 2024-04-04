package com.niitproject.taskmanagerbackendapi.user;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.niitproject.taskmanagerbackendapi.tasks.Task;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity(name="User")
@Table(
        name = "user",
        uniqueConstraints = {
                @UniqueConstraint(name = "user-email-unique", columnNames = "email")
        }
)

public class User {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long id;

    @Column(
            name = "first-name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @NotBlank(message = "firstName field cannot be blank!")
    private String firstName;

    @Column(
            name = "last-name",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @NotBlank(message = "lastName field cannot be blank!")
    private String lastName;

    @Column(
            name = "date-of-birth",
            nullable = false,
            columnDefinition = "DATE"
    )

    private java.sql.Date DateOfBirth;

    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "TEXT"
    )
    @NotBlank
    @Email
    private String email;

    @Column(
            name = "password",
            nullable = false,
            columnDefinition = "TEXT"
    )

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @NotBlank(message = "password field cannot be blank!")
    @Min()
    private String password;


    public User() {
    }

    public User(String firstName, String lastName, java.sql.Date dateOfBirth, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        DateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.sql.Date getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(java.sql.Date dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
