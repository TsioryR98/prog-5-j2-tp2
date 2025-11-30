package org.prog5.location.models;

public final class Computer extends Rentable {

    public Computer(String id, String name, String description, double pricePerDay, Status rentStatus) {
        super(id, name, description, pricePerDay, rentStatus);
    }
}
