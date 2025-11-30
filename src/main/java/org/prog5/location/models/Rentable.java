package org.prog5.location.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.prog5.location.models.enums.Status;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public abstract sealed class Rentable permits Car, Computer, Bike {
    @Id
    protected String id;
    protected String name;
    protected String description;
    protected double pricePerDay;
    @Enumerated(EnumType.STRING)
    protected Status rentStatus;

}
