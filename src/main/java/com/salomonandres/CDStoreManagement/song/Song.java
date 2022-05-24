package com.salomonandres.CDStoreManagement.song;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table
public class Song {
    @Id
    @SequenceGenerator(name="song_Sequence",sequenceName = "song_Sequence" ,allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="song_Sequence")
    private BigInteger songId;
    private String title;
    private Double duration;

    public Song() {
    }

    public Song(BigInteger songId, String title, Double duration) {
        this.songId = songId;
        this.title = title;
        this.duration = duration;
    }

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public BigInteger getSongId() {
        return songId;
    }

    public void setSongId(BigInteger songId) {
        this.songId = songId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
}
