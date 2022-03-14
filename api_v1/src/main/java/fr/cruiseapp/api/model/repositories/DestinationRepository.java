package fr.cruiseapp.api.model.repositories;

import fr.cruiseapp.api.model.entities.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DestinationRepository extends JpaRepository<Destination, String> {
}
