package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yc extends j52 implements n62 {
    private static final yc zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private boolean zzg;
    private gd zzi;
    private jd zzj;
    private boolean zzk;
    private boolean zze = true;
    private String zzf = "unknown_host";
    private boolean zzh = true;

    static {
        yc ycVar = new yc();
        zza = ycVar;
        j52.q(yc.class, ycVar);
    }

    public static xc B() {
        return (xc) zza.l();
    }

    public static /* synthetic */ void F(yc ycVar, boolean z6) {
        ycVar.zzc |= 8;
        ycVar.zzg = z6;
    }

    public static /* synthetic */ void G(yc ycVar, String str) {
        str.getClass();
        ycVar.zzc |= 4;
        ycVar.zzf = str;
    }

    public final gd C() {
        gd gdVar = this.zzi;
        return gdVar == null ? gd.C() : gdVar;
    }

    public final void D() {
        if (this.zzj == null) {
            int i6 = jd.zza;
        }
    }

    public final String E() {
        return this.zzf;
    }

    public final boolean H() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zzc", "zzd", zc.f11252b, "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (iA == 3) {
            return new yc();
        }
        if (iA == 4) {
            return new xc(zza);
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
        synchronized (yc.class) {
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
