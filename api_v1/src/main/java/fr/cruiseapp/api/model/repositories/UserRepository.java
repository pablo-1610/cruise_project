package fr.cruiseapp.api.model.repositories;

import fr.cruiseapp.api.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, String> {
}
