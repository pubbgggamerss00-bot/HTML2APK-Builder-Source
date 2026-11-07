package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h1 extends z6 implements w7 {
    private static final h1 zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        h1 h1Var = new h1();
        zzb = h1Var;
        z6.l(h1.class, h1Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i7 == 3) {
            return new h1();
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
