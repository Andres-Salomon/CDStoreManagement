package com.salomonandres.CDStoreManagement.artist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, BigInteger> {

    @Query("SELECT a FROM Artist a WHERE a.name=?1")
    Optional<Artist> findArtistsByName(String name);
}
