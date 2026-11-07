package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n22 extends j52 implements n62 {
    private static final n22 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private p22 zze;

    static {
        n22 n22Var = new n22();
        zza = n22Var;
        j52.q(n22.class, n22Var);
    }

    public static m22 C() {
        return (m22) zza.l();
    }

    public static n22 D(g42 g42Var, u42 u42Var) {
        return (n22) j52.u(zza, g42Var, u42Var);
    }

    public static s62 F() {
        return zza.m();
    }

    public static /* synthetic */ void G(n22 n22Var, p22 p22Var) {
        n22Var.zze = p22Var;
        n22Var.zzc |= 1;
    }

    public final int B() {
        return this.zzd;
    }

    public final p22 E() {
        p22 p22Var = this.zze;
        return p22Var == null ? p22.D() : p22Var;
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
            return new n22();
        }
        if (iA == 4) {
            return new m22(zza);
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
        synchronized (n22.class) {
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
