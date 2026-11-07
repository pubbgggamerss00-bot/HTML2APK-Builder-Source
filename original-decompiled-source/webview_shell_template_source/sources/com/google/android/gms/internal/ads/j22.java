package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j22 extends j52 implements n62 {
    private static final j22 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private l22 zze;

    static {
        j22 j22Var = new j22();
        zza = j22Var;
        j52.q(j22.class, j22Var);
    }

    public static i22 C() {
        return (i22) zza.l();
    }

    public static j22 D(g42 g42Var, u42 u42Var) {
        return (j22) j52.u(zza, g42Var, u42Var);
    }

    public static s62 F() {
        return zza.m();
    }

    public static /* synthetic */ void G(j22 j22Var, l22 l22Var) {
        j22Var.zze = l22Var;
        j22Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final l22 E() {
        l22 l22Var = this.zze;
        return l22Var == null ? l22.C() : l22Var;
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
            return new j22();
        }
        if (iA == 4) {
            return new i22(zza);
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
        synchronized (j22.class) {
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
