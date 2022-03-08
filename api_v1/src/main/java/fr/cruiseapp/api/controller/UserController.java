package fr.cruiseapp.api.controller;

import fr.cruiseapp.api.model.UserModel;
import fr.cruiseapp.api.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.rmi.ServerException;
import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<UserModel> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserModel> getUser(@PathVariable Long id) {
        System.out.println("Requested user id: " + id);
        final var user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }

    @PostMapping(path = "/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserModel> create(@RequestBody UserModel newUser) {
        UserModel user = newUser;
        if (newUser.getAuthToken() == null) {
            user.setAuthToken(generateAuthToken());
        }
        userRepository.save(user);
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error while creating user");
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }

    private String generateAuthToken() {
        return java.util.UUID.randomUUID().toString();
    }
}
