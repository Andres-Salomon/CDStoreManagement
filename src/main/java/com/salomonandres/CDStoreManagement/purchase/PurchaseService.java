package com.salomonandres.CDStoreManagement.purchase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    private final PurchaseRepository purchaseRepository;
    @Autowired
    public PurchaseService(PurchaseRepository purchaseRepository) {
        this.purchaseRepository = purchaseRepository;
    }

    public List<Purchase> getPurchases() {
        return purchaseRepository.findAll();
    }

    public void addPurchase(Purchase purchase) {
        Optional<Purchase> purchaseById = purchaseRepository.findById(purchase);
        if(purchaseById.isPresent()){
            throw new IllegalStateException("That purchase id already exists");
        }
        purchaseRepository.save(purchase);
    }
}
