package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k2 extends z6 implements w7 {
    private static final k2 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        k2 k2Var = new k2();
        zzb = k2Var;
        z6.l(k2.class, k2Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", e1.f11709a, "zzf", f1.f11724a});
        }
        if (i7 == 3) {
            return new k2();
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
