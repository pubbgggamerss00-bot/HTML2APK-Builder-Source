package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a4 extends z6 implements w7 {
    private static final a4 zzb;
    private int zzd;
    private z3 zze;

    static {
        a4 a4Var = new a4();
        zzb = a4Var;
        z6.l(a4.class, a4Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i7 == 3) {
            return new a4();
        }
        if (i7 == 4) {
            return new t1(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
