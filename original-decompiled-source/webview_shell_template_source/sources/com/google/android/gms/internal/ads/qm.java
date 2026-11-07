package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qm extends j52<qm, pm> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final qm zzc;
    private static volatile s62<qm> zzd;
    private int zze;
    private int zzf;
    private gl zzg;

    static {
        qm qmVar = new qm();
        zzc = qmVar;
        j52.q(qm.class, qmVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", nm.f7468a, "zzg"});
        }
        if (iA == 3) {
            return new qm();
        }
        if (iA == 4) {
            return new pm(zzc);
        }
        if (iA == 5) {
            return zzc;
        }
        if (iA != 6) {
            throw null;
        }
        s62<qm> s62Var = zzd;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (qm.class) {
            try {
                f52Var = zzd;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzd = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
