package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wm extends j52<wm, vm> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final wm zzg;
    private static volatile s62<wm> zzh;
    private int zzi;
    private int zzj;
    private jl zzk;
    private jl zzl;
    private jl zzm;
    private r52<jl> zzn = v62.f9734w;
    private int zzo;

    static {
        wm wmVar = new wm();
        zzg = wmVar;
        j52.q(wm.class, wmVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", jl.class, "zzo"});
        }
        if (iA == 3) {
            return new wm();
        }
        if (iA == 4) {
            return new vm(zzg);
        }
        if (iA == 5) {
            return zzg;
        }
        if (iA != 6) {
            throw null;
        }
        s62<wm> s62Var = zzh;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (wm.class) {
            try {
                f52Var = zzh;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzh = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
