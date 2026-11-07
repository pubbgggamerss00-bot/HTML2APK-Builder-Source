package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g22 extends j52 implements n62 {
    private static final g22 zza;
    private static volatile s62 zzb;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        g22 g22Var = new g22();
        zza = g22Var;
        j52.q(g22.class, g22Var);
    }

    public static e22 B() {
        return (e22) zza.l();
    }

    public static /* synthetic */ void E(g22 g22Var, String str) {
        str.getClass();
        g22Var.zzc = str;
    }

    public static void F(g22 g22Var, int i6) {
        if (i6 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        g22Var.zzd = i6 - 2;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iA == 3) {
            return new g22();
        }
        if (iA == 4) {
            return new e22(zza);
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
        synchronized (g22.class) {
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
