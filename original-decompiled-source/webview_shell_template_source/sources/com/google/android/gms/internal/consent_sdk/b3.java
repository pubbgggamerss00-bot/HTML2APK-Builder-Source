package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b3 extends z6 implements w7 {
    private static final b3 zzb;
    private int zzd = 0;
    private Object zze;

    static {
        b3 b3Var = new b3();
        zzb = b3Var;
        z6.l(b3.class, b3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", a3.class, z2.class});
        }
        if (i7 == 3) {
            return new b3();
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
