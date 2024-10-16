package com.example.html.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.html.demo.model.User;


@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
    User findByUserId(int userId);

}
