package org.prog5.location.models;

public interface Renter {
    String getId();
    String getName();
    String rent(Rentable item);
    String returnItem(Rentable item);


}
