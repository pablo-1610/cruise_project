package fr.cruiseapp.api.controller;

import fr.cruiseapp.api.type.HTTPAuth;
import fr.cruiseapp.api.model.repositories.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class AuthController {
    private final UserRepository userRepository;

    public AuthController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping(path = "/auth/login",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> login(HttpServletRequest request, HttpServletResponse response, @RequestBody HTTPAuth auth) {
        final var userFound = userRepository.findAll().stream().filter(u -> u.getEmail().equals(auth.getEmail())).findFirst().orElse(null);
        if (userFound == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        if (userFound.getPassword().equals(auth.getPassword())) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(userFound.getAuthToken());
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Wrong password");
        }
    }
}
