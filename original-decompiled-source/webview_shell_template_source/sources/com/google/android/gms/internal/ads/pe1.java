package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pe1 extends j52 implements n62 {
    private static final pe1 zza;
    private static volatile s62 zzb;
    private r52 zzc = v62.f9734w;

    static {
        pe1 pe1Var = new pe1();
        zza = pe1Var;
        j52.q(pe1.class, pe1Var);
    }

    public static me1 C() {
        return (me1) zza.l();
    }

    public static void D(pe1 pe1Var, oe1 oe1Var) {
        r52 r52Var = pe1Var.zzc;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            pe1Var.zzc = r52Var.b(size + size);
        }
        pe1Var.zzc.add(oe1Var);
    }

    public static void E(pe1 pe1Var) {
        pe1Var.zzc = v62.f9734w;
    }

    public final int B() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", oe1.class});
        }
        if (iA == 3) {
            return new pe1();
        }
        if (iA == 4) {
            return new me1(zza);
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
        synchronized (pe1.class) {
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
