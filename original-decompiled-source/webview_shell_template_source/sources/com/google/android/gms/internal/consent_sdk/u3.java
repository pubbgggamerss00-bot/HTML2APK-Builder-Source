package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u3 extends z6 implements w7 {
    private static final u3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzi = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        u3 u3Var = new u3();
        zzb = u3Var;
        z6.l(u3.class, u3Var);
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0003\u0004ဈ\u0004\u0005᠌\u0005\u0006င\u0002\t᠌\u0006\n᠌\u0007", new Object[]{"zzd", "zze", h2.f11764u, "zzf", "zzh", "zzi", "zzj", d.f11674e, "zzg", "zzk", m3.f11822b, "zzl", e1.f11712d});
        }
        if (i7 == 3) {
            return new u3();
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
