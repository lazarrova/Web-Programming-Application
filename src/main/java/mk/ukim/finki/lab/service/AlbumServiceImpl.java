package mk.ukim.finki.lab.service;

import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.stereotype.Service;

import mk.ukim.finki.lab.model.Album;
import mk.ukim.finki.lab.repository.jpa.AlbumRepository;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final AlbumRepository albums;

    public AlbumServiceImpl(AlbumRepository albums) {
        this.albums = albums;
    }

    @Override
    public List<Album> findAll() {
        return this.albums.findAll();
    }

    @Override
    public Optional<Album> findById(Long albumId){
        return albums.findById(albumId);
    }

}
