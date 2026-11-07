package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class qk extends j52<qk, pk> implements n62 {
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private static final qk zzl;
    private static volatile s62<qk> zzm;
    private gn zzA;
    private in zzB;
    private r52<nl> zzC;
    private int zzn;
    private int zzo;
    private int zzp = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private sm zzu;
    private um zzv;
    private r52<qm> zzw;
    private wm zzx;
    private dl zzy;
    private vk zzz;

    static {
        qk qkVar = new qk();
        zzl = qkVar;
        j52.q(qk.class, qkVar);
    }

    public qk() {
        v62 v62Var = v62.f9734w;
        this.zzw = v62Var;
        this.zzC = v62Var;
    }

    public static void B(qk qkVar, ok okVar) {
        qkVar.getClass();
        qkVar.zzo = okVar.s;
        qkVar.zzn |= 1;
    }

    public static void C(qk qkVar, um umVar) {
        qkVar.getClass();
        qkVar.zzv = umVar;
        qkVar.zzn |= 8;
    }

    public static qk F() {
        return zzl;
    }

    public final um D() {
        um umVar = this.zzv;
        return umVar == null ? um.D() : umVar;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzl, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzn", "zzo", nk.f7458a, "zzp", ld.f6660e, "zzu", "zzv", "zzw", qm.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", nl.class});
        }
        if (iA == 3) {
            return new qk();
        }
        if (iA == 4) {
            return new pk();
        }
        if (iA == 5) {
            return zzl;
        }
        if (iA != 6) {
            throw null;
        }
        s62<qk> s62Var = zzm;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (qk.class) {
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
