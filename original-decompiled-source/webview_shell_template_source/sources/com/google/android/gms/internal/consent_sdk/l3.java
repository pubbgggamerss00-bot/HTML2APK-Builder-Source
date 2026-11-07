package com.google.android.gms.internal.consent_sdk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l3 extends z6 implements w7 {
    private static final l3 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private long zzg;
    private int zzh;

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        z6.l(l3.class, l3Var);
    }

    public static k3 m() {
        return (k3) zzb.g();
    }

    public static /* synthetic */ void n(l3 l3Var, y2 y2Var) {
        l3Var.zzf = y2Var;
        l3Var.zze = 38;
    }

    public static /* synthetic */ void o(l3 l3Var, long j6) {
        l3Var.zzd |= 1;
        l3Var.zzg = j6;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0019\u0001\u0001\b&\u0019\u0000\u0000\u0000\b<\u0000\tဂ\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000f<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001dင\u0001\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"<\u0000#<\u0000$<\u0000%<\u0000&<\u0000", new Object[]{"zzf", "zze", "zzd", o4.class, "zzg", z4.class, s3.class, v1.class, d4.class, b2.class, j3.class, y1.class, j2.class, v3.class, x3.class, o5.class, u4.class, v5.class, "zzh", u5.class, c5.class, n2.class, k5.class, i5.class, c2.class, w5.class, p5.class, y2.class});
        }
        if (i7 == 3) {
            return new l3();
        }
        if (i7 == 4) {
            return new k3(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
