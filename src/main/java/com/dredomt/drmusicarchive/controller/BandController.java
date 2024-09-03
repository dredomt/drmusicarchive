package com.dredomt.drmusicarchive.controller;

import com.dredomt.drmusicarchive.model.Band;
import com.dredomt.drmusicarchive.service.BandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/bands")
public class BandController {

    @Autowired
    private BandService bandService;

    @GetMapping
    public ResponseEntity<List<Band>> findAllBands() {
        List<Band> bands = bandService.findAllBands();
        return new ResponseEntity<>(bands, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Band> getBandById(@PathVariable UUID id) {
        Optional<Band> band = bandService.getBandById(id);
        return band.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Band> createBand(@RequestBody Band band) {
        Band savedBand = bandService.saveBand(band);
        return new ResponseEntity<>(savedBand, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Band> updateBand(@PathVariable UUID id, @RequestBody Band band) {
        if (bandService.getBandById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        band.setId(id);
        Band updatedBand = bandService.saveBand(band);
        return new ResponseEntity<>(updatedBand, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBand(@PathVariable UUID id) {
        if (bandService.getBandById(id).isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        bandService.deleteBandById(id);
        return ResponseEntity.noContent().build();
    }
}
