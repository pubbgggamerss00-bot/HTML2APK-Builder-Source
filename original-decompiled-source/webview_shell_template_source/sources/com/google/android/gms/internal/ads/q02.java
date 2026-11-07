package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q02 extends j52 implements n62 {
    private static final q02 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private u02 zze;
    private g42 zzf = g42.f4896t;

    static {
        q02 q02Var = new q02();
        zza = q02Var;
        j52.q(q02.class, q02Var);
    }

    public static p02 C() {
        return (p02) zza.l();
    }

    public static q02 D() {
        return zza;
    }

    public static /* synthetic */ void H(q02 q02Var, u02 u02Var) {
        q02Var.zze = u02Var;
        q02Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final u02 E() {
        u02 u02Var = this.zze;
        return u02Var == null ? u02.D() : u02Var;
    }

    public final g42 F() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iA == 3) {
            return new q02();
        }
        if (iA == 4) {
            return new p02(zza);
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
        synchronized (q02.class) {
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
