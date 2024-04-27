package com.example.evently.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evently.model.UserModel;



@Repository
public interface UserRepository extends JpaRepository<UserModel,Integer> {
     
}
