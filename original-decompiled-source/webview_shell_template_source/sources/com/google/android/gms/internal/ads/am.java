package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class am extends j52<am, vl> implements n62 {
    public static final int zza = 1;
    private static final am zzb;
    private static volatile s62<am> zzc;
    private r52<ul> zzd = v62.f9734w;

    static {
        am amVar = new am();
        zzb = amVar;
        j52.q(am.class, amVar);
    }

    public static vl B() {
        return zzb.l();
    }

    public static void D(am amVar, ul ulVar) {
        amVar.getClass();
        r52<ul> r52Var = amVar.zzd;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            amVar.zzd = r52Var.b(size + size);
        }
        amVar.zzd.add(ulVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", ul.class});
        }
        if (iA == 3) {
            return new am();
        }
        if (iA == 4) {
            return new vl();
        }
        if (iA == 5) {
            return zzb;
        }
        if (iA != 6) {
            throw null;
        }
        s62<am> s62Var = zzc;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (am.class) {
            try {
                f52Var = zzc;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzc = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
