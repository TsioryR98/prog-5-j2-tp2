package org.prog5.location.mapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RentableDto {
    private String id;
    private String name;
    private String description;
    private double pricePerDay;
    private String type;
}
