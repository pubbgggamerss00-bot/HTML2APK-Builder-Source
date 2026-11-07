package com.pairip.licensecheck;

/* loaded from: classes.dex */
public enum TrialStatus {
    UNKNOWN(0),
    UNDER_TRIAL(1),
    NOT_UNDER_TRIAL(2);

    private final int statusCode;

    TrialStatus(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return this.statusCode;
    }
}
