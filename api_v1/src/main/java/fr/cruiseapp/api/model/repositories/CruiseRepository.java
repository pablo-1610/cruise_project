package fr.cruiseapp.api.model.repositories;

import fr.cruiseapp.api.model.entities.Cruise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruiseRepository extends JpaRepository<Cruise, Long> {
}
