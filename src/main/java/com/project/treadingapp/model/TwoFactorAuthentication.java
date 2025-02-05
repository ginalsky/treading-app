package com.project.treadingapp.model;

import com.project.treadingapp.domain.VerificationType;


public class TwoFactorAuthentication {
    private boolean isEnabled = false;

    private VerificationType sendTo;

    public TwoFactorAuthentication(boolean isEnabled, VerificationType sendTo) {
        this.isEnabled = isEnabled;
        this.sendTo = sendTo;
    }

    public TwoFactorAuthentication() {
    }

}
