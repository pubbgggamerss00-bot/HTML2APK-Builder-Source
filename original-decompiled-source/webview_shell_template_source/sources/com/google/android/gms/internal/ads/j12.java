package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j12 extends j52 implements n62 {
    private static final j12 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;

    static {
        j12 j12Var = new j12();
        zza = j12Var;
        j52.q(j12.class, j12Var);
    }

    public static i12 D() {
        return (i12) zza.l();
    }

    public static j12 E(g42 g42Var, u42 u42Var) {
        return (j12) j52.u(zza, g42Var, u42Var);
    }

    public final int B() {
        return this.zzc;
    }

    public final int C() {
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
            return new w62(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zzc"});
        }
        if (iA == 3) {
            return new j12();
        }
        if (iA == 4) {
            return new i12(zza);
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
        synchronized (j12.class) {
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
