package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c92 extends j52 implements n62 {
    private static final c92 zza;
    private static volatile s62 zzb;
    private int zzc;
    private int zzd;
    private r82 zzf;
    private t82 zzg;
    private int zzh;
    private int zzk;
    private byte zzm = 2;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private n52 zzi = k52.f6256w;
    private String zzj = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private r52 zzl = v62.f9734w;

    static {
        c92 c92Var = new c92();
        zza = c92Var;
        j52.q(c92.class, c92Var);
    }

    public static b92 C() {
        return (b92) zza.l();
    }

    public static void E(c92 c92Var, String str) {
        str.getClass();
        r52 r52Var = c92Var.zzl;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            c92Var.zzl = r52Var.b(size + size);
        }
        c92Var.zzl.add(str);
    }

    public static /* synthetic */ void F(c92 c92Var, int i6) {
        c92Var.zzc |= 1;
        c92Var.zzd = i6;
    }

    public static /* synthetic */ void G(c92 c92Var, r82 r82Var) {
        c92Var.zzf = r82Var;
        c92Var.zzc |= 4;
    }

    public static /* synthetic */ void H(c92 c92Var, String str) {
        str.getClass();
        c92Var.zzc |= 2;
        c92Var.zze = str;
    }

    public static /* synthetic */ void I(c92 c92Var, int i6) {
        c92Var.zzk = i6 - 1;
        c92Var.zzc |= 64;
    }

    public final int B() {
        return this.zzl.size();
    }

    public final String D() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        switch (s1.b.a(i6)) {
            case 0:
                return Byte.valueOf(this.zzm);
            case 1:
                this.zzm = j52Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new w62(zza, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", od.f7717e, "zzl"});
            case 3:
                return new c92();
            case 4:
                return new b92(zza);
            case 5:
                return zza;
            case 6:
                s62 s62Var = zzb;
                if (s62Var != null) {
                    return s62Var;
                }
                synchronized (c92.class) {
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
