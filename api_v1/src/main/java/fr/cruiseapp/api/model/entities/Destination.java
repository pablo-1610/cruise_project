package fr.cruiseapp.api.model.entities;

import fr.cruiseapp.api.model.entities.commons.AbstractEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Destination extends AbstractEntity implements Serializable {
    @Column(length = 3, unique = true)
    private String shortCode;

    @Column
    private String city;

    @Column
    private String country;

    @Column
    private String continent;
}
