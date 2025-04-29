package mk.ukim.finki.lab.service;

import java.util.List;

import mk.ukim.finki.lab.model.Album;
import mk.ukim.finki.lab.model.Artist;
import mk.ukim.finki.lab.model.Song;

public interface SongService {

    List<Song> listSongs();

    Artist addArtistToSong(Artist artist, Song song);

    Song findByTrackId(Long trackId);

    Song createSong(String title, String genre, Integer releaseYear, List<Artist> performers, Album album);

    Song updateSong(Long id, String title, String genre, Integer releaseYear, Album album);

    boolean removeSong(Long id);

    List<Song> findByTitle(String title);

    void save(String title, String genre, Integer releaseYear, Album album);

    void save(Song song);


    int counter(Long Id);

}
