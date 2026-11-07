package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class fn extends j52<fn, en> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final fn zze;
    private static volatile s62<fn> zzf;
    private int zzg;
    private int zzi;
    private jl zzk;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private n52 zzj = k52.f6256w;

    static {
        fn fnVar = new fn();
        zze = fnVar;
        j52.q(fn.class, fnVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzg", "zzh", "zzi", ld.f6660e, "zzj", "zzk"});
        }
        if (iA == 3) {
            return new fn();
        }
        if (iA == 4) {
            return new en(zze);
        }
        if (iA == 5) {
            return zze;
        }
        if (iA != 6) {
            throw null;
        }
        s62<fn> s62Var = zzf;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (fn.class) {
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
