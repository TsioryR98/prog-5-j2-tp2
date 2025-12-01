package org.prog5.location.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.prog5.location.models.enums.Status;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
public final class Bike extends Rentable{
    private String brand;
    private String model;
    public Bike(String id, String name, String description, double pricePerDay, Status rentStatus) {
        super(id, name, description, pricePerDay, rentStatus);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bike bike = (Bike) o;
        return Objects.equals(brand, bike.brand) && Objects.equals(model, bike.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, model);
    }
}
