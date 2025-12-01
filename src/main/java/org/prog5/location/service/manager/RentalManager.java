package org.prog5.location.service.manager;

import lombok.AllArgsConstructor;
import org.prog5.location.models.Rentable;
import org.prog5.location.models.Rental;
import org.prog5.location.models.RenterEntity;
import org.prog5.location.models.enums.RentalStatus;
import org.prog5.location.models.enums.Status;
import org.prog5.location.service.RentalService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.UUID;

@Service
@AllArgsConstructor
public class RentalManager {
    private final RentalService rentalService;

    public Rental rentItem(RenterEntity renter, Rentable item, LocalDate start, LocalDate end) {
        if (item.getRentStatus() != Status.IS_AVAILABLE) {
            throw new IllegalStateException("Item not available");
        }
        item.setRentStatus(Status.IS_RENTED);
        double days = Math.max(1, end.toEpochDay() - start.toEpochDay());
        double price = days * item.getPricePerDay();

        Rental rental = new Rental(UUID.randomUUID().toString(), renter, item, start, end, price, RentalStatus.ONGOING);
        return rentalService.save(rental);
    }

    public Rental returnItem(Rental rental) {
        rental.setStatus(RentalStatus.COMPLETED);
        Rentable item = rental.getRentedItem();
        item.setRentStatus(Status.IS_AVAILABLE);
        return rentalService.save(rental);
    }
}
