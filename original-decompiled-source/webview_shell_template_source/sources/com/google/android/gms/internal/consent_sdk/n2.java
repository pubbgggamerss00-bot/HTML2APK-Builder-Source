package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n2 extends z6 implements w7 {
    private static final n2 zzb;
    private int zzd;
    private int zze;
    private m2 zzf;

    static {
        n2 n2Var = new n2();
        zzb = n2Var;
        z6.l(n2.class, n2Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002᠌\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", f1.f11725b, "zzf"});
        }
        if (i7 == 3) {
            return new n2();
        }
        if (i7 == 4) {
            return new l1(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
