package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class cm extends j52<cm, bm> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final cm zzf;
    private static volatile s62<cm> zzg;
    private int zzh;
    private int zzi = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private ql zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    static {
        cm cmVar = new cm();
        zzf = cmVar;
        j52.q(cm.class, cmVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzh", "zzi", ld.f6660e, "zzj", "zzk", "zzl", "zzm"});
        }
        if (iA == 3) {
            return new cm();
        }
        if (iA == 4) {
            return new bm(zzf);
        }
        if (iA == 5) {
            return zzf;
        }
        if (iA != 6) {
            throw null;
        }
        s62<cm> s62Var = zzg;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (cm.class) {
            try {
                f52Var = zzg;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzg = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
