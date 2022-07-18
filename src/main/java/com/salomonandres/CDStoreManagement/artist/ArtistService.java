package com.salomonandres.CDStoreManagement.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ArtistService {


    private final ArtistRepository artistRepository;


    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getArtists() {
        return artistRepository.findAll();
    }


    public void addArtist(Artist artist) {
        Optional<Artist> artistsByName = artistRepository.findArtistsByName(artist.getName());
        if(artistsByName.isPresent()){
            throw new IllegalStateException("Artist with that name already exists");
        }
        artistRepository.save(artist);
    }

    @Transactional
    public void updateArtist(BigInteger artistId, String name) {
        Artist artist = artistRepository.findById(artistId).orElseThrow(()->
                new IllegalStateException("artist with id"+ artistId+" not found"));

        if(name!=null && name.length()>0 && !Objects.equals(artist.getName(),name)){
            artist.setName(name);
        }
    }

    public void deleteArtist(BigInteger artistId) {
        boolean exists=artistRepository.existsById(artistId);
        if(!exists){
            throw new IllegalStateException("Artist with that Id does not exist");
        }
        artistRepository.deleteById(artistId);
    }
}
