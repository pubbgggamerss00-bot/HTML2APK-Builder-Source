package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i5 extends z6 implements w7 {
    private static final i5 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        i5 i5Var = new i5();
        zzb = i5Var;
        z6.l(i5.class, i5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", f1.f11730g, "zzi", e1.f11714f, d5.class, e5.class, h5.class, f5.class, g5.class});
        }
        if (i7 == 3) {
            return new i5();
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
