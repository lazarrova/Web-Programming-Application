package mk.ukim.finki.lab.service;

import java.util.List;
import java.util.Optional;

import mk.ukim.finki.lab.model.Album;

public interface AlbumService {
    List<Album> findAll();

    Optional<Album> findById(Long albumId);
}
