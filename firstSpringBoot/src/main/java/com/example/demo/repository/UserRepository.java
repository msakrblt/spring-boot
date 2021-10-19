package com.example.demo.repository;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //bunun bir repository interface i olduğunu belirtir database işlemleri gerçekleştirilir bunu JPA yapar
//JPA -> Java Persistence API
public interface UserRepository extends JpaRepository<User, Long> {
}
