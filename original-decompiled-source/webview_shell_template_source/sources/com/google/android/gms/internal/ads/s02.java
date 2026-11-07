package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s02 extends j52 implements n62 {
    private static final s02 zza;
    private static volatile s62 zzb;
    private int zzc;
    private u02 zzd;
    private int zze;

    static {
        s02 s02Var = new s02();
        zza = s02Var;
        j52.q(s02.class, s02Var);
    }

    public static r02 C() {
        return (r02) zza.l();
    }

    public static s02 D() {
        return zza;
    }

    public static /* synthetic */ void G(s02 s02Var, u02 u02Var) {
        s02Var.zzd = u02Var;
        s02Var.zzc |= 1;
    }

    public final int B() {
        return this.zze;
    }

    public final u02 E() {
        u02 u02Var = this.zzd;
        return u02Var == null ? u02.D() : u02Var;
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
            return new s02();
        }
        if (iA == 4) {
            return new r02(zza);
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
        synchronized (s02.class) {
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
