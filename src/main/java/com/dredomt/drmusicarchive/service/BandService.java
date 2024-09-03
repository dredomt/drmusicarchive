package com.dredomt.drmusicarchive.service;

import com.dredomt.drmusicarchive.model.Band;
import com.dredomt.drmusicarchive.repository.BandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class BandService {

    @Autowired
    private BandRepository bandRepository;

    public Band saveBand(Band band) {
        return bandRepository.save(band);
    }

    public List<Band> findAllBands() {
        return bandRepository.findAll();
    }

    public Optional<Band> getBandById(UUID id) {
        return bandRepository.findById(id);
    }

    public void updateBand(Band band) {
        bandRepository.save(band);
    }
    public void deleteBandById(UUID id) {
        bandRepository.deleteById(id);
    }
}
