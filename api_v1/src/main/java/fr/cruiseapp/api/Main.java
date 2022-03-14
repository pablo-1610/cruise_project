package fr.cruiseapp.api;

import fr.cruiseapp.api.model.entities.Cruise;
import fr.cruiseapp.api.model.entities.CruiseDescription;
import fr.cruiseapp.api.model.entities.Location;
import fr.cruiseapp.api.model.entities.User;
import fr.cruiseapp.api.model.repositories.CruiseRepository;
import fr.cruiseapp.api.model.repositories.DestinationRepository;
import fr.cruiseapp.api.model.repositories.UserRepository;
import lombok.val;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Collections;
import java.util.Date;

@SpringBootApplication
@EntityScan("fr.cruiseapp.api.model.entities")
@EnableJpaRepositories("fr.cruiseapp.api.model.repositories")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner init(DestinationRepository destinationRepository, UserRepository userRepository, CruiseRepository cruiseRepository) {
        return args -> {
            final val user = new User("pablo_1610", "pablo.zapata.dev@gmail.com", "test", "Pablo", "ZAPATA");
            userRepository.save(user);

            final val destination = new Location("MAD", "Madrid", "Spain", "Europe");
            destinationRepository.save(destination);

            final val cruise = new Cruise(user.getId(), "Le beau tour", 1500, new CruiseDescription(destination, destination, "Cargo", new Date(), new Date()), Collections.emptyList());
            cruiseRepository.save(cruise);
        };
    }
}
