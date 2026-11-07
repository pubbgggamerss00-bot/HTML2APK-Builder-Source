package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class oe1 extends j52 implements n62 {
    private static final oe1 zza;
    private static volatile s62 zzb;
    private int zzc;
    private le1 zzd;

    static {
        oe1 oe1Var = new oe1();
        zza = oe1Var;
        j52.q(oe1.class, oe1Var);
    }

    public static ne1 B() {
        return (ne1) zza.l();
    }

    public static /* synthetic */ void C(oe1 oe1Var, le1 le1Var) {
        oe1Var.zzd = le1Var;
        oe1Var.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        }
        if (iA == 3) {
            return new oe1();
        }
        if (iA == 4) {
            return new ne1(zza);
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
        synchronized (oe1.class) {
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
