package com.project.treadingapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.treadingapp.domain.BrokerRole;
import jakarta.persistence.*;

@Entity
public class Broker {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //tylko odczyt z json-a
    private String password;

    @Embedded
    private TwoFactorAuthentication twoFactorAuthentication = new TwoFactorAuthentication();

    private BrokerRole role = BrokerRole.ROLE_USER;

    public Broker(Long id, String fullName, String email, String password, TwoFactorAuthentication twoFactorAuthentication, BrokerRole role) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.twoFactorAuthentication = twoFactorAuthentication;
        this.role = role;
    }

    public Broker() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TwoFactorAuthentication getTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }

    public void setTwoFactorAuthentication(TwoFactorAuthentication twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    public BrokerRole getRole() {
        return role;
    }

    public void setRole(BrokerRole role) {
        this.role = role;
    }
}
