package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n3 extends z6 implements w7 {
    private static final n3 zzb;

    static {
        n3 n3Var = new n3();
        zzb = n3Var;
        z6.l(n3.class, n3Var);
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
            return new n3();
        }
        if (i7 == 4) {
            return new g1(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
