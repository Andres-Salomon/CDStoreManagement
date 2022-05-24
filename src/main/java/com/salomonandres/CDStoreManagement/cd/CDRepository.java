package com.salomonandres.CDStoreManagement.cd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface CDRepository extends JpaRepository<CD, BigInteger> {
    @Query("SELECT c FROM CD c WHERE c.title =?1")
    Optional<CD> findCDByTitle(String title);

}
