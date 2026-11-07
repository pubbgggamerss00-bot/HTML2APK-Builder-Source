package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class mm extends j52<mm, lm> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final mm zzc;
    private static volatile s62<mm> zzd;
    private int zze;
    private boolean zzf;
    private int zzg;

    static {
        mm mmVar = new mm();
        zzc = mmVar;
        j52.q(mm.class, mmVar);
    }

    public static lm B() {
        return zzc.l();
    }

    public static void E(mm mmVar, boolean z6) {
        mmVar.zze |= 1;
        mmVar.zzf = z6;
    }

    public static void F(mm mmVar, int i6) {
        mmVar.zze |= 2;
        mmVar.zzg = i6;
    }

    public final boolean D() {
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
            return new w62(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        if (iA == 3) {
            return new mm();
        }
        if (iA == 4) {
            return new lm();
        }
        if (iA == 5) {
            return zzc;
        }
        if (iA != 6) {
            throw null;
        }
        s62<mm> s62Var = zzd;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (mm.class) {
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
