package org.prog5.location.service;

import lombok.AllArgsConstructor;
import org.prog5.location.models.Rentable;
import org.prog5.location.repository.RentableRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class RentableServiceImpl implements RentableService{
    private final RentableRepository rentableRepository;
    @Override
    public Rentable save(Rentable rentable) {
        return rentableRepository.save(rentable);
    }

    @Override
    public Optional<Rentable> findById(String id) {
        return rentableRepository.findById(id);
    }

    @Override
    public List<Rentable> findAll() {
        return rentableRepository.findAll();
    }
}
