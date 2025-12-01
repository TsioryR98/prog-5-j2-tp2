package org.prog5.location.controller;

import lombok.AllArgsConstructor;
import org.prog5.location.models.Rentable;
import org.prog5.location.models.Rental;
import org.prog5.location.models.RenterEntity;
import org.prog5.location.service.RentableService;
import org.prog5.location.service.RenterService;
import org.prog5.location.service.manager.RentalManager;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Optional;

@RestController
@RequestMapping("/api/rentals")
@AllArgsConstructor
public class RentalController {
    private final RentalManager manager;
    private final RenterService renterService;
    private final RentableService rentableService;

    @PostMapping("/rent")
    public ResponseEntity<Rental> rent(@RequestParam String renterId,
                                       @RequestParam String itemId,
                                       @RequestParam String start,
                                       @RequestParam String end) {

        Optional<RenterEntity> foundRenter = renterService.findById(renterId);
        Optional<Rentable> itemFindRental = rentableService.findById(itemId);

        if (foundRenter.isEmpty() || itemFindRental.isEmpty()) return ResponseEntity.badRequest().build();

        Rental rental = manager.rentItem(foundRenter.get(), itemFindRental.get(), LocalDate.parse(start), LocalDate.parse(end));
        return ResponseEntity.ok(rental);
    }
}
