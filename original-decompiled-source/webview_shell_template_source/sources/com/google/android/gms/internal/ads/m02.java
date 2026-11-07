package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m02 extends j52 implements n62 {
    private static final m02 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private q02 zze;
    private p12 zzf;

    static {
        m02 m02Var = new m02();
        zza = m02Var;
        j52.q(m02.class, m02Var);
    }

    public static l02 C() {
        return (l02) zza.l();
    }

    public static m02 D(g42 g42Var, u42 u42Var) {
        return (m02) j52.u(zza, g42Var, u42Var);
    }

    public static s62 G() {
        return zza.m();
    }

    public static /* synthetic */ void H(m02 m02Var, q02 q02Var) {
        m02Var.zze = q02Var;
        m02Var.zzc |= 1;
    }

    public static /* synthetic */ void I(m02 m02Var, p12 p12Var) {
        m02Var.zzf = p12Var;
        m02Var.zzc |= 2;
    }

    public final int B() {
        return this.zzd;
    }

    public final q02 E() {
        q02 q02Var = this.zze;
        return q02Var == null ? q02.D() : q02Var;
    }

    public final p12 F() {
        p12 p12Var = this.zzf;
        return p12Var == null ? p12.D() : p12Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzc", "zzd", "zze", "zzf"});
        }
        if (iA == 3) {
            return new m02();
        }
        if (iA == 4) {
            return new l02(zza);
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
        synchronized (m02.class) {
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
