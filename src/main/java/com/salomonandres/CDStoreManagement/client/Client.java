package com.salomonandres.CDStoreManagement.client;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table
public class Client {
    @Id
    @SequenceGenerator(name="client_Sequence",sequenceName = "client_Sequence" ,allocationSize = 1
    )
    @GeneratedValue(strategy =GenerationType.SEQUENCE,
    generator="client_Sequence")
    private BigInteger idClient;
    private String firstName;
    private String lastName;
    private String billingAddress;
    private Integer zipCode;
    private String email;

    public Client() {
    }

    public Client(BigInteger idClient, String firstName, String lastName, String billingAddress, Integer zipCode, String email) {
        this.idClient = idClient;
        this.firstName = firstName;
        this.lastName = lastName;
        this.billingAddress = billingAddress;
        this.zipCode = zipCode;
        this.email = email;
    }

    public Client(String firstName, String lastName, String billingAddress, Integer zipCode, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.billingAddress = billingAddress;
        this.zipCode = zipCode;
        this.email = email;
    }

    public BigInteger getIdClient() {
        return idClient;
    }

    public void setIdClient(BigInteger idClient) {
        this.idClient = idClient;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
