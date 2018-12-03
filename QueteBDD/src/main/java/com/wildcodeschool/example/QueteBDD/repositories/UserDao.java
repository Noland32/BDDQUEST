package com.wildcodeschool.example.QueteBDD.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.example.QueteBDD.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}