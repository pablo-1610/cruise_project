package fr.cruiseapp.api.model.entities;

import fr.cruiseapp.api.model.entities.commons.UUIDEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table
public class CruiseDescription extends UUIDEntity implements Serializable {
    @ManyToOne(cascade = CascadeType.ALL)
    private Location cruise_from;
    @ManyToOne(cascade = CascadeType.ALL)
    private Location cruise_to;
    @Column
    private String cruise_ship;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date cruise_departure;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date cruise_arrival;
}
