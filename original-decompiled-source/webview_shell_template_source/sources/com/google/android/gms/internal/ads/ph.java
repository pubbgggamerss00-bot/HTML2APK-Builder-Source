package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ph extends j52 implements n62 {
    private static final ph zza;
    private static volatile s62 zzb;
    private int zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        ph phVar = new ph();
        zza = phVar;
        j52.q(ph.class, phVar);
    }

    public static oh E() {
        return (oh) zza.l();
    }

    public static ph F() {
        return zza;
    }

    public static ph G(e42 e42Var) throws u52 {
        ph phVar = zza;
        u42 u42Var = u42.f9458b;
        u62 u62Var = u62.f9474c;
        j52 j52VarU = j52.u(phVar, e42Var, u42.f9459c);
        j52.y(j52VarU);
        return (ph) j52VarU;
    }

    public static ph H(e42 e42Var, u42 u42Var) {
        return (ph) j52.u(zza, e42Var, u42Var);
    }

    public static /* synthetic */ void K(ph phVar, String str) {
        str.getClass();
        phVar.zzc |= 2;
        phVar.zze = str;
    }

    public static /* synthetic */ void L(ph phVar, long j6) {
        phVar.zzc |= 8;
        phVar.zzg = j6;
    }

    public static /* synthetic */ void M(ph phVar, long j6) {
        phVar.zzc |= 4;
        phVar.zzf = j6;
    }

    public static /* synthetic */ void N(ph phVar, long j6) {
        phVar.zzc |= 16;
        phVar.zzh = j6;
    }

    public static /* synthetic */ void O(ph phVar, String str) {
        str.getClass();
        phVar.zzc |= 1;
        phVar.zzd = str;
    }

    public final long B() {
        return this.zzg;
    }

    public final long C() {
        return this.zzf;
    }

    public final long D() {
        return this.zzh;
    }

    public final String I() {
        return this.zze;
    }

    public final String J() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (iA == 3) {
            return new ph();
        }
        if (iA == 4) {
            return new oh(zza);
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
        synchronized (ph.class) {
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
