package org.prog5.location.repository;

import org.prog5.location.models.Rentable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentableRepository extends JpaRepository<Rentable, String> {}
