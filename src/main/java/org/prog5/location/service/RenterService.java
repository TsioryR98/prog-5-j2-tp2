package org.prog5.location.service;

import org.prog5.location.models.RenterEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RenterService {
    RenterEntity save(RenterEntity renterEntity);

    Optional<RenterEntity> findById(String id);

    List<RenterEntity> findAll();
}
