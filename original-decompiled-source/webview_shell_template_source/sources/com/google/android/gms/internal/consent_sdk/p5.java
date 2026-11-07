package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p5 extends z6 implements w7 {
    private static final p5 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        p5 p5Var = new p5();
        zzb = p5Var;
        z6.l(p5.class, p5Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", l2.f11813w, "zzf", d.f11677i});
        }
        if (i7 == 3) {
            return new p5();
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
