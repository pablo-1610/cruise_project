package fr.cruiseapp.api.model.entities;

import fr.cruiseapp.api.model.entities.commons.UUIDEntity;
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
public class Cruise extends UUIDEntity implements Serializable {
    @Column
    private String ownerId;

    @Column
    private String label;

    @Column
    private Integer price;

    @ManyToOne(cascade = CascadeType.ALL)
    private CruiseDescription description;

    @OneToMany
    private List<User> passengers;
}
