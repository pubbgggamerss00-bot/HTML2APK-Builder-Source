package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r82 extends j52 implements n62 {
    private static final r82 zza;
    private static volatile s62 zzb;
    private int zzc;
    private q82 zzd;
    private g42 zzf;
    private g42 zzg;
    private int zzh;
    private byte zzi = 2;
    private r52 zze = v62.f9734w;

    static {
        r82 r82Var = new r82();
        zza = r82Var;
        j52.q(r82.class, r82Var);
    }

    public r82() {
        e42 e42Var = g42.f4896t;
        this.zzf = e42Var;
        this.zzg = e42Var;
    }

    public static p82 B() {
        return (p82) zza.l();
    }

    public static void C(r82 r82Var, n82 n82Var) {
        r52 r52Var = r82Var.zze;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            r82Var.zze = r52Var.b(size + size);
        }
        r82Var.zze.add(n82Var);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        switch (s1.b.a(i6)) {
            case 0:
                return Byte.valueOf(this.zzi);
            case 1:
                this.zzi = j52Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new w62(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzc", "zzd", "zze", n82.class, "zzf", "zzg", "zzh"});
            case 3:
                return new r82();
            case 4:
                return new p82(zza);
            case 5:
                return zza;
            case 6:
                s62 s62Var = zzb;
                if (s62Var != null) {
                    return s62Var;
                }
                synchronized (r82.class) {
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
            default:
                throw null;
        }
    }
}
