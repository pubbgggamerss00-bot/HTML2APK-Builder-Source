package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ll extends j52<ll, kl> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final ll zzd;
    private static volatile s62<ll> zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    static {
        ll llVar = new ll();
        zzd = llVar;
        j52.q(ll.class, llVar);
    }

    public static void B(ll llVar, int i6) {
        llVar.zzf |= 1;
        llVar.zzg = i6;
    }

    public static void C(ll llVar, int i6) {
        llVar.zzf |= 4;
        llVar.zzi = i6;
    }

    public static void D(ll llVar, int i6) {
        llVar.zzf |= 2;
        llVar.zzh = i6;
    }

    public static kl E() {
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
            return new w62(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzf", "zzg", "zzh", "zzi"});
        }
        if (iA == 3) {
            return new ll();
        }
        if (iA == 4) {
            return new kl();
        }
        if (iA == 5) {
            return zzd;
        }
        if (iA != 6) {
            throw null;
        }
        s62<ll> s62Var = zze;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (ll.class) {
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
