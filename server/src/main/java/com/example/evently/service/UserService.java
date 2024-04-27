package com.example.evently.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evently.model.UserModel;
import com.example.evently.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository ur;

    public List<UserModel> fetchAllUserDetails() {
        return ur.findAll();
    };

    public UserModel addUserDetails(UserModel um) {
        return ur.save(um);
    }

    public Optional<UserModel> fetchUserById(int id) {
        return ur.findById(id);
    }

    public UserModel updateUser(UserModel um){
        return ur.save(um);
    }

    public boolean deleteUserById(int id){
        try {
            ur.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
