package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class g02 extends j52 implements n62 {
    private static final g02 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private g42 zze = g42.f4896t;
    private k02 zzf;

    static {
        g02 g02Var = new g02();
        zza = g02Var;
        j52.q(g02.class, g02Var);
    }

    public static f02 C() {
        return (f02) zza.l();
    }

    public static g02 D(g42 g42Var, u42 u42Var) {
        return (g02) j52.u(zza, g42Var, u42Var);
    }

    public static s62 G() {
        return zza.m();
    }

    public static /* synthetic */ void I(g02 g02Var, k02 k02Var) {
        g02Var.zzf = k02Var;
        g02Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final k02 E() {
        k02 k02Var = this.zzf;
        return k02Var == null ? k02.D() : k02Var;
    }

    public final g42 F() {
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
            return new w62(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iA == 3) {
            return new g02();
        }
        if (iA == 4) {
            return new f02(zza);
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
        synchronized (g02.class) {
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
