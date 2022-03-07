package fr.pablozapata.cruiseapp.api.controller;

import fr.pablozapata.cruiseapp.api.model.CruiseModel;
import fr.pablozapata.cruiseapp.api.repository.CruiseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class CruiseController {
    private final CruiseRepository repository;

    CruiseController(CruiseRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cruises")
    List<CruiseModel> all() {
        return Collections.emptyList();
    }
}
