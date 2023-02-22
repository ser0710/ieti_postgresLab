package edu.escuelaing.ieti.demo.repository;

import edu.escuelaing.ieti.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
