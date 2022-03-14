package fr.cruiseapp.api.model.repositories;

import fr.cruiseapp.api.model.entities.CruiseDescription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CruiseDescriptionRepository extends JpaRepository<CruiseDescription, String> {
}
