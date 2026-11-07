package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class p2 extends z6 implements w7 {
    private static final p2 zzb;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        p2 p2Var = new p2();
        zzb = p2Var;
        z6.l(p2.class, p2Var);
    }

    public static o2 m() {
        return (o2) zzb.g();
    }

    public static /* synthetic */ void n(p2 p2Var, String str) {
        str.getClass();
        p2Var.zzd |= 1;
        p2Var.zze = str;
    }

    public static /* synthetic */ void o(p2 p2Var, String str) {
        str.getClass();
        p2Var.zzd |= 2;
        p2Var.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i7 == 3) {
            return new p2();
        }
        if (i7 == 4) {
            return new o2(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
