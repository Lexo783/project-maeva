package com.strange_tape.project_maeva.repositories;

import com.strange_tape.project_maeva.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findOneWithRolesByLoginIgnoreCase(String login);
}