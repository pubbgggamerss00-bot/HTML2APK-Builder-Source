package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class n82 extends j52 implements n62 {
    private static final n82 zza;
    private static volatile s62 zzb;
    private int zzc;
    private g42 zzd;
    private g42 zze;
    private byte zzf = 2;

    static {
        n82 n82Var = new n82();
        zza = n82Var;
        j52.q(n82.class, n82Var);
    }

    public n82() {
        e42 e42Var = g42.f4896t;
        this.zzd = e42Var;
        this.zze = e42Var;
    }

    public static m82 B() {
        return (m82) zza.l();
    }

    public static /* synthetic */ void C(n82 n82Var, e42 e42Var) {
        n82Var.zzc |= 1;
        n82Var.zzd = e42Var;
    }

    public static /* synthetic */ void D(n82 n82Var, e42 e42Var) {
        n82Var.zzc |= 2;
        n82Var.zze = e42Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        switch (s1.b.a(i6)) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                this.zzf = j52Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new w62(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new n82();
            case 4:
                return new m82(zza);
            case 5:
                return zza;
            case 6:
                s62 s62Var = zzb;
                if (s62Var != null) {
                    return s62Var;
                }
                synchronized (n82.class) {
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
