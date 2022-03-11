package fr.cruiseapp.api.model;

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
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Destination implements Serializable {
    @Id
    @Column(length = 3)
    private String shortCode;

    @Column
    private String city;

    @Column
    private String country;

    @Column
    private String continent;
}
