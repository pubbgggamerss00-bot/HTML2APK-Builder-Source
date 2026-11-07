package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dl extends j52<dl, cl> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private static final dl zzl;
    private static volatile s62<dl> zzm;
    private int zzA;
    private int zzB;
    private fl zzC;
    private int zzn;
    private int zzo = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private int zzp = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        dl dlVar = new dl();
        zzl = dlVar;
        j52.q(dl.class, dlVar);
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
            return new w62(zzl, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzn", "zzo", ldVar, "zzp", ldVar, "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC"});
        }
        if (iA == 3) {
            return new dl();
        }
        if (iA == 4) {
            return new cl(zzl);
        }
        if (iA == 5) {
            return zzl;
        }
        if (iA != 6) {
            throw null;
        }
        s62<dl> s62Var = zzm;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (dl.class) {
            try {
                f52Var = zzm;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzm = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
