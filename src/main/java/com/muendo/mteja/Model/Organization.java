package com.muendo.mteja.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Organization {
   // Represents a business or organization.
    //Fields may include company name, industry, size, address, etc.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    // company using the crm
    private String companyName;

    // e.g could be healthcare products etc
    private String industry;
    private String size;
    private String address;

    public Organization() {
    }

    public Organization(Long id, String companyName, String industry, String size, String address) {
        Id = id;
        this.companyName = companyName;
        this.industry = industry;
        this.size = size;
        this.address = address;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Organization{" +
                "Id=" + Id +
                ", companyName='" + companyName + '\'' +
                ", industry='" + industry + '\'' +
                ", size='" + size + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
