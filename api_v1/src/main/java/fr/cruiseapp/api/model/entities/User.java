package fr.cruiseapp.api.model.entities;

import fr.cruiseapp.api.model.entities.commons.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User extends AbstractEntity implements Serializable {
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
    private String authToken;
}
