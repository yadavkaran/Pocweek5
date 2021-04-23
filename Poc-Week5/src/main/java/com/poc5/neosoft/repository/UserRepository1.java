package com.poc5.neosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.poc5.neosoft.model.User;

@Repository
public interface UserRepository1 extends JpaRepository<User, Long>{

}

