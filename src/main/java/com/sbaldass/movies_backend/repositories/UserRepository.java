package com.sbaldass.movies_backend.repositories;

import com.sbaldass.movies_backend.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
