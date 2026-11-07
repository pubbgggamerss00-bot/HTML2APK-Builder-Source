package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class il extends j52<il, hl> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final il zzd;
    private static volatile s62<il> zze;
    private int zzf;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzh;
    private jl zzi;

    static {
        il ilVar = new il();
        zzd = ilVar;
        j52.q(il.class, ilVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", "zzh", ld.f6660e, "zzi"});
        }
        if (iA == 3) {
            return new il();
        }
        if (iA == 4) {
            return new hl(zzd);
        }
        if (iA == 5) {
            return zzd;
        }
        if (iA != 6) {
            throw null;
        }
        s62<il> s62Var = zze;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (il.class) {
            try {
                f52Var = zze;
                if (f52Var == null) {
                    f52Var = new f52();
                    zze = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
