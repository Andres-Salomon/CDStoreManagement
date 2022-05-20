package com.salomonandres.CDStoreManagement.client;

import java.math.BigInteger;

public class Client {
    private BigInteger id_Client;
    private String first_Name;
    private String last_Name;
    private String billing_Address;
    private Integer zip_Code;
    private String email;

    public Client() {
    }

    public Client(BigInteger id_Client, String first_Name, String last_Name, String billing_Address, Integer zip_Code, String email) {
        this.id_Client = id_Client;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.billing_Address = billing_Address;
        this.zip_Code = zip_Code;
        this.email = email;
    }

    public BigInteger getId_Client() {
        return id_Client;
    }

    public void setId_Client(BigInteger id_Client) {
        this.id_Client = id_Client;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getBilling_Address() {
        return billing_Address;
    }

    public void setBilling_Address(String billing_Address) {
        this.billing_Address = billing_Address;
    }

    public Integer getZip_Code() {
        return zip_Code;
    }

    public void setZip_Code(Integer zip_Code) {
        this.zip_Code = zip_Code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
