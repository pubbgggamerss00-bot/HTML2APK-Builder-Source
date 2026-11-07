package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t22 extends j52 implements n62 {
    private static final t22 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private y22 zze;
    private g42 zzf = g42.f4896t;

    static {
        t22 t22Var = new t22();
        zza = t22Var;
        j52.q(t22.class, t22Var);
    }

    public static s22 C() {
        return (s22) zza.l();
    }

    public static t22 D(g42 g42Var, u42 u42Var) {
        return (t22) j52.u(zza, g42Var, u42Var);
    }

    public static /* synthetic */ void H(t22 t22Var, y22 y22Var) {
        t22Var.zze = y22Var;
        t22Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final y22 E() {
        y22 y22Var = this.zze;
        return y22Var == null ? y22.D() : y22Var;
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
            return new t22();
        }
        if (iA == 4) {
            return new s22(zza);
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
        synchronized (t22.class) {
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
