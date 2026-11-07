package com.google.android.gms.common.api;

/* loaded from: classes2.dex */
public class b extends Exception {

    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    public b(Status status) {
        int i10 = status.f5910a;
        String str = status.f5911b;
        super(i10 + ": " + (str == null ? "" : str));
        this.mStatus = status;
    }

    public Status getStatus() {
        return this.mStatus;
    }

    public int getStatusCode() {
        return this.mStatus.f5910a;
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.f5911b;
    }
}
