package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class sl extends j52<sl, rl> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final sl zze;
    private static volatile s62<sl> zzf;
    private int zzg;
    private ll zzh;
    private int zzi = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private ql zzj;
    private jl zzk;

    static {
        sl slVar = new sl();
        zze = slVar;
        j52.q(sl.class, slVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zze, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzg", "zzh", "zzi", ld.f6660e, "zzj", "zzk"});
        }
        if (iA == 3) {
            return new sl();
        }
        if (iA == 4) {
            return new rl(zze);
        }
        if (iA == 5) {
            return zze;
        }
        if (iA != 6) {
            throw null;
        }
        s62<sl> s62Var = zzf;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (sl.class) {
            try {
                f52Var = zzf;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzf = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
