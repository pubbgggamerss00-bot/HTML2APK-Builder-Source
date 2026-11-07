package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class jd extends j52 implements n62 {
    public static final /* synthetic */ int zza = 0;
    private static final jd zzb;
    private static volatile s62 zzc;
    private int zzd;
    private boolean zzf;
    private boolean zzg;
    private long zze = 100;
    private long zzh = 300;
    private long zzi = 1000;

    static {
        jd jdVar = new jd();
        zzb = jdVar;
        j52.q(jd.class, jdVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (iA == 3) {
            return new jd();
        }
        if (iA == 4) {
            return new hd(zzb);
        }
        if (iA == 5) {
            return zzb;
        }
        if (iA != 6) {
            throw null;
        }
        s62 s62Var = zzc;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (jd.class) {
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
