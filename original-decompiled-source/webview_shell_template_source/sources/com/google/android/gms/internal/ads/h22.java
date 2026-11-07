package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h22 extends j52 implements n62 {
    private static final h22 zza;
    private static volatile s62 zzb;
    private int zzc;
    private r52 zzd = v62.f9734w;

    static {
        h22 h22Var = new h22();
        zza = h22Var;
        j52.q(h22.class, h22Var);
    }

    public static d22 B() {
        return (d22) zza.l();
    }

    public static void C(h22 h22Var, g22 g22Var) {
        r52 r52Var = h22Var.zzd;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            h22Var.zzd = r52Var.b(size + size);
        }
        h22Var.zzd.add(g22Var);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", g22.class});
        }
        if (iA == 3) {
            return new h22();
        }
        if (iA == 4) {
            return new d22(zza);
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
        synchronized (h22.class) {
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
