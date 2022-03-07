package fr.pablozapata.cruiseapp.api.repository;

import fr.pablozapata.cruiseapp.api.model.CruiseModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CruiseRepository extends JpaRepository<CruiseModel, Long> {
}
