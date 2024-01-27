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
    private String status;
    private Double estimatedValue;
    private LocalDate creationDate;

    public Leads() {
    }

    public Leads(Long id, String leadSource, String status, Double estimatedValue, LocalDate creationDate) {
        Id = id;
        this.leadSource = leadSource;
        this.status = status;
        this.estimatedValue = estimatedValue;
        this.creationDate = creationDate;
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
