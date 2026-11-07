package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class z02 extends j52 implements n62 {
    private static final z02 zza;
    private static volatile s62 zzb;
    private int zzc;
    private b12 zzd;
    private int zze;

    static {
        z02 z02Var = new z02();
        zza = z02Var;
        j52.q(z02.class, z02Var);
    }

    public static y02 C() {
        return (y02) zza.l();
    }

    public static z02 D(g42 g42Var, u42 u42Var) {
        return (z02) j52.u(zza, g42Var, u42Var);
    }

    public static /* synthetic */ void G(z02 z02Var, b12 b12Var) {
        z02Var.zzd = b12Var;
        z02Var.zzc |= 1;
    }

    public final int B() {
        return this.zze;
    }

    public final b12 E() {
        b12 b12Var = this.zzd;
        return b12Var == null ? b12.D() : b12Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iA == 3) {
            return new z02();
        }
        if (iA == 4) {
            return new y02(zza);
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
        synchronized (z02.class) {
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
