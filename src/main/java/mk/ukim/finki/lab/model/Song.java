package mk.ukim.finki.lab.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Song {

   // private static Long ID_CNT = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String genre;
    private Integer releaseYear;
    private int counter;

    @ManyToOne
    private Album album;

    @ManyToMany
    private List<Artist> performers = new ArrayList<>();


   /* @ManyToMany
    private List<Genre> genres;*/

    public Song(String title, String genre, Integer releaseYear, List<Artist> performers, Album album) {
        //this.id = ID_CNT++;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.performers = performers;
        this.album = album;
        this.counter=0;
        //this.genres = genres;
    }

    public void addPerformer(Artist artist) {
        performers.add(artist);
    }

}