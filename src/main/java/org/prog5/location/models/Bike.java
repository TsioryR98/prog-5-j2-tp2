package org.prog5.location.models;

import lombok.Getter;
import lombok.Setter;
import org.prog5.location.models.enums.Status;
@Getter
@Setter
public final class Bike extends Rentable{
    private String brand;
    private String model;
    public Bike(String id, String name, String description, double pricePerDay, Status rentStatus) {
        super(id, name, description, pricePerDay, rentStatus);
    }
}
