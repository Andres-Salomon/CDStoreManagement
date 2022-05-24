package com.salomonandres.CDStoreManagement.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("api/artist")
public class ArtistController {

    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping
    public List<Artist> getArtist(){
        return artistService.getArtists();
    }

    @PostMapping
    public void registerNewArtist(@RequestBody Artist artist){
        artistService.addArtist(artist);
    }

    @PutMapping(path= "{artistId}")
    public void updateArtist(
        @PathVariable("artistId") BigInteger artist_Id,
        @RequestParam(required = false) String name){
        artistService.updateArtist(artist_Id,name);
    }

    @DeleteMapping(path="{artistId}")
    public void deleteArtist(@PathVariable("artistId") BigInteger artistId){
        artistService.deleteArtist(artistId);
    }
}
