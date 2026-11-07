package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d3 extends z6 implements w7 {
    private static final d3 zzb;

    static {
        d3 d3Var = new d3();
        zzb = d3Var;
        z6.l(d3.class, d3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0000", null);
        }
        if (i7 == 3) {
            return new d3();
        }
        if (i7 == 4) {
            return new j1(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
