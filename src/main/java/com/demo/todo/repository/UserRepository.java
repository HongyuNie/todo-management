package com.demo.todo.repository;

import com.demo.todo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserName(String name);

    Boolean existByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);
}
