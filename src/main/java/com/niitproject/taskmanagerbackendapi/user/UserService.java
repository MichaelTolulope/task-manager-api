package com.niitproject.taskmanagerbackendapi.user;

import com.niitproject.taskmanagerbackendapi.tasks.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;


    public List<User> allUsers(){
        return userRepository.findAll();
    }

    public User singleUser(Long id){
        return userRepository.findById(id).get();
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public void deleteUser(Long id){
        userRepository.deleteById(id);

    }

    public void updateUser(Long id,User user){
        User userEntity = userRepository.findById(id).get();
            userEntity.setFirstName(user.getFirstName());
            userEntity.setLastName(user.getLastName());
            userEntity.setEmail(user.getEmail());
            userEntity.setDateOfBirth(user.getDateOfBirth());
            userRepository.save(userEntity);
    }



}
