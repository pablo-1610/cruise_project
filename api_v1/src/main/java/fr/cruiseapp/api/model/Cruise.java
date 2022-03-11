package fr.cruiseapp.api.model;

import fr.cruiseapp.api.type.CruiseDescription;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Cruise implements Serializable {
    @Id
    @Column
    @GeneratedValue
    private Long id;

    @Column
    private Long ownerId;

    @Column
    private String label;

    @Column
    private Integer price;

    @Column
    private CruiseDescription description;

    @OneToMany
    private List<User> passengers;
}
