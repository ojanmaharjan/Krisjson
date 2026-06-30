package com.infodev.krisjson.login.user.repo;

import com.infodev.krisjson.login.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository <User, Long> {
    Optional<User> findByEmail(String email);
    boolean existsAllByEmail(String email);
}
