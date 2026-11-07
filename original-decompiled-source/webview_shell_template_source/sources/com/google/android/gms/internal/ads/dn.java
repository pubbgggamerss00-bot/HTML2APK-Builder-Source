package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class dn extends j52<dn, cn> implements n62 {
    public static final int zza = 9;
    public static final int zzb = 10;
    public static final int zzc = 11;
    public static final int zzd = 12;
    public static final int zze = 13;
    public static final int zzf = 14;
    public static final int zzg = 15;
    public static final int zzh = 16;
    public static final int zzi = 17;
    public static final int zzj = 18;
    public static final int zzk = 19;
    public static final int zzl = 20;
    public static final int zzm = 21;
    private static final dn zzn;
    private static volatile s62<dn> zzo;
    private ym zzA;
    private an zzB;
    private tk zzC;
    private qk zzD;
    private bl zzE;
    private mm zzF;
    private am zzG;
    private int zzp;
    private int zzu;
    private int zzw;
    private ll zzy;
    private String zzv = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzx = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private q52 zzz = c62.f3440w;

    static {
        dn dnVar = new dn();
        zzn = dnVar;
        j52.q(dn.class, dnVar);
    }

    public static void B(dn dnVar, List list) {
        r52 r52Var = dnVar.zzz;
        if (!((v32) r52Var).s) {
            c62 c62Var = (c62) r52Var;
            int i6 = c62Var.f3442u;
            dnVar.zzz = c62Var.b(i6 + i6);
        }
        t32.h(list, dnVar.zzz);
    }

    public static void C(dn dnVar) {
        dnVar.getClass();
        dnVar.zzz = c62.f3440w;
    }

    public static void D(dn dnVar, qk qkVar) {
        dnVar.getClass();
        dnVar.zzD = qkVar;
        dnVar.zzp |= 256;
    }

    public static void E(dn dnVar, am amVar) {
        dnVar.getClass();
        dnVar.zzG = amVar;
        dnVar.zzp |= 2048;
    }

    public static void F(dn dnVar, ym ymVar) {
        dnVar.getClass();
        dnVar.zzA = ymVar;
        dnVar.zzp |= 32;
    }

    public static void G(dn dnVar, bl blVar) {
        dnVar.getClass();
        dnVar.zzE = blVar;
        dnVar.zzp |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static void H(dn dnVar, mm mmVar) {
        dnVar.getClass();
        dnVar.zzF = mmVar;
        dnVar.zzp |= 1024;
    }

    public static void I(dn dnVar, String str) {
        dnVar.getClass();
        str.getClass();
        dnVar.zzp |= 2;
        dnVar.zzv = str;
    }

    public static cn M() {
        return zzn.l();
    }

    public final String J() {
        return this.zzv;
    }

    public final qk K() {
        qk qkVar = this.zzD;
        return qkVar == null ? qk.F() : qkVar;
    }

    public final ym L() {
        ym ymVar = this.zzA;
        return ymVar == null ? ym.E() : ymVar;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzn, "\u0004\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\f᠌\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzp", "zzu", "zzv", "zzw", "zzx", ld.f6660e, "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG"});
        }
        if (iA == 3) {
            return new dn();
        }
        if (iA == 4) {
            return new cn();
        }
        if (iA == 5) {
            return zzn;
        }
        if (iA != 6) {
            throw null;
        }
        s62<dn> s62Var = zzo;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (dn.class) {
            try {
                f52Var = zzo;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzo = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
