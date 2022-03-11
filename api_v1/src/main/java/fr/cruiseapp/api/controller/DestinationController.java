package fr.cruiseapp.api.controller;

import fr.cruiseapp.api.repository.DestinationRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DestinationController {
    private final DestinationRepository repository;

    public DestinationController(DestinationRepository repository) {
        this.repository = repository;
    }
}
