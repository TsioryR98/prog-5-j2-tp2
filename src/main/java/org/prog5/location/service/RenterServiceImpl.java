package org.prog5.location.service;

import lombok.AllArgsConstructor;
import org.prog5.location.models.Renter;
import org.prog5.location.models.RenterEntity;
import org.prog5.location.repository.RenterRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class RenterServiceImpl implements RenterService{
    private final RenterRepository renterRepository;

    @Override
    public RenterEntity save(RenterEntity renterEntity) {
        return renterRepository.save(renterEntity);
    }

    @Override
    public Optional<RenterEntity> findById(String id) {
        return renterRepository.findById(id);
    }

    @Override
    public List<RenterEntity> findAll() {
        return renterRepository.findAll();
    }
}
