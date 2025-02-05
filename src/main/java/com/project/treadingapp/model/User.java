package com.project.treadingapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.treadingapp.domain.UserRole;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String fullName;

    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //tylko odczyt z json-a
    private String password;

    @Embedded
    private TwoFactorAuthentication twoFactorAuthentication = new TwoFactorAuthentication();

    private UserRole role = UserRole.ROLE_USER;
}
