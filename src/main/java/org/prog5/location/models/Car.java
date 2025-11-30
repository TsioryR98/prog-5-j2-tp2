package org.prog5.location.models;

public final class Car extends Rentable {
    public Car(String id, String name, String description, double pricePerDay, Status rentStatus) {
        super(id, name, description, pricePerDay, rentStatus);
    }
}
