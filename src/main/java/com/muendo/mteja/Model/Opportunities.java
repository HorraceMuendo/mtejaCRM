package com.muendo.mteja.Model;


import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
public class Opportunities {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String name;
    private String value;
    private String stage;
    private LocalDateTime localDateTime;
    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    public Opportunities() {
    }

    public Opportunities(Long id, String name, String value, String stage, LocalDateTime localDateTime) {
        Id = id;
        this.name = name;
        this.value = value;
        this.stage = stage;
        this.localDateTime = localDateTime;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
