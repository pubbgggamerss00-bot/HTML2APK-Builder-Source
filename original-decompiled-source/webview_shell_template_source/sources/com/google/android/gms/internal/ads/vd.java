package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.AdRequest;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vd extends j52 implements n62 {
    private static final vd zza;
    private static volatile s62 zzb;
    private int zzc;
    private long zzw;
    private long zzx;
    private long zzd = -1;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private int zzj = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private long zzk = -1;
    private long zzl = -1;
    private long zzm = -1;
    private int zzn = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private long zzo = -1;
    private long zzp = -1;
    private long zzu = -1;
    private long zzv = -1;
    private long zzy = -1;
    private long zzz = -1;
    private long zzA = -1;
    private long zzB = -1;

    static {
        vd vdVar = new vd();
        zza = vdVar;
        j52.q(vd.class, vdVar);
    }

    public static ud B() {
        return (ud) zza.l();
    }

    public static /* synthetic */ void C(vd vdVar) {
        vdVar.zzc &= -9;
        vdVar.zzg = -1L;
    }

    public static /* synthetic */ void D(vd vdVar, long j6) {
        vdVar.zzc |= 8;
        vdVar.zzg = j6;
    }

    public static /* synthetic */ void E(vd vdVar, long j6) {
        vdVar.zzc |= 32;
        vdVar.zzi = j6;
    }

    public static /* synthetic */ void F(vd vdVar, long j6) {
        vdVar.zzc |= 4096;
        vdVar.zzp = j6;
    }

    public static /* synthetic */ void G(vd vdVar, long j6) {
        vdVar.zzc |= AdRequest.MAX_CONTENT_URL_LENGTH;
        vdVar.zzm = j6;
    }

    public static /* synthetic */ void H(vd vdVar, long j6) {
        vdVar.zzc |= 2048;
        vdVar.zzo = j6;
    }

    public static /* synthetic */ void I(vd vdVar, long j6) {
        vdVar.zzc |= 4;
        vdVar.zzf = j6;
    }

    public static /* synthetic */ void J(vd vdVar, long j6) {
        vdVar.zzc |= 16;
        vdVar.zzh = j6;
    }

    public static /* synthetic */ void K(vd vdVar, long j6) {
        vdVar.zzc |= 128;
        vdVar.zzk = j6;
    }

    public static /* synthetic */ void L(vd vdVar, long j6) {
        vdVar.zzc |= 131072;
        vdVar.zzy = j6;
    }

    public static /* synthetic */ void M(vd vdVar, long j6) {
        vdVar.zzc |= 1;
        vdVar.zzd = j6;
    }

    public static /* synthetic */ void N(vd vdVar, long j6) {
        vdVar.zzc |= 262144;
        vdVar.zzz = j6;
    }

    public static /* synthetic */ void O(vd vdVar, long j6) {
        vdVar.zzc |= 2;
        vdVar.zze = j6;
    }

    public static /* synthetic */ void P(vd vdVar, long j6) {
        vdVar.zzc |= 256;
        vdVar.zzl = j6;
    }

    public static /* synthetic */ void Q(vd vdVar, long j6) {
        vdVar.zzc |= 32768;
        vdVar.zzw = j6;
    }

    public static /* synthetic */ void R(vd vdVar, long j6) {
        vdVar.zzc |= 65536;
        vdVar.zzx = j6;
    }

    public static /* synthetic */ void S(vd vdVar, long j6) {
        vdVar.zzc |= 8192;
        vdVar.zzu = j6;
    }

    public static /* synthetic */ void T(vd vdVar, long j6) {
        vdVar.zzc |= 16384;
        vdVar.zzv = j6;
    }

    public static /* synthetic */ void U(vd vdVar, int i6) {
        vdVar.zzn = i6 - 1;
        vdVar.zzc |= 1024;
    }

    public static /* synthetic */ void V(vd vdVar, int i6) {
        vdVar.zzj = i6 - 1;
        vdVar.zzc |= 64;
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
            return new w62(zza, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000b᠌\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂ\u0014", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", ldVar, "zzk", "zzl", "zzm", "zzn", ldVar, "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB"});
        }
        if (iA == 3) {
            return new vd();
        }
        if (iA == 4) {
            return new ud(zza);
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
        synchronized (vd.class) {
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
