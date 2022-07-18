package com.salomonandres.CDStoreManagement.song;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class SongService {

    private final SongRepository songRepository;

    @Autowired
    public SongService(SongRepository songRepository) {
        this.songRepository = songRepository;
    }
    public List<Song> getSongs(){
        return songRepository.findAll();
    }

    @Transactional
    public void updateSong(BigInteger songId, String title,Double duration) {
        Song song = songRepository.findById(songId).orElseThrow(()->
                new IllegalStateException("artist with id"+ songId+" not found"));

        if(title!=null && title.length()>0 && !Objects.equals(song.getTitle(),title)){
            song.setTitle(title);
        }

        if(duration!=null && duration>0 && !Objects.equals(song.getDuration(),duration)){
            song.setDuration(duration);
        }
    }

    public void deleteSong(BigInteger songId) {
        boolean exists = songRepository.existsById(songId);
        if(!exists){
            throw new IllegalStateException("Song with that id does not exist");
        }
        songRepository.deleteById(songId);
    }


    public void addSong(Song song) {
        Optional<Song> songById = songRepository.findById(song.getSongId());
        if(songById.isPresent()){
            throw new IllegalStateException("A song with that id already exists");
        }
        songRepository.save(song);
    }
}
