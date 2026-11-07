package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v22 extends j52 implements n62 {
    private static final v22 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private y22 zze;

    static {
        v22 v22Var = new v22();
        zza = v22Var;
        j52.q(v22.class, v22Var);
    }

    public static u22 C() {
        return (u22) zza.l();
    }

    public static v22 D(g42 g42Var, u42 u42Var) {
        return (v22) j52.u(zza, g42Var, u42Var);
    }

    public static /* synthetic */ void F(v22 v22Var, y22 y22Var) {
        v22Var.zze = y22Var;
        v22Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final y22 E() {
        y22 y22Var = this.zze;
        return y22Var == null ? y22.D() : y22Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iA == 3) {
            return new v22();
        }
        if (iA == 4) {
            return new u22(zza);
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
        synchronized (v22.class) {
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
