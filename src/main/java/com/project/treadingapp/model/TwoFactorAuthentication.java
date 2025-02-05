package com.project.treadingapp.model;

import com.project.treadingapp.domain.VerificationType;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
public class TwoFactorAuthentication {
    private boolean isEnabled = false;

    private VerificationType sendTo;
}
