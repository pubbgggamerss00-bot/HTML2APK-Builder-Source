package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public enum zzil implements zzfk {
    BROADCAST_ACTION_UNSPECIFIED(0),
    PURCHASES_UPDATED_ACTION(1),
    LOCAL_PURCHASES_UPDATED_ACTION(2),
    ALTERNATIVE_BILLING_ACTION(3);

    private final int zzf;

    zzil(int i10) {
        this.zzf = i10;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzf);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfk
    public final int zza() {
        return this.zzf;
    }
}
