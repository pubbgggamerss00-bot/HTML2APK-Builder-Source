package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ge extends j52 implements n62 {
    private static final ge zza;
    private static volatile s62 zzb;
    private int zzc;
    private long zzf;
    private long zzh;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = "D";

    static {
        ge geVar = new ge();
        zza = geVar;
        j52.q(ge.class, geVar);
    }

    public static fe B() {
        return (fe) zza.l();
    }

    public static /* synthetic */ void C(ge geVar) {
        geVar.zzc |= 1;
        geVar.zzd = "1.671910402";
    }

    public static /* synthetic */ void D(ge geVar, String str) {
        str.getClass();
        geVar.zzc |= 2;
        geVar.zze = str;
    }

    public static /* synthetic */ void E(ge geVar, String str) {
        str.getClass();
        geVar.zzc |= 8;
        geVar.zzg = str;
    }

    public static /* synthetic */ void F(ge geVar, long j6) {
        geVar.zzc |= 4;
        geVar.zzf = j6;
    }

    public static /* synthetic */ void G(ge geVar, long j6) {
        geVar.zzc |= 16;
        geVar.zzh = j6;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iA == 3) {
            return new ge();
        }
        if (iA == 4) {
            return new fe(zza);
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
        synchronized (ge.class) {
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
