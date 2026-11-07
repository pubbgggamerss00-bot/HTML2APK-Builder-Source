package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public enum q22 implements l52 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    public final int s;

    q22(int i6) {
        this.s = i6;
    }

    public static q22 a(int i6) {
        if (i6 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i6 == 1) {
            return TINK;
        }
        if (i6 == 2) {
            return LEGACY;
        }
        if (i6 == 3) {
            return RAW;
        }
        if (i6 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    @Override // com.google.android.gms.internal.ads.l52
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.s;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
