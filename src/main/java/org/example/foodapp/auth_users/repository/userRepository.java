package org.example.foodapp.auth_users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository {


    Optional<User> findByEmail(String email);
    boolean existsByEmail(String email);
}
