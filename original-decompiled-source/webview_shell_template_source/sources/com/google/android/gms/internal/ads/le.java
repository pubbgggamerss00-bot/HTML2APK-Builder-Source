package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class le extends j52 implements n62 {
    private static final le zza;
    private static volatile s62 zzb;
    private int zzc;
    private r52 zzd = v62.f9734w;
    private g42 zze = g42.f4896t;
    private int zzf = 1;
    private int zzg = 1;

    static {
        le leVar = new le();
        zza = leVar;
        j52.q(le.class, leVar);
    }

    public static ke B() {
        return (ke) zza.l();
    }

    public static void C(le leVar, e42 e42Var) {
        r52 r52Var = leVar.zzd;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            leVar.zzd = r52Var.b(size + size);
        }
        leVar.zzd.add(e42Var);
    }

    public static /* synthetic */ void D(le leVar, e42 e42Var) {
        leVar.zzc |= 1;
        leVar.zze = e42Var;
    }

    public static /* synthetic */ void E(le leVar, int i6) {
        leVar.zzg = i6 - 1;
        leVar.zzc |= 4;
    }

    public static /* synthetic */ void F(le leVar) {
        leVar.zzf = 4;
        leVar.zzc |= 2;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzc", "zzd", "zze", "zzf", he.f5345b, "zzg", ee.f4238b});
        }
        if (iA == 3) {
            return new le();
        }
        if (iA == 4) {
            return new ke(zza);
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
        synchronized (le.class) {
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
