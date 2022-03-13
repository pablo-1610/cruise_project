package fr.cruiseapp.api.controller;

import fr.cruiseapp.api.model.repositories.CruiseRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CruiseController {
    private final CruiseRepository repository;

    public CruiseController(CruiseRepository repository) {
        this.repository = repository;
    }
}
