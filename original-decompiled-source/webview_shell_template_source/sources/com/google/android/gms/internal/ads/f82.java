package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class f82 extends j52 implements n62 {
    private static final f82 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private r52 zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private r52 zzu;
    private boolean zzv;
    private long zzw;
    private n52 zzx;
    private boolean zzy;
    private n52 zzz;

    static {
        f82 f82Var = new f82();
        zza = f82Var;
        j52.q(f82.class, f82Var);
    }

    public f82() {
        v62 v62Var = v62.f9734w;
        this.zzg = v62Var;
        this.zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzu = v62Var;
        k52 k52Var = k52.f6256w;
        this.zzx = k52Var;
        this.zzz = k52Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"zzc", "zzd", dd.f3854f, "zze", "zzf", "zzg", "zzh", zc.f11254d, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", e82.class, "zzv", "zzw", "zzx", dd.f3853e, "zzy", "zzz", od.f7715c});
        }
        if (iA == 3) {
            return new f82();
        }
        if (iA == 4) {
            return new hd(zza);
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
        synchronized (f82.class) {
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
