package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class km extends j52<km, jm> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final km zzc;
    private static volatile s62<km> zzd;
    private int zze;
    private int zzf = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private ql zzg;

    static {
        km kmVar = new km();
        zzc = kmVar;
        j52.q(km.class, kmVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzc, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", ld.f6660e, "zzg"});
        }
        if (iA == 3) {
            return new km();
        }
        if (iA == 4) {
            return new jm(zzc);
        }
        if (iA == 5) {
            return zzc;
        }
        if (iA != 6) {
            throw null;
        }
        s62<km> s62Var = zzd;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (km.class) {
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
