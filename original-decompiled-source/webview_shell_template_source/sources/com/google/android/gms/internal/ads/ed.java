package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ed extends j52 implements n62 {
    private static final ed zza;
    private static volatile s62 zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzm = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzn = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private r52 zzo = v62.f9734w;

    static {
        ed edVar = new ed();
        zza = edVar;
        j52.q(ed.class, edVar);
    }

    public static ad B() {
        return (ad) zza.l();
    }

    public static /* synthetic */ void C(ed edVar, String str) {
        str.getClass();
        edVar.zzc |= 1;
        edVar.zzd = str;
    }

    public static /* synthetic */ void D(ed edVar, String str) {
        edVar.zzc |= 16;
        edVar.zzh = str;
    }

    public static /* synthetic */ void E(ed edVar, String str) {
        edVar.zzc |= 1024;
        edVar.zzn = str;
    }

    public static /* synthetic */ void F(ed edVar, String str) {
        edVar.zzc |= 8;
        edVar.zzg = str;
    }

    public static /* synthetic */ void G(ed edVar, long j6) {
        edVar.zzc |= 2;
        edVar.zze = j6;
    }

    public static /* synthetic */ void H(ed edVar, String str) {
        str.getClass();
        edVar.zzc |= 4;
        edVar.zzf = str;
    }

    public static /* synthetic */ void I(ed edVar, int i6) {
        edVar.zzp = i6 - 1;
        edVar.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", cd.class, "zzp", dd.f3850b});
        }
        if (iA == 3) {
            return new ed();
        }
        if (iA == 4) {
            return new ad(zza);
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
        synchronized (ed.class) {
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
