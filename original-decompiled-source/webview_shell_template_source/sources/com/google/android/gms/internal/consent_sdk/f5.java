package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f5 extends z6 implements w7 {
    private static final f5 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private x8 zzg;
    private x8 zzh;
    private int zzi;

    static {
        f5 f5Var = new f5();
        zzb = f5Var;
        z6.l(f5.class, f5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u00047\u0000\u0005<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", m3.f11825e, n6.class});
        }
        if (i7 == 3) {
            return new f5();
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
