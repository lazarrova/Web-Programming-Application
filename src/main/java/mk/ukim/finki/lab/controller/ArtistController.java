package mk.ukim.finki.lab.controller;



import mk.ukim.finki.lab.model.Artist;
import mk.ukim.finki.lab.service.ArtistService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/artist")
public class ArtistController {

    private final ArtistService artistService;

    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public String showArtist(@RequestParam(required = false) Model model) {

        List<Artist> artistList = artistService.listArtists();

        model.addAttribute("artistList",artistList);
        return "artistsList";
    }

    @PostMapping
    public String saveArtist(@RequestParam(value = "songRadio", required = false) String songRadio, Model model) {

        List<Artist> artistList = artistService.listArtists();

        if (songRadio == null) {
            songRadio = "?";
        }

        model.addAttribute("id", songRadio);
        model.addAttribute("artistList", artistList);
        return "artistsList";
    }
}
