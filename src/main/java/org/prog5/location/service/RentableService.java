package org.prog5.location.service;

import org.prog5.location.models.Rentable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RentableService {
    Rentable save(Rentable rentable);
    Optional<Rentable> findById(String id);
    List<Rentable> findAll();
}
