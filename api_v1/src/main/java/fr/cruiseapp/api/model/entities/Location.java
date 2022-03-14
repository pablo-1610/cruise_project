package fr.cruiseapp.api.model.entities;

import fr.cruiseapp.api.model.entities.commons.UUIDEntity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Location extends UUIDEntity implements Serializable {
    @Column(length = 3, unique = true)
    private String shortCode;

    @Column
    private String city;

    @Column
    private String country;

    @Column
    private String continent;
}
