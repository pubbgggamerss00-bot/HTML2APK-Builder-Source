package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v12 extends j52 implements n62 {
    private static final v12 zza;
    private static volatile s62 zzb;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private g42 zzd = g42.f4896t;
    private int zze;

    static {
        v12 v12Var = new v12();
        zza = v12Var;
        j52.q(v12.class, v12Var);
    }

    public static u12 B() {
        return (u12) zza.l();
    }

    public static v12 D() {
        return zza;
    }

    public static void G(v12 v12Var, int i6) {
        int i7;
        if (i6 == 6) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        switch (i6) {
            case 1:
                i7 = 0;
                break;
            case 2:
                i7 = 1;
                break;
            case 3:
                i7 = 2;
                break;
            case 4:
                i7 = 3;
                break;
            case 5:
                i7 = 4;
                break;
            case 6:
                i7 = -1;
                break;
            default:
                throw null;
        }
        v12Var.zze = i7;
    }

    public static /* synthetic */ void H(v12 v12Var, String str) {
        str.getClass();
        v12Var.zzc = str;
    }

    public static /* synthetic */ void I(v12 v12Var, g42 g42Var) {
        g42Var.getClass();
        v12Var.zzd = g42Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0014 A[PHI: r2
      0x0014: PHI (r2v1 int) = (r2v0 int), (r2v2 int) binds: [B:5:0x0006, B:9:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int C() {
        int i6 = this.zze;
        int i7 = 1;
        if (i6 != 0) {
            int i8 = 2;
            if (i6 != 1) {
                i7 = 3;
                if (i6 != 2) {
                    i8 = 4;
                    i7 = i6 != 3 ? i6 != 4 ? 0 : 5 : i8;
                }
            }
        }
        if (i7 == 0) {
            return 6;
        }
        return i7;
    }

    public final g42 E() {
        return this.zzd;
    }

    public final String F() {
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
            return new w62(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        }
        if (iA == 3) {
            return new v12();
        }
        if (iA == 4) {
            return new u12(zza);
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
        synchronized (v12.class) {
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
