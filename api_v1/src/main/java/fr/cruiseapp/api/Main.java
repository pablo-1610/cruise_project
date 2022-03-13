package fr.cruiseapp.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("fr.cruiseapp.api.model.entities")
@EnableJpaRepositories("fr.cruiseapp.api.model.repositories")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
