package com.muendo.mteja.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Account {
  //  Represents an existing customer or client.
   // Contains information about the customer, including contact details and account history.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String accountName;
    private String accountNumber;
    //The industry or sector to which the account belongs (e.g., healthcare, finance, technology)
    private String industry;
    private String size;
    //e.g., customer, client, partner
    private String accountType;
    private String address;
    @OneToMany(mappedBy = "account")
    private List<Contacts> contacts;
    @OneToMany(mappedBy = "account")
    private List<Opportunities> opportunities;
    @OneToMany(mappedBy = "account")
    private List<Leads> leads;

    public Account() {
    }

    public Account(Long id, String accountName, String accountNumber, String industry, String size, String accountType, String address) {
        Id = id;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.industry = industry;
        this.size = size;
        this.accountType = accountType;
        this.address = address;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", accountName='" + accountName + '\'' +
                ", industry='" + industry + '\'' +
                ", size='" + size + '\'' +
                ", accountType='" + accountType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
