package com.dredomt.drmusicarchive.service;

import com.dredomt.drmusicarchive.model.Band;
import com.dredomt.drmusicarchive.model.Song;
import com.dredomt.drmusicarchive.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SongService {
    @Autowired
    private SongRepository songRepository;

    public Song saveSong(Song song) {
        return songRepository.save(song);
    }

    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public Optional<Song> getSongById(UUID id) {
        return songRepository.findById(id);
    }

    public void updateSong(Song song) {
        songRepository.save(song);
    }

    public void deleteSong(UUID id) {
        songRepository.deleteById(id);
    }
}
