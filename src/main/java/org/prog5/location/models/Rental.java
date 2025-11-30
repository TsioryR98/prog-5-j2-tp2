package org.prog5.location.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.prog5.location.models.enums.RentalStatus;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
public class Rental {

    private String id;
    private RenterEntity renter;
    private Rentable rentedItem;
    private LocalDate startDate;
    private LocalDate endDate;
    private double calculatedPrice;
    private RentalStatus status;
}
