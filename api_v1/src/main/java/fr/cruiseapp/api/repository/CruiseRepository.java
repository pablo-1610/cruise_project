package fr.cruiseapp.api.repository;

import fr.cruiseapp.api.model.Cruise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruiseRepository extends JpaRepository<Cruise, Long> {
}
