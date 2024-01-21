package com.example.mteja.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class UserEmployee {
   // Represents UserEmployees or employees of the CRM system.
    //Includes information such as UserEmployeename, role, and permissions.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Username;
    private String password;
    private String email;
    private String role;

    public UserEmployee() {
    }

    public UserEmployee(Long id, String username, String password, String email, String role) {
        Id = id;
        Username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserEmployeename() {
        return Username;
    }

    public void setUserEmployeename(String UserEmployeename) {
        this.Username = UserEmployeename;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserEmployee{" +
                "Id=" + Id +
                ", UserEmployeename='" + Username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
