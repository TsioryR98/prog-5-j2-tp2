package org.prog5.location.controller;

import lombok.AllArgsConstructor;
import org.prog5.location.models.Rentable;
import org.prog5.location.service.RentableService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rentables")
@AllArgsConstructor
public class RentableController {
    @Qualifier("rentableServiceImpl")
    private final RentableService service;

    @GetMapping
    public List<Rentable> all() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rentable> get(@PathVariable String id) {
        return service.findById(id).map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Rentable create(@RequestBody Rentable rentable) {
        return service.save(rentable);
    }
}