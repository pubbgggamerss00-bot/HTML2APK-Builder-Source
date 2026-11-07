package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h92 extends j52 implements n62 {
    private static final h92 zza;
    private static volatile s62 zzb;
    private r52 zzA;
    private r52 zzB;
    private f92 zzC;
    private r52 zzD;
    private k82 zzE;
    private String zzF;
    private f82 zzG;
    private r52 zzH;
    private v82 zzI;
    private int zzJ;
    private r52 zzK;
    private r52 zzL;
    private long zzM;
    private g92 zzN;
    private x82 zzO;
    private String zzP;
    private int zzc;
    private int zzd;
    private int zze;
    private i82 zzi;
    private r52 zzj;
    private r52 zzk;
    private String zzl;
    private a92 zzm;
    private boolean zzn;
    private r52 zzo;
    private String zzp;
    private boolean zzu;
    private boolean zzv;
    private g42 zzw;
    private e92 zzx;
    private boolean zzy;
    private String zzz;
    private byte zzQ = 2;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        h92 h92Var = new h92();
        zza = h92Var;
        j52.q(h92.class, h92Var);
    }

    public h92() {
        v62 v62Var = v62.f9734w;
        this.zzj = v62Var;
        this.zzk = v62Var;
        this.zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzo = v62Var;
        this.zzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzw = g42.f4896t;
        this.zzz = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzA = v62Var;
        this.zzB = v62Var;
        this.zzD = v62Var;
        this.zzF = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzH = v62Var;
        this.zzK = v62Var;
        this.zzL = v62Var;
        this.zzP = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static g82 B() {
        return (g82) zza.l();
    }

    public static void F(h92 h92Var, ArrayList arrayList) {
        r52 r52Var = h92Var.zzA;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            h92Var.zzA = r52Var.b(size + size);
        }
        t32.h(arrayList, h92Var.zzA);
    }

    public static void G(h92 h92Var, ArrayList arrayList) {
        r52 r52Var = h92Var.zzB;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            h92Var.zzB = r52Var.b(size + size);
        }
        t32.h(arrayList, h92Var.zzB);
    }

    public static void H(h92 h92Var, c92 c92Var) {
        r52 r52Var = h92Var.zzj;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            h92Var.zzj = r52Var.b(size + size);
        }
        h92Var.zzj.add(c92Var);
    }

    public static /* synthetic */ void I(h92 h92Var) {
        h92Var.zzc &= -65;
        h92Var.zzl = zza.zzl;
    }

    public static /* synthetic */ void J(h92 h92Var, String str) {
        h92Var.zzc |= 64;
        h92Var.zzl = str;
    }

    public static /* synthetic */ void K(h92 h92Var, e92 e92Var) {
        h92Var.zzx = e92Var;
        h92Var.zzc |= 8192;
    }

    public static /* synthetic */ void L(h92 h92Var, i82 i82Var) {
        h92Var.zzi = i82Var;
        h92Var.zzc |= 32;
    }

    public static /* synthetic */ void M(h92 h92Var, String str) {
        str.getClass();
        h92Var.zzc |= 8;
        h92Var.zzg = str;
    }

    public static /* synthetic */ void N(h92 h92Var, a92 a92Var) {
        h92Var.zzm = a92Var;
        h92Var.zzc |= 128;
    }

    public static /* synthetic */ void O(h92 h92Var, String str) {
        str.getClass();
        h92Var.zzc |= 4;
        h92Var.zzf = str;
    }

    public static /* synthetic */ void P(h92 h92Var, int i6) {
        h92Var.zzd = i6 - 1;
        h92Var.zzc |= 1;
    }

    public final String C() {
        return this.zzl;
    }

    public final String D() {
        return this.zzf;
    }

    public final r52 E() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        switch (s1.b.a(i6)) {
            case 0:
                return Byte.valueOf(this.zzQ);
            case 1:
                this.zzQ = j52Var == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return new w62(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", c92.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zc.f11255e, "zze", sk.f8966e, "zzi", "zzl", "zzm", "zzw", "zzk", j92.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", l92.class, "zzE", "zzF", "zzG", "zzH", l82.class, "zzI", "zzJ", sk.f8967f, "zzK", w82.class, "zzL", y82.class, "zzM", "zzN", "zzO", "zzP"});
            case 3:
                return new h92();
            case 4:
                return new g82(zza);
            case 5:
                return zza;
            case 6:
                s62 s62Var = zzb;
                if (s62Var != null) {
                    return s62Var;
                }
                synchronized (h92.class) {
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
            default:
                throw null;
        }
    }
}
