package org.prog5.location.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class RenterEntity implements Renter {
    @Id
    private String id;
    private String name;

    @Override
    public String getId() {
        return "";
    }

    @Override
    public String getName() {
        return "";
    }
}
