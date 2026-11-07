package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w5 extends z6 implements w7 {
    private static final w5 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private c7 zzg = a7.f11632w;

    static {
        w5 w5Var = new w5();
        zzb = w5Var;
        z6.l(w5.class, w5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            e1 e1Var = e1.h;
            return new d8(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ࠬ\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzg", e1Var, "zzf", e1Var});
        }
        if (i7 == 3) {
            return new w5();
        }
        if (i7 == 4) {
            return new k1(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
