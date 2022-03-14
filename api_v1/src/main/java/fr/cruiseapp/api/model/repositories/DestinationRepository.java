package fr.cruiseapp.api.model.repositories;

import fr.cruiseapp.api.model.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinationRepository extends JpaRepository<Location, String> {
}
