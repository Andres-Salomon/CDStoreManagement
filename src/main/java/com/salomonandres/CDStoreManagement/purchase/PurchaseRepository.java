package com.salomonandres.CDStoreManagement.purchase;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.Optional;

@Repository
public interface PurchaseRepository extends JpaRepository <Purchase, BigInteger> {
    @Query("SELECT p FROM Purchase p WHERE p.id=?1")
    Optional<Purchase> findById(Purchase purchase);
}
