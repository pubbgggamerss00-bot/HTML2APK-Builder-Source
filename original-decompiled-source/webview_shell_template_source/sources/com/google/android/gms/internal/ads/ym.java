package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ym extends j52<ym, xm> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final ym zzi;
    private static volatile s62<ym> zzj;
    private int zzk;
    private jl zzm;
    private int zzn;
    private ll zzo;
    private int zzp;
    private String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzu = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private int zzv = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private int zzw = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;

    static {
        ym ymVar = new ym();
        zzi = ymVar;
        j52.q(ym.class, ymVar);
    }

    public static void B(ym ymVar, String str) {
        ymVar.getClass();
        ymVar.zzk |= 1;
        ymVar.zzl = str;
    }

    public static void C(ym ymVar, ll llVar) {
        ymVar.getClass();
        ymVar.zzo = llVar;
        ymVar.zzk |= 8;
    }

    public static ym E() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ld ldVar = ld.f6660e;
            return new w62(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", ldVar, "zzv", ldVar, "zzw", ldVar});
        }
        if (iA == 3) {
            return new ym();
        }
        if (iA == 4) {
            return new xm();
        }
        if (iA == 5) {
            return zzi;
        }
        if (iA != 6) {
            throw null;
        }
        s62<ym> s62Var = zzj;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (ym.class) {
            try {
                f52Var = zzj;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzj = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
