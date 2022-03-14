package fr.cruiseapp.api.model.entities;

import fr.cruiseapp.api.model.entities.commons.AbstractEntity;
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
public class CruiseDescription extends AbstractEntity implements Serializable {
    @Column(name = "cruise_from")
    private String from;
    @Column
    private String ship;
    @ManyToOne
    private Destination destination;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date departure;
    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date arrival;
}
