package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class an extends j52<an, zm> implements n62 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final an zze;
    private static volatile s62<an> zzf;
    private int zzg;
    private int zzh;
    private ll zzi;
    private String zzj = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        an anVar = new an();
        zze = anVar;
        j52.q(an.class, anVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zze, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzg", "zzh", ee.f4240d, "zzi", "zzj", "zzk"});
        }
        if (iA == 3) {
            return new an();
        }
        if (iA == 4) {
            return new zm(zze);
        }
        if (iA == 5) {
            return zze;
        }
        if (iA != 6) {
            throw null;
        }
        s62<an> s62Var = zzf;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (an.class) {
            try {
                f52Var = zzf;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzf = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
