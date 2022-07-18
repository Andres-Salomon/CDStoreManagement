package com.salomonandres.CDStoreManagement.cd;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;

@Entity
@Table
public class CD {
    @Id
    @SequenceGenerator(name="cdSequence",sequenceName = "cdSequence" ,allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="cdSequence")
    private BigInteger idCD;
    private String title;
    private Double duration;
    private Integer price;
    private LocalDate releaseDate;

    public CD() {

    }

    public CD(BigInteger id_CD, String title, Double duration, Integer price, LocalDate releaseDate) {
        this.idCD = id_CD;
        this.title = title;
        this.duration = duration;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public CD(String title, Double duration, Integer price, String artist, LocalDate releaseDate) {
        this.title = title;
        this.duration = duration;
        this.price = price;
        this.releaseDate = releaseDate;
    }

    public BigInteger getId_CD() {
        return idCD;
    }

    public void setId_CD(BigInteger id_CD) {
        this.idCD = id_CD;
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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
