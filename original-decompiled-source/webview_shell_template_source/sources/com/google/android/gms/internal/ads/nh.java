package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nh extends j52 implements n62 {
    private static final nh zza;
    private static volatile s62 zzb;
    private int zzc;
    private ph zzd;
    private g42 zze;
    private g42 zzf;

    static {
        nh nhVar = new nh();
        zza = nhVar;
        j52.q(nh.class, nhVar);
    }

    public nh() {
        e42 e42Var = g42.f4896t;
        this.zze = e42Var;
        this.zzf = e42Var;
    }

    public static nh B(e42 e42Var, u42 u42Var) {
        return (nh) j52.u(zza, e42Var, u42Var);
    }

    public final ph C() {
        ph phVar = this.zzd;
        return phVar == null ? ph.F() : phVar;
    }

    public final g42 D() {
        return this.zzf;
    }

    public final g42 E() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iA == 3) {
            return new nh();
        }
        if (iA == 4) {
            return new fd(zza);
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
        synchronized (nh.class) {
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
