package org.prog5.location.service;

import org.prog5.location.models.Rental;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface RentalService {
    Rental save(Rental rental);
    Optional<Rental> findById(String id);
}
