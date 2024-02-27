package com.spring.task9.repository;

import com.spring.task9.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    String findByUsername(String name);

    String findByEmail(String email);
}
