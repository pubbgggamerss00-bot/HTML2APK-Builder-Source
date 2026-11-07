package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b32 extends j52 implements n62 {
    private static final b32 zza;
    private static volatile s62 zzb;
    private int zzc;

    static {
        b32 b32Var = new b32();
        zza = b32Var;
        j52.q(b32.class, b32Var);
    }

    public static b32 C() {
        return zza;
    }

    public static b32 D(g42 g42Var, u42 u42Var) {
        return (b32) j52.u(zza, g42Var, u42Var);
    }

    public final int B() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        }
        if (iA == 3) {
            return new b32();
        }
        if (iA == 4) {
            return new hd(zza);
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
        synchronized (b32.class) {
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
