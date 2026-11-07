package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e92 extends j52 implements n62 {
    private static final e92 zza;
    private static volatile s62 zzb;
    private int zzc;
    private long zze;
    private boolean zzf;
    private int zzg;
    private boolean zzj;
    private boolean zzk;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        e92 e92Var = new e92();
        zza = e92Var;
        j52.q(e92.class, e92Var);
    }

    public static d92 B() {
        return (d92) zza.l();
    }

    public static /* synthetic */ void C(e92 e92Var, String str) {
        e92Var.zzc |= 1;
        e92Var.zzd = str;
    }

    public static /* synthetic */ void D(e92 e92Var, long j6) {
        e92Var.zzc |= 2;
        e92Var.zze = j6;
    }

    public static /* synthetic */ void E(e92 e92Var, boolean z6) {
        e92Var.zzc |= 4;
        e92Var.zzf = z6;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", dd.h, "zzh", "zzi", "zzj", "zzk"});
        }
        if (iA == 3) {
            return new e92();
        }
        if (iA == 4) {
            return new d92(zza);
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
        synchronized (e92.class) {
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
