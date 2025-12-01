package org.prog5.location.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.prog5.location.models.enums.RentalStatus;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Rental {
    @Id
    private String id;
    @ManyToOne
    @JoinColumn(name = "renter_id")
    private RenterEntity renter;
    @ManyToOne
    @JoinColumn(name = "rented_item_id")
    private Rentable rentedItem;
    private LocalDate startDate;
    private LocalDate endDate;
    private double calculatedPrice;

    @Enumerated(EnumType.STRING)
    private RentalStatus status;
}
