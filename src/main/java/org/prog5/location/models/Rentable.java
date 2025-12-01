package org.prog5.location.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;
import org.prog5.location.models.enums.Status;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Setter
public abstract class Rentable {
    @Id
    protected String id;
    protected String name;
    protected String description;
    protected double pricePerDay;
    @Enumerated(EnumType.STRING)
    protected Status rentStatus;

}
