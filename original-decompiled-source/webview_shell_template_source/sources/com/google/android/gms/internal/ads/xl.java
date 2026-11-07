package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xl extends j52<xl, wl> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final xl zzc;
    private static volatile s62<xl> zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        xl xlVar = new xl();
        zzc = xlVar;
        j52.q(xl.class, xlVar);
    }

    public static wl B() {
        return zzc.l();
    }

    public static xl D() {
        return zzc;
    }

    public static void E(xl xlVar, boolean z6) {
        xlVar.zze |= 1;
        xlVar.zzf = z6;
    }

    public static void F(xl xlVar, int i6) {
        xlVar.zze |= 2;
        xlVar.zzg = i6;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (iA == 3) {
            return new xl();
        }
        if (iA == 4) {
            return new wl();
        }
        if (iA == 5) {
            return zzc;
        }
        if (iA != 6) {
            throw null;
        }
        s62<xl> s62Var = zzd;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (xl.class) {
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
