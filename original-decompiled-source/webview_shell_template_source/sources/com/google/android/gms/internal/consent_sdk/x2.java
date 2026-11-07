package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x2 extends z6 implements w7 {
    private static final x2 zzb;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        x2 x2Var = new x2();
        zzb = x2Var;
        z6.l(x2.class, x2Var);
    }

    public static v2 m() {
        return (v2) zzb.g();
    }

    public static /* synthetic */ void n(x2 x2Var) {
        x2Var.zzd |= 1;
        x2Var.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i7 == 3) {
            return new x2();
        }
        if (i7 == 4) {
            return new v2(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
