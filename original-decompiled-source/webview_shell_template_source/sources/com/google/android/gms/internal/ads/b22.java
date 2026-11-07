package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b22 extends j52 implements n62 {
    private static final b22 zza;
    private static volatile s62 zzb;
    private int zzc;
    private v12 zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        b22 b22Var = new b22();
        zza = b22Var;
        j52.q(b22.class, b22Var);
    }

    public static a22 D() {
        return (a22) zza.l();
    }

    public static /* synthetic */ void F(b22 b22Var, v12 v12Var) {
        b22Var.zzd = v12Var;
        b22Var.zzc |= 1;
    }

    public static void K(b22 b22Var, int i6) {
        if (i6 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        b22Var.zze = i6 - 2;
    }

    public final int B() {
        return this.zzf;
    }

    public final v12 C() {
        v12 v12Var = this.zzd;
        return v12Var == null ? v12.D() : v12Var;
    }

    public final q22 E() {
        q22 q22VarA = q22.a(this.zzg);
        return q22VarA == null ? q22.UNRECOGNIZED : q22VarA;
    }

    public final boolean I() {
        return (this.zzc & 1) != 0;
    }

    public final int J() {
        int i6 = this.zze;
        int i7 = i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i7 == 0) {
            return 1;
        }
        return i7;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        }
        if (iA == 3) {
            return new b22();
        }
        if (iA == 4) {
            return new a22(zza);
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
        synchronized (b22.class) {
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
