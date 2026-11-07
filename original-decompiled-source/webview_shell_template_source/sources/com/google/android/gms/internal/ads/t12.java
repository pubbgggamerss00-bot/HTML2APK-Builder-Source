package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class t12 extends j52 implements n62 {
    private static final t12 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;

    static {
        t12 t12Var = new t12();
        zza = t12Var;
        j52.q(t12.class, t12Var);
    }

    public static s12 D() {
        return (s12) zza.l();
    }

    public static t12 E() {
        return zza;
    }

    public final int B() {
        return this.zzd;
    }

    public final n12 C() {
        int i6 = this.zzc;
        n12 n12Var = i6 != 0 ? i6 != 1 ? i6 != 2 ? i6 != 3 ? i6 != 4 ? i6 != 5 ? null : n12.SHA224 : n12.SHA512 : n12.SHA256 : n12.SHA384 : n12.SHA1 : n12.UNKNOWN_HASH;
        return n12Var == null ? n12.UNRECOGNIZED : n12Var;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        }
        if (iA == 3) {
            return new t12();
        }
        if (iA == 4) {
            return new s12(zza);
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
        synchronized (t12.class) {
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
