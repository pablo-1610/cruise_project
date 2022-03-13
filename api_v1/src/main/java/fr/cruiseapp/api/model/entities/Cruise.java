package fr.cruiseapp.api.model.entities;

import fr.cruiseapp.api.model.entities.commons.AbstractEntity;
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
public class Cruise extends AbstractEntity implements Serializable {
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
