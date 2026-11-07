package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class li1 extends j52 implements n62 {
    private static final li1 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private ji1 zzg;

    static {
        li1 li1Var = new li1();
        zza = li1Var;
        j52.q(li1.class, li1Var);
    }

    public static ki1 B() {
        return (ki1) zza.l();
    }

    public static /* synthetic */ void C(li1 li1Var, String str) {
        str.getClass();
        li1Var.zzc |= 2;
        li1Var.zze = str;
    }

    public static /* synthetic */ void D(li1 li1Var, ji1 ji1Var) {
        li1Var.zzg = ji1Var;
        li1Var.zzc |= 8;
    }

    public static /* synthetic */ void E(li1 li1Var) {
        li1Var.zzd = 1;
        li1Var.zzc = 1 | li1Var.zzc;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", ee.f4241e, "zze", "zzf", "zzg"});
        }
        if (iA == 3) {
            return new li1();
        }
        if (iA == 4) {
            return new ki1(zza);
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
        synchronized (li1.class) {
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
