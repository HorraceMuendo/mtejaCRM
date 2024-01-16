package com.example.mteja.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class Tasks {
   // Represents tasks or to-dos related to customers or deals.
  //  Includes due dates, priorities, and assignees.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String priorities;
    private  String assignees;
    private LocalDate dueDate;

    public Tasks() {
    }

    public Tasks(Long id, String priorities, String assignees, LocalDate dueDate) {
        Id = id;
        this.priorities = priorities;
        this.assignees = assignees;
        this.dueDate = dueDate;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPriorities() {
        return priorities;
    }

    public void setPriorities(String priorities) {
        this.priorities = priorities;
    }

    public String getAssignees() {
        return assignees;
    }

    public void setAssignees(String assignees) {
        this.assignees = assignees;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Tasks{" +
                "Id=" + Id +
                ", priorities='" + priorities + '\'' +
                ", assignees='" + assignees + '\'' +
                ", dueDate=" + dueDate +
                '}';
    }
}
