package fr.cruiseapp.api.model.repositories;

import fr.cruiseapp.api.model.entities.Cruise;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CruiseRepository extends JpaRepository<Cruise, String> {
}
