package com.google.android.gms.internal.consent_sdk;

import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class s2 extends z6 implements w7 {
    private static final s2 zzb;
    private int zzd;
    private int zze;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzh;

    static {
        s2 s2Var = new s2();
        zzb = s2Var;
        z6.l(s2.class, s2Var);
    }

    public static r2 m() {
        return (r2) zzb.g();
    }

    public static /* synthetic */ void n(s2 s2Var, int i6) {
        s2Var.zzd |= 8;
        s2Var.zzh = i6;
    }

    public static /* synthetic */ void o(s2 s2Var) {
        String str = Build.MODEL;
        str.getClass();
        s2Var.zzd |= 4;
        s2Var.zzg = str;
    }

    public static /* synthetic */ void p(s2 s2Var) {
        String str = Build.VERSION.RELEASE;
        str.getClass();
        s2Var.zzd |= 2;
        s2Var.zzf = str;
    }

    public static /* synthetic */ void q(s2 s2Var) {
        s2Var.zze = 1;
        s2Var.zzd = 1 | s2Var.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i7 == 3) {
            return new s2();
        }
        if (i7 == 4) {
            return new r2(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
