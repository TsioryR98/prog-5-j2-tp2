package org.prog5.location.service;

import lombok.AllArgsConstructor;
import org.prog5.location.models.Rental;
import org.prog5.location.repository.RentalRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class RentalServiceImpl implements RentalService{
    private final RentalRepository rentalRepository;
    @Override
    public Rental save(Rental rental) {
        return rentalRepository.save(rental);
    }

    @Override
    public Optional<Rental> findById(String id) {
        return rentalRepository.findById(id);
    }
}
