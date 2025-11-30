package org.prog5.location.models;

import lombok.Getter;

public interface Renter {
    String getId();
    String getName();
    String rent(Rentable item);
    String returnItem(Rentable item);


}
