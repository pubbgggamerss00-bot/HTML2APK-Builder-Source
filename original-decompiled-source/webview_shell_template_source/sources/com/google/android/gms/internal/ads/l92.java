package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l92 extends j52 implements n62 {
    private static final l92 zza;
    private static volatile s62 zzb;
    private int zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzf = 4;
    private r52 zzg;
    private String zzh;
    private String zzi;
    private boolean zzj;
    private double zzk;
    private r52 zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzu;

    static {
        l92 l92Var = new l92();
        zza = l92Var;
        j52.q(l92.class, l92Var);
    }

    public l92() {
        v62 v62Var = v62.f9734w;
        this.zzg = v62Var;
        this.zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzl = v62Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0002\u0003\u001a\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007က\u0006\b\u001b\tဈ\u0001\n᠌\u0007\u000bဇ\b\fဇ\t\rဇ\n\u000eဇ\u000b", new Object[]{"zzc", "zzd", "zzf", ld.f6662g, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", k92.class, "zze", "zzm", sk.f8968g, "zzn", "zzo", "zzp", "zzu"});
        }
        if (iA == 3) {
            return new l92();
        }
        if (iA == 4) {
            return new zd(zza);
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
        synchronized (l92.class) {
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
