package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p12 extends j52 implements n62 {
    private static final p12 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private t12 zze;
    private g42 zzf = g42.f4896t;

    static {
        p12 p12Var = new p12();
        zza = p12Var;
        j52.q(p12.class, p12Var);
    }

    public static o12 C() {
        return (o12) zza.l();
    }

    public static p12 D() {
        return zza;
    }

    public static p12 E(g42 g42Var, u42 u42Var) {
        return (p12) j52.u(zza, g42Var, u42Var);
    }

    public static s62 H() {
        return zza.m();
    }

    public static /* synthetic */ void J(p12 p12Var, t12 t12Var) {
        p12Var.zze = t12Var;
        p12Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final t12 F() {
        t12 t12Var = this.zze;
        return t12Var == null ? t12.E() : t12Var;
    }

    public final g42 G() {
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
            return new p12();
        }
        if (iA == 4) {
            return new o12(zza);
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
        synchronized (p12.class) {
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
