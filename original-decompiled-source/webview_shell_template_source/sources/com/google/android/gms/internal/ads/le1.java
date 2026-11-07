package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class le1 extends j52 implements n62 {
    private static final le1 zza;
    private static volatile s62 zzb;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzI;
    private int zzP;
    private int zzQ;
    private int zzS;
    private long zzab;
    private int zzad;
    private int zzae;
    private int zzaf;
    private we1 zzag;
    private int zzah;
    private ve1 zzai;
    private qe1 zzaj;
    private se1 zzak;
    private re1 zzal;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private n52 zzj = k52.f6256w;
    private String zzu = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzv = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzw = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzx = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzy = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzz = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzB = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzC = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private q52 zzD = c62.f3440w;
    private String zzJ = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzK = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzL = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzM = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzN = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzO = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzR = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzT = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzU = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzV = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzW = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzX = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzY = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzZ = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzaa = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzac = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        le1 le1Var = new le1();
        zza = le1Var;
        j52.q(le1.class, le1Var);
    }

    public static je1 B() {
        return (je1) zza.l();
    }

    public static void C(le1 le1Var, Iterable iterable) {
        r52 r52Var = le1Var.zzD;
        if (!((v32) r52Var).s) {
            c62 c62Var = (c62) r52Var;
            int i6 = c62Var.f3442u;
            le1Var.zzD = c62Var.b(i6 + i6);
        }
        t32.h(iterable, le1Var.zzD);
    }

    public static /* synthetic */ void D(le1 le1Var, String str) {
        str.getClass();
        le1Var.zzx = str;
    }

    public static /* synthetic */ void E(le1 le1Var, String str) {
        str.getClass();
        le1Var.zzJ = str;
    }

    public static /* synthetic */ void F(le1 le1Var, String str) {
        str.getClass();
        le1Var.zzaa = str;
    }

    public static /* synthetic */ void H(le1 le1Var, String str) {
        str.getClass();
        le1Var.zzK = str;
    }

    public static /* synthetic */ void J(le1 le1Var, String str) {
        str.getClass();
        le1Var.zzV = str;
    }

    public static /* synthetic */ void M(le1 le1Var) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        le1Var.zzz = str;
    }

    public static /* synthetic */ void N(le1 le1Var, String str) {
        str.getClass();
        le1Var.zzX = str;
    }

    public static /* synthetic */ void P(le1 le1Var, String str) {
        str.getClass();
        le1Var.zzu = str;
    }

    public static /* synthetic */ void U(le1 le1Var, String str) {
        str.getClass();
        le1Var.zzY = str;
    }

    public static /* synthetic */ void V(le1 le1Var, int i6) {
        if (i6 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        le1Var.zzI = i6 - 2;
    }

    public static /* synthetic */ void X(le1 le1Var, int i6) {
        if (i6 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        le1Var.zzE = i6 - 2;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u00049\u0000\u0001\u000199\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzV", "zzW", "zzX", "zzY", "zzZ", "zzaa", "zzv", "zzw", "zzB", "zzC", "zzD", "zzL", "zzM", "zzU", "zzab", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzae", "zzaf", "zze", "zzai", "zzaj", "zzP", "zzR", "zzO", "zzN", "zzah", "zzQ", "zzS", "zzT", "zzy", "zzak", "zzF", "zzal", "zzac", "zzad", "zzag"});
        }
        if (iA == 3) {
            return new le1();
        }
        if (iA == 4) {
            return new je1(zza);
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
        synchronized (le1.class) {
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
