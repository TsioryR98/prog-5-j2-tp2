package org.prog5.location.repository;

import org.prog5.location.models.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental,String> {}
