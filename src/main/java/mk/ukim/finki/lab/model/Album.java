package mk.ukim.finki.lab.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.aop.target.LazyInitTargetSource;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Album {

   // private static Long ID_CNT = 0L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String genre;
    private String releaseYear;

    @OneToMany(mappedBy = "album")
    private List<Song> songs;

    public Album(String name, String genre, String releaseYear) {
        //this.id = ID_CNT++;
        this.name = name;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

}