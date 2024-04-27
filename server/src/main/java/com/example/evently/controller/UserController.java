package com.example.evently.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.evently.model.UserModel;
import com.example.evently.service.UserService;

@CrossOrigin
@RestController
public class UserController {
   @Autowired
   UserService us;
   

   //fetchAllUsers.
   @GetMapping("/fetchAllUserDetails")
   public List<UserModel> fetchAllUserDetails() {
      return us.fetchAllUserDetails();
   }
  
  //fetchUserById.
   @GetMapping("/fetchUserById/{id}")
   public Optional<UserModel> fetchUserById(@PathVariable int id) {
      return us.fetchUserById(id);
   }
   
   //addUserDetails.
   @PostMapping("/addUserDetails")
   public UserModel addUserDetails(@RequestBody UserModel um) {
      return us.addUserDetails(um);
   }

   //UpdateUserById.
   @PutMapping("/updateUser")
   public UserModel updateUser(@RequestBody UserModel um) {
      return us.updateUser(um);
   }
  
   //deleteUserById
   @DeleteMapping("/deleteUserById/{id}")
   public boolean deleteUserById(@PathVariable int id) {
      return us.deleteUserById(id);
   }
}
