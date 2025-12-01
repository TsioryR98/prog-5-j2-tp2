package org.prog5.location.repository;

import org.prog5.location.models.RenterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterRepository extends JpaRepository<RenterEntity, String> {
}
