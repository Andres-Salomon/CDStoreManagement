package com.salomonandres.CDStoreManagement.client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface ClientRepository  extends JpaRepository<Client, BigInteger>{

    @Query("SELECT cl FROM Client cl WHERE cl.email = ?1")
    Optional<Client> findByEmail(String email);
}
