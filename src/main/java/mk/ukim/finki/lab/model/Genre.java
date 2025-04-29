/*
package mk.ukim.finki.lab.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Song> songs;

    private String name;

    public Genre(List<Song> songs, String name){
        this.songs = songs;
        this.name = name;
    }
}

 */
