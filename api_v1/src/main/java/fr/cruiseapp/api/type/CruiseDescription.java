package fr.cruiseapp.api.type;

import fr.cruiseapp.api.model.entities.Destination;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@AllArgsConstructor
@Getter
@Setter
public class CruiseDescription implements Serializable {
    private String from;
    private String ship;
    private Destination destination;
    private Date departure;
    private Date arrival;
}
