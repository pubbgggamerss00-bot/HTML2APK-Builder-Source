package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r12 extends j52 implements n62 {
    private static final r12 zza;
    private static volatile s62 zzb;
    private int zzc;
    private t12 zzd;
    private int zze;
    private int zzf;

    static {
        r12 r12Var = new r12();
        zza = r12Var;
        j52.q(r12.class, r12Var);
    }

    public static q12 D() {
        return (q12) zza.l();
    }

    public static r12 E() {
        return zza;
    }

    public static r12 F(g42 g42Var, u42 u42Var) {
        return (r12) j52.u(zza, g42Var, u42Var);
    }

    public static /* synthetic */ void I(r12 r12Var, t12 t12Var) {
        r12Var.zzd = t12Var;
        r12Var.zzc |= 1;
    }

    public final int B() {
        return this.zze;
    }

    public final int C() {
        return this.zzf;
    }

    public final t12 G() {
        t12 t12Var = this.zzd;
        return t12Var == null ? t12.E() : t12Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iA == 3) {
            return new r12();
        }
        if (iA == 4) {
            return new q12(zza);
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
        synchronized (r12.class) {
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
