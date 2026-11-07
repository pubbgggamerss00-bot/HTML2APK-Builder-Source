package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public enum al implements l52 {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    public final int s;

    al(int i6) {
        this.s = i6;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.s);
    }

    @Override // com.google.android.gms.internal.ads.l52
    public final int zza() {
        return this.s;
    }
}
