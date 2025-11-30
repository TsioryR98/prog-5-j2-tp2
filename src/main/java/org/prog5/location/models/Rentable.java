package org.prog5.location.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
@EqualsAndHashCode
@Getter
@AllArgsConstructor
public abstract sealed class Rentable permits Car, Computer, Bike {
    protected String id;
    protected String name;
    protected String description;
    protected double pricePerDay;
    protected Status rentStatus;

}
