package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class de extends j52 implements n62 {
    private static final de zza;
    private static volatile s62 zzb;
    private int zzc;
    private g42 zzd;
    private g42 zze;
    private g42 zzf;
    private g42 zzg;

    static {
        de deVar = new de();
        zza = deVar;
        j52.q(de.class, deVar);
    }

    public de() {
        e42 e42Var = g42.f4896t;
        this.zzd = e42Var;
        this.zze = e42Var;
        this.zzf = e42Var;
        this.zzg = e42Var;
    }

    public static ce B() {
        return (ce) zza.l();
    }

    public static de C(byte[] bArr, u42 u42Var) throws u52 {
        j52 j52VarZ = j52.z(zza, bArr, bArr.length, u42Var);
        j52.y(j52VarZ);
        return (de) j52VarZ;
    }

    public static /* synthetic */ void H(de deVar, e42 e42Var) {
        deVar.zzc |= 1;
        deVar.zzd = e42Var;
    }

    public static /* synthetic */ void I(de deVar, e42 e42Var) {
        deVar.zzc |= 2;
        deVar.zze = e42Var;
    }

    public static /* synthetic */ void J(de deVar, e42 e42Var) {
        deVar.zzc |= 8;
        deVar.zzg = e42Var;
    }

    public static /* synthetic */ void K(de deVar, e42 e42Var) {
        deVar.zzc |= 4;
        deVar.zzf = e42Var;
    }

    public final g42 D() {
        return this.zzd;
    }

    public final g42 E() {
        return this.zze;
    }

    public final g42 F() {
        return this.zzg;
    }

    public final g42 G() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iA == 3) {
            return new de();
        }
        if (iA == 4) {
            return new ce(zza);
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
        synchronized (de.class) {
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
