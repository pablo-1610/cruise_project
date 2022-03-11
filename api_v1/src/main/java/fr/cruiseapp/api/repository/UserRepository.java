package fr.cruiseapp.api.repository;

import fr.cruiseapp.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
