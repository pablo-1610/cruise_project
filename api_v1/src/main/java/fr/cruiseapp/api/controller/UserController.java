package fr.cruiseapp.api.controller;

import fr.cruiseapp.api.model.entities.User;
import fr.cruiseapp.api.model.repositories.UserRepository;
import fr.cruiseapp.api.security.AuthTokenManager;
import lombok.val;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;

@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User.SecuredUser> getUser(@PathVariable String id) {
        final var user = userRepository.findById(id).orElse(null);
        if (user == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        user.setAuthToken(null);
        return ResponseEntity.status(HttpStatus.OK).body(new User.SecuredUser(user));
    }

    @GetMapping("/users")
    public List<User.SecuredUser> getAllUsers() {
        System.out.println("Users get");
        List<User.SecuredUser> users = new ArrayList<>();
        userRepository.findAll().forEach(user -> {
            users.add(new User.SecuredUser(user));
        });
        return users;
    }

    @PostMapping(path = "/users",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> create(@RequestBody User newUser) {
        User user = newUser;
        if (userRepository.findAll().stream().filter(u -> u.getEmail().equals(user.getEmail())).findFirst().orElse(null) != null) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, "User already exists");
        }
        userRepository.save(user);
        if (user == null) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Error while creating user");
        } else {
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        }
    }
}
