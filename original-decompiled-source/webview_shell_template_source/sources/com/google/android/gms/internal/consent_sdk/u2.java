package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u2 extends z6 implements w7 {
    private static final u2 zzb;
    private int zzd;
    private int zze;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzg;

    static {
        u2 u2Var = new u2();
        zzb = u2Var;
        z6.l(u2.class, u2Var);
    }

    public static t2 m() {
        return (t2) zzb.g();
    }

    public static /* synthetic */ void n(u2 u2Var, String str) {
        u2Var.zzd |= 2;
        u2Var.zzf = str;
    }

    public static /* synthetic */ void o(u2 u2Var, long j6) {
        u2Var.zzd |= 4;
        u2Var.zzg = j6;
    }

    public static /* synthetic */ void p(u2 u2Var, int i6) {
        u2Var.zze = i6 - 2;
        u2Var.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i7 == 3) {
            return new u2();
        }
        if (i7 == 4) {
            return new t2(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
