package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c4 extends z6 implements w7 {
    private static final c4 zzb;
    private int zzd;
    private b4 zze;
    private y3 zzf;

    static {
        c4 c4Var = new c4();
        zzb = c4Var;
        z6.l(c4.class, c4Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i7 == 3) {
            return new c4();
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
