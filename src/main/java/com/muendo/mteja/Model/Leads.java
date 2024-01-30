package com.muendo.mteja.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Leads {
   // Represents a potential customer or sales opportunity.
   // Contains information about a potential deal, such as source, status, and estimated value.
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    private String leadSource;
    //new,contacted,qualified,lost
    private String status;
    private Double estimatedValue;
    private LocalDate creationDate;
    // contacts of the lead
    private String leadName;
    private String email;
    private String phoneNumber;


    public Leads() {
    }

    public Leads(String leadName, String email, String phoneNumber) {
        this.leadName = leadName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Leads(Long id, String leadSource, String status, Double estimatedValue, LocalDate creationDate) {
        Id = id;
        this.leadSource = leadSource;
        this.status = status;
        this.estimatedValue = estimatedValue;
        this.creationDate = creationDate;
    }

    public String getLeadName() {
        return leadName;
    }

    public void setLeadName(String leadName) {
        this.leadName = leadName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public void setLeadSource(String leadSource) {
        this.leadSource = leadSource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getEstimatedValue() {
        return estimatedValue;
    }

    public void setEstimatedValue(Double estimatedValue) {
        this.estimatedValue = estimatedValue;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Leads{" +
                "Id=" + Id +
                ", leadSource='" + leadSource + '\'' +
                ", status='" + status + '\'' +
                ", estimatedValue=" + estimatedValue +
                ", creationDate=" + creationDate +
                '}';
    }
}
