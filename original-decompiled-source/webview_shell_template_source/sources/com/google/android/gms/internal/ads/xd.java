package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xd extends j52 implements n62 {
    private static final xd zza;
    private static volatile s62 zzb;
    private int zzc;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;

    static {
        xd xdVar = new xd();
        zza = xdVar;
        j52.q(xd.class, xdVar);
    }

    public static wd B() {
        return (wd) zza.l();
    }

    public static /* synthetic */ void C(xd xdVar, long j6) {
        xdVar.zzc |= 32;
        xdVar.zzi = j6;
    }

    public static /* synthetic */ void D(xd xdVar, long j6) {
        xdVar.zzc |= 4;
        xdVar.zzf = j6;
    }

    public static /* synthetic */ void E(xd xdVar, long j6) {
        xdVar.zzc |= 1;
        xdVar.zzd = j6;
    }

    public static /* synthetic */ void F(xd xdVar, long j6) {
        xdVar.zzc |= 8;
        xdVar.zzg = j6;
    }

    public static /* synthetic */ void G(xd xdVar, long j6) {
        xdVar.zzc |= 16;
        xdVar.zzh = j6;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iA == 3) {
            return new xd();
        }
        if (iA == 4) {
            return new wd(zza);
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
        synchronized (xd.class) {
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
