package fr.cruiseapp.api.repository;

import fr.cruiseapp.api.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, Long> {
}
