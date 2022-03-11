package fr.cruiseapp.api.repository;

import fr.cruiseapp.api.model.Destination;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Destination, String> {
}
