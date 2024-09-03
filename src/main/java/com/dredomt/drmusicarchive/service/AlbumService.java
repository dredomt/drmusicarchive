package com.dredomt.drmusicarchive.service;

import com.dredomt.drmusicarchive.model.Album;
import com.dredomt.drmusicarchive.model.Band;
import com.dredomt.drmusicarchive.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    public Album saveAlbum(Album album) {
        return albumRepository.save(album);
    }

    public List<Album> findAllAlbums() {
        return albumRepository.findAll();
    }

    public Optional<Album> getAlbumById(UUID id) {
        return albumRepository.findById(id);
    }

    public void updateAlbum(Album album) {
        albumRepository.save(album);
    }
    public void deleteAlbumById(UUID id) {
        albumRepository.deleteById(id);
    }
}
