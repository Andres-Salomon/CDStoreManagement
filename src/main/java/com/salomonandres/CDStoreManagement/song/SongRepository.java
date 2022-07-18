package com.salomonandres.CDStoreManagement.song;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;

@Repository
public interface SongRepository extends JpaRepository<Song, BigInteger> {
}
