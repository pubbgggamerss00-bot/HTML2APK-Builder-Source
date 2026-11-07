package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class um extends j52<um, tm> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final um zzf;
    private static volatile s62<um> zzg;
    private int zzh;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private r52<qm> zzj = v62.f9734w;
    private int zzk = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private int zzl = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private int zzm = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;

    static {
        um umVar = new um();
        zzf = umVar;
        j52.q(um.class, umVar);
    }

    public static void B(um umVar, String str) {
        umVar.getClass();
        str.getClass();
        umVar.zzh |= 1;
        umVar.zzi = str;
    }

    public static um D() {
        return zzf;
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
            return new w62(zzf, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzh", "zzi", "zzj", qm.class, "zzk", ldVar, "zzl", ldVar, "zzm", ldVar});
        }
        if (iA == 3) {
            return new um();
        }
        if (iA == 4) {
            return new tm();
        }
        if (iA == 5) {
            return zzf;
        }
        if (iA != 6) {
            throw null;
        }
        s62<um> s62Var = zzg;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (um.class) {
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
