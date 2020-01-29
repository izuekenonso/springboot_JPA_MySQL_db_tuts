package com.example.db.springbootmysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.db.springbootmysql.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{

}
