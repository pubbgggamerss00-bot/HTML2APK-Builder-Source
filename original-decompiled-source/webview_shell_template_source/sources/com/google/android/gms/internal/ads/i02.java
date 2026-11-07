package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i02 extends j52 implements n62 {
    private static final i02 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private k02 zze;

    static {
        i02 i02Var = new i02();
        zza = i02Var;
        j52.q(i02.class, i02Var);
    }

    public static h02 C() {
        return (h02) zza.l();
    }

    public static i02 D(g42 g42Var, u42 u42Var) {
        return (i02) j52.u(zza, g42Var, u42Var);
    }

    public static /* synthetic */ void G(i02 i02Var, k02 k02Var) {
        i02Var.zze = k02Var;
        i02Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final k02 E() {
        k02 k02Var = this.zze;
        return k02Var == null ? k02.D() : k02Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iA == 3) {
            return new i02();
        }
        if (iA == 4) {
            return new h02(zza);
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
        synchronized (i02.class) {
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
