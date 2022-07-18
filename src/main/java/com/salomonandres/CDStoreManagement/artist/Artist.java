package com.salomonandres.CDStoreManagement.artist;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table
public class Artist {
    @Id
    @SequenceGenerator(name="artistSequence",sequenceName = "artistSequence" ,allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="artistSequence")
    private BigInteger idArtist;
    private String name;

    public Artist() {
    }

    public Artist(BigInteger id_Artist, String name) {
        this.idArtist = id_Artist;
        this.name = name;
    }

    public Artist(String name) {
        this.name = name;
    }

    public BigInteger getId_Artist() {
        return idArtist;
    }

    public void setId_Artist(BigInteger id_Artist) {
        this.idArtist = id_Artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
