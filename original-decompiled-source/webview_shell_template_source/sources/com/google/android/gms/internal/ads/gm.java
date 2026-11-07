package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gm extends j52<gm, fm> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final gm zzg;
    private static volatile s62<gm> zzh;
    private int zzi;
    private int zzj = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private ql zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private long zzo;

    static {
        gm gmVar = new gm();
        zzg = gmVar;
        j52.q(gm.class, gmVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzg, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzi", "zzj", ld.f6660e, "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (iA == 3) {
            return new gm();
        }
        if (iA == 4) {
            return new fm(zzg);
        }
        if (iA == 5) {
            return zzg;
        }
        if (iA != 6) {
            throw null;
        }
        s62<gm> s62Var = zzh;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (gm.class) {
            try {
                f52Var = zzh;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzh = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
