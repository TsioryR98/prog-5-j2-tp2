package org.prog5.location.controller;

import lombok.AllArgsConstructor;
import org.prog5.location.models.RenterEntity;
import org.prog5.location.service.RenterService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/renters")
public class RenterController {
    @Qualifier("renterServiceImpl")
    private final RenterService service;

    @GetMapping
    public List<RenterEntity> all() {
        return service.findAll();
    }

    @PostMapping
    public RenterEntity create(@RequestBody RenterEntity r) {
        return service.save(r);
    }
}
