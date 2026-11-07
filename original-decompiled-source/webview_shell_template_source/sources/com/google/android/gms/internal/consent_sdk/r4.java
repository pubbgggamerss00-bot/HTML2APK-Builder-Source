package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r4 extends z6 implements w7 {
    private static final r4 zzb;
    private int zzd;
    private Object zzf;
    private int zze = 0;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        r4 r4Var = new r4();
        zzb = r4Var;
        z6.l(r4.class, r4Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004;\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh"});
        }
        if (i7 == 3) {
            return new r4();
        }
        if (i7 == 4) {
            return new i1(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
