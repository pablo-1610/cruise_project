package fr.cruiseapp.api.model.entities;

import fr.cruiseapp.api.model.entities.commons.UUIDEntity;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User extends UUIDEntity implements Serializable {
    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private Integer permission = 0;

    @Column
    private String authToken = UUID.randomUUID().toString();

    public User(String username, String email, String password, String firstName, String lastName) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Getter
    @Setter
    public static class SecuredUser {
        private String username;
        private String email;
        private String firstName;
        private String lastName;
        private Integer permission;

        public SecuredUser(User user) {
            this.username = user.getUsername();
            this.email = user.getEmail();
            this.firstName = user.getFirstName();
            this.lastName = user.getLastName();
            this.permission = user.getPermission();
        }
    }
}
