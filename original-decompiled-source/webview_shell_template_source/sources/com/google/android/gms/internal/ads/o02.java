package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o02 extends j52 implements n62 {
    private static final o02 zza;
    private static volatile s62 zzb;
    private int zzc;
    private s02 zzd;
    private r12 zze;

    static {
        o02 o02Var = new o02();
        zza = o02Var;
        j52.q(o02.class, o02Var);
    }

    public static n02 B() {
        return (n02) zza.l();
    }

    public static o02 C(g42 g42Var, u42 u42Var) {
        return (o02) j52.u(zza, g42Var, u42Var);
    }

    public static /* synthetic */ void F(o02 o02Var, s02 s02Var) {
        o02Var.zzd = s02Var;
        o02Var.zzc |= 1;
    }

    public static /* synthetic */ void G(o02 o02Var, r12 r12Var) {
        o02Var.zze = r12Var;
        o02Var.zzc |= 2;
    }

    public final s02 D() {
        s02 s02Var = this.zzd;
        return s02Var == null ? s02.D() : s02Var;
    }

    public final r12 E() {
        r12 r12Var = this.zze;
        return r12Var == null ? r12.E() : r12Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iA == 3) {
            return new o02();
        }
        if (iA == 4) {
            return new n02(zza);
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
        synchronized (o02.class) {
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
