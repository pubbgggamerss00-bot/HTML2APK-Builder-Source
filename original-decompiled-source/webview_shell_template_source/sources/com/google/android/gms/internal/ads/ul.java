package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ul extends j52<ul, tl> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final ul zzd;
    private static volatile s62<ul> zze;
    private int zzf;
    private int zzg;
    private xl zzh;
    private zl zzi;

    static {
        ul ulVar = new ul();
        zzd = ulVar;
        j52.q(ul.class, ulVar);
    }

    public static void B(ul ulVar) {
        ulVar.getClass();
        ulVar.zzg = s1.b.a(2);
        ulVar.zzf |= 1;
    }

    public static void C(ul ulVar, xl xlVar) {
        ulVar.getClass();
        xlVar.getClass();
        ulVar.zzh = xlVar;
        ulVar.zzf |= 2;
    }

    public static void D(ul ulVar, zl zlVar) {
        ulVar.getClass();
        ulVar.zzi = zlVar;
        ulVar.zzf |= 4;
    }

    public static tl E() {
        return zzd.l();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", sk.f8964c, "zzh", "zzi"});
        }
        if (iA == 3) {
            return new ul();
        }
        if (iA == 4) {
            return new tl();
        }
        if (iA == 5) {
            return zzd;
        }
        if (iA != 6) {
            throw null;
        }
        s62<ul> s62Var = zze;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (ul.class) {
            try {
                f52Var = zze;
                if (f52Var == null) {
                    f52Var = new f52();
                    zze = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
