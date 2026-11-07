package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ji1 extends j52 implements n62 {
    private static final ji1 zza;
    private static volatile s62 zzb;
    private int zzc;
    private n52 zzd = k52.f6256w;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        ji1 ji1Var = new ji1();
        zza = ji1Var;
        j52.q(ji1.class, ji1Var);
    }

    public static ii1 B() {
        return (ii1) zza.l();
    }

    public static /* synthetic */ void C(ji1 ji1Var, String str) {
        str.getClass();
        ji1Var.zzc |= 1;
        ji1Var.zze = str;
    }

    public static void D(ji1 ji1Var) {
        r52 r52Var = ji1Var.zzd;
        if (!((v32) r52Var).s) {
            k52 k52Var = (k52) r52Var;
            int i6 = k52Var.f6258u;
            ji1Var.zzd = k52Var.b(i6 + i6);
        }
        ((k52) ji1Var.zzd).f(2);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", sk.f8965d, "zze", "zzf", "zzg"});
        }
        if (iA == 3) {
            return new ji1();
        }
        if (iA == 4) {
            return new ii1(zza);
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
        synchronized (ji1.class) {
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
