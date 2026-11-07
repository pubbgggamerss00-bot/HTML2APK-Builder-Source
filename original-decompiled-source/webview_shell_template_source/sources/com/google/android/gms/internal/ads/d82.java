package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d82 extends j52 implements n62 {
    private static final d82 zza;
    private static volatile s62 zzb;
    private r52 zzc = v62.f9734w;

    static {
        d82 d82Var = new d82();
        zza = d82Var;
        j52.q(d82.class, d82Var);
    }

    public static c82 B() {
        return (c82) zza.l();
    }

    public static void C(d82 d82Var, b82 b82Var) {
        r52 r52Var = d82Var.zzc;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            d82Var.zzc = r52Var.b(size + size);
        }
        d82Var.zzc.add(b82Var);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", b82.class});
        }
        if (iA == 3) {
            return new d82();
        }
        if (iA == 4) {
            return new c82(zza);
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
        synchronized (d82.class) {
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
