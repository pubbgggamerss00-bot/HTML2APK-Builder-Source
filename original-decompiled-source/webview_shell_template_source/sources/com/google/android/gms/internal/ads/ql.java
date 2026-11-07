package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ql extends j52<ql, bd> implements n62 {
    public static final int zza = 1;
    private static final ql zzb;
    private static volatile s62<ql> zzc;
    private int zzd;
    private int zze;

    static {
        ql qlVar = new ql();
        zzb = qlVar;
        j52.q(ql.class, qlVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", dd.f3852d});
        }
        if (iA == 3) {
            return new ql();
        }
        if (iA == 4) {
            return new bd(zzb);
        }
        if (iA == 5) {
            return zzb;
        }
        if (iA != 6) {
            throw null;
        }
        s62<ql> s62Var = zzc;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (ql.class) {
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
