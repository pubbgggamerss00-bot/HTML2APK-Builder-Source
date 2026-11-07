package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p22 extends j52 implements n62 {
    private static final p22 zza;
    private static volatile s62 zzb;
    private int zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private x12 zze;

    static {
        p22 p22Var = new p22();
        zza = p22Var;
        j52.q(p22.class, p22Var);
    }

    public static o22 C() {
        return (o22) zza.l();
    }

    public static p22 D() {
        return zza;
    }

    public static p22 E(g42 g42Var, u42 u42Var) {
        return (p22) j52.u(zza, g42Var, u42Var);
    }

    public static /* synthetic */ void G(p22 p22Var, x12 x12Var) {
        x12Var.getClass();
        p22Var.zze = x12Var;
        p22Var.zzc |= 1;
    }

    public static /* synthetic */ void H(p22 p22Var, String str) {
        str.getClass();
        p22Var.zzd = str;
    }

    public final x12 B() {
        x12 x12Var = this.zze;
        return x12Var == null ? x12.D() : x12Var;
    }

    public final String F() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iA == 3) {
            return new p22();
        }
        if (iA == 4) {
            return new o22(zza);
        }
        if (iA == 5) {
            return zza;
        }
        if (iA != 6) {
            throw null;
        }
        s62 s62Var = zzb;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (p22.class) {
            try {
                f52Var = zzb;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzb = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
