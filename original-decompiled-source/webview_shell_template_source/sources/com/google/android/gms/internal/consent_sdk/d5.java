package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d5 extends z6 implements w7 {
    private static final d5 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        d5 d5Var = new d5();
        zzb = d5Var;
        z6.l(d5.class, d5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", p1.f11864d, "zzf", l2.f11812v, "zzg", "zzh"});
        }
        if (i7 == 3) {
            return new d5();
        }
        if (i7 == 4) {
            return new m1(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
