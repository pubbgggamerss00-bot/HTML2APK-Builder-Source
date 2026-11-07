package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a92 extends j52 implements n62 {
    private static final a92 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private g42 zzf;
    private g42 zzg;

    static {
        a92 a92Var = new a92();
        zza = a92Var;
        j52.q(a92.class, a92Var);
    }

    public a92() {
        e42 e42Var = g42.f4896t;
        this.zzf = e42Var;
        this.zzg = e42Var;
    }

    public static z82 B() {
        return (z82) zza.l();
    }

    public static /* synthetic */ void C(a92 a92Var, g42 g42Var) {
        g42Var.getClass();
        a92Var.zzc |= 4;
        a92Var.zzf = g42Var;
    }

    public static /* synthetic */ void D(a92 a92Var) {
        a92Var.zzc |= 2;
        a92Var.zze = "image/png";
    }

    public static /* synthetic */ void E(a92 a92Var) {
        a92Var.zzd = 1;
        a92Var.zzc = 1 | a92Var.zzc;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", he.f5349f, "zze", "zzf", "zzg"});
        }
        if (iA == 3) {
            return new a92();
        }
        if (iA == 4) {
            return new z82(zza);
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
        synchronized (a92.class) {
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
