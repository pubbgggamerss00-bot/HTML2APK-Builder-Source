package com.google.android.gms.internal.ads;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bl extends j52<bl, yk> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final bl zzi;
    private static volatile s62<bl> zzj;
    private int zzk;
    private int zzm;
    private int zzn;
    private long zzo;
    private long zzv;
    private int zzw;
    private r52<wk> zzl = v62.f9734w;
    private String zzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzu = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        bl blVar = new bl();
        zzi = blVar;
        j52.q(bl.class, blVar);
    }

    public static void B(bl blVar, ArrayList arrayList) {
        r52<wk> r52Var = blVar.zzl;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            blVar.zzl = r52Var.b(size + size);
        }
        t32.h(arrayList, blVar.zzl);
    }

    public static void C(bl blVar, String str) {
        blVar.getClass();
        str.getClass();
        blVar.zzk |= 8;
        blVar.zzp = str;
    }

    public static void D(bl blVar, int i6) {
        blVar.zzk |= 64;
        blVar.zzw = i6;
    }

    public static void E(bl blVar) {
        String str = Build.MODEL;
        blVar.getClass();
        str.getClass();
        blVar.zzk |= 16;
        blVar.zzu = str;
    }

    public static void F(bl blVar, int i6) {
        blVar.zzk |= 1;
        blVar.zzm = i6;
    }

    public static void G(bl blVar, long j6) {
        blVar.zzk |= 32;
        blVar.zzv = j6;
    }

    public static void H(bl blVar, int i6) {
        blVar.zzk |= 2;
        blVar.zzn = i6;
    }

    public static void I(bl blVar, long j6) {
        blVar.zzk |= 4;
        blVar.zzo = j6;
    }

    public static yk J() {
        return zzi.l();
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzi, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzk", "zzl", wk.class, "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw"});
        }
        if (iA == 3) {
            return new bl();
        }
        if (iA == 4) {
            return new yk();
        }
        if (iA == 5) {
            return zzi;
        }
        if (iA != 6) {
            throw null;
        }
        s62<bl> s62Var = zzj;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (bl.class) {
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
