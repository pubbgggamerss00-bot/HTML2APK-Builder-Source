package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tk extends j52<tk, rk> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final tk zzc;
    private static volatile s62<tk> zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        tk tkVar = new tk();
        zzc = tkVar;
        j52.q(tk.class, tkVar);
    }

    public static rk B() {
        return zzc.l();
    }

    public static void D(tk tkVar, int i6) {
        tkVar.getClass();
        int i7 = 1;
        if (i6 == 1) {
            i7 = 0;
        } else if (i6 != 2) {
            if (i6 != 3) {
                i7 = 4;
                if (i6 != 4) {
                    throw null;
                }
            } else {
                i7 = 2;
            }
        }
        tkVar.zzg = i7;
        tkVar.zze |= 2;
    }

    public static void E(tk tkVar, int i6) {
        tkVar.getClass();
        tkVar.zzf = s1.b.a(i6);
        tkVar.zze |= 1;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zze", "zzf", ee.f4239c, "zzg", sk.f8963b});
        }
        if (iA == 3) {
            return new tk();
        }
        if (iA == 4) {
            return new rk();
        }
        if (iA == 5) {
            return zzc;
        }
        if (iA != 6) {
            throw null;
        }
        s62<tk> s62Var = zzd;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (tk.class) {
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
