package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class pl extends j52<pl, ol> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final pl zzd;
    private static volatile s62<pl> zze;
    private int zzf;
    private int zzg = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private ql zzh;
    private jl zzi;

    static {
        pl plVar = new pl();
        zzd = plVar;
        j52.q(pl.class, plVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzd, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzf", "zzg", ld.f6660e, "zzh", "zzi"});
        }
        if (iA == 3) {
            return new pl();
        }
        if (iA == 4) {
            return new ol(zzd);
        }
        if (iA == 5) {
            return zzd;
        }
        if (iA != 6) {
            throw null;
        }
        s62<pl> s62Var = zze;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (pl.class) {
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
