package com.dredomt.drmusicarchive.repository;

import com.dredomt.drmusicarchive.model.Band;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BandRepository extends JpaRepository<Band, UUID> {
}
