package com.salomonandres.CDStoreManagement.purchase;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Purchase {
    @Id
    @SequenceGenerator(name="purchase_Sequence",sequenceName = "purchase_Sequence" ,allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator="purchase_Sequence")
    private BigInteger id_Purchase;
    private BigInteger id_CD;
    private BigInteger id_Client;
    private Integer cost;

    private LocalDate purchaseDate;

    public Purchase() {
    }

    public Purchase(BigInteger id_CD, BigInteger id_Client, Integer cost, LocalDate purchaseDate) {
        this.id_CD = id_CD;
        this.id_Client = id_Client;
        this.cost = cost;
        this.purchaseDate = purchaseDate;
    }

    public BigInteger getId_Purchase() {
        return id_Purchase;
    }

    public void setId_Purchase(BigInteger id_Purchase) {
        this.id_Purchase = id_Purchase;
    }

    public BigInteger getId_CD() {
        return id_CD;
    }

    public void setId_CD(BigInteger id_CD) {
        this.id_CD = id_CD;
    }

    public BigInteger getId_Client() {
        return id_Client;
    }

    public void setId_Client(BigInteger id_Client) {
        this.id_Client = id_Client;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }
}
