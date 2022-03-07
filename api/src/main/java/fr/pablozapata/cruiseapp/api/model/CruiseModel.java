package fr.pablozapata.cruiseapp.api.model;

import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Entity
public class CruiseModel {
    private @Id
    @GeneratedValue
    Long id;
    private String name;
    private String description;
    private String imageURL;

    public CruiseModel(String name, String description, String imageURL) {
        this.name = name;
        this.description = description;
        this.imageURL = imageURL;
    }

    public CruiseModel() {

    }
}
