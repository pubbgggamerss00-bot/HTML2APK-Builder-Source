package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l12 extends j52 implements n62 {
    private static final l12 zza;
    private static volatile s62 zzb;
    private int zzc;
    private g42 zzd = g42.f4896t;

    static {
        l12 l12Var = new l12();
        zza = l12Var;
        j52.q(l12.class, l12Var);
    }

    public static k12 C() {
        return (k12) zza.l();
    }

    public static l12 D(g42 g42Var, u42 u42Var) {
        return (l12) j52.u(zza, g42Var, u42Var);
    }

    public static s62 F() {
        return zza.m();
    }

    public final int B() {
        return this.zzc;
    }

    public final g42 E() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzc", "zzd"});
        }
        if (iA == 3) {
            return new l12();
        }
        if (iA == 4) {
            return new k12(zza);
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
        synchronized (l12.class) {
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
