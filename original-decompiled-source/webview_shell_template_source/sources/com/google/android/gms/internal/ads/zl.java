package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zl extends j52<zl, yl> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final zl zzd;
    private static volatile s62<zl> zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;

    static {
        zl zlVar = new zl();
        zzd = zlVar;
        j52.q(zl.class, zlVar);
    }

    public static void B(zl zlVar, boolean z6) {
        zlVar.zzf |= 1;
        zlVar.zzg = z6;
    }

    public static void C(zl zlVar, boolean z6) {
        zlVar.zzf |= 2;
        zlVar.zzh = z6;
    }

    public static void D(zl zlVar, int i6) {
        zlVar.zzf |= 4;
        zlVar.zzi = i6;
    }

    public static yl E() {
        return zzd.l();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (iA == 3) {
            return new zl();
        }
        if (iA == 4) {
            return new yl();
        }
        if (iA == 5) {
            return zzd;
        }
        if (iA != 6) {
            throw null;
        }
        s62<zl> s62Var = zze;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (zl.class) {
            try {
                f52Var = zze;
                if (f52Var == null) {
                    f52Var = new f52();
                    zze = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
