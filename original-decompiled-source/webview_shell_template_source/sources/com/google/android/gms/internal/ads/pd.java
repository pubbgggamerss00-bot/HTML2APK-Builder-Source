package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pd extends j52 implements n62 {
    private static final pd zza;
    private static volatile s62 zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private int zzf = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;

    static {
        pd pdVar = new pd();
        zza = pdVar;
        j52.q(pd.class, pdVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ld ldVar = ld.f6659d;
            return new w62(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", ldVar, "zzf", ldVar});
        }
        if (iA == 3) {
            return new pd();
        }
        if (iA == 4) {
            return new fd(zza);
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
        synchronized (pd.class) {
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
