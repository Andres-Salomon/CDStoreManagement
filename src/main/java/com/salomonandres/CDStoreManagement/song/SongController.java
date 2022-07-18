package com.salomonandres.CDStoreManagement.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("api/songs")
public class SongController {
    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping
    public List<Song> getSongs(){
        return songService.getSongs();
    }

    @PostMapping
    public void addSong(@RequestBody Song song){songService.addSong(song);}

    @PutMapping(path="{songId}")
    public void updateSong(
        @PathVariable("songId") BigInteger songId,
        @RequestParam(required = false) String title,
        @RequestParam(required = false) Double duration){
        songService.updateSong(songId,title,duration);
    }

    @DeleteMapping(path="{songId}")
    public void deleteSong(@PathVariable("songId") BigInteger songId){
        songService.deleteSong(songId);
    }

}
