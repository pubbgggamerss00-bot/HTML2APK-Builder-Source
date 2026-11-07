package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w02 extends j52 implements n62 {
    private static final w02 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private b12 zze;
    private g42 zzf = g42.f4896t;

    static {
        w02 w02Var = new w02();
        zza = w02Var;
        j52.q(w02.class, w02Var);
    }

    public static v02 C() {
        return (v02) zza.l();
    }

    public static w02 D(g42 g42Var, u42 u42Var) {
        return (w02) j52.u(zza, g42Var, u42Var);
    }

    public static s62 G() {
        return zza.m();
    }

    public static /* synthetic */ void I(w02 w02Var, b12 b12Var) {
        w02Var.zze = b12Var;
        w02Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final b12 E() {
        b12 b12Var = this.zze;
        return b12Var == null ? b12.D() : b12Var;
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
            return new w02();
        }
        if (iA == 4) {
            return new v02(zza);
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
        synchronized (w02.class) {
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
