package com.salomonandres.CDStoreManagement.purchase;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/purchases")
public class PurchaseController {

    private final PurchaseService purchaseService;

    public PurchaseController(PurchaseService purchaseService) {
        this.purchaseService = purchaseService;
    }

    @GetMapping
    public List<Purchase> getPurchases(){
        return purchaseService.getPurchases();
    }

    @PostMapping
    public void addPurchase(@RequestBody Purchase purchase){
        purchaseService.addPurchase(purchase);
    }
}
