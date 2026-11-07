package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class y2 extends z6 implements w7 {
    private static final y2 zzb;
    private int zzd;
    private u2 zze;
    private x2 zzg;
    private s2 zzh;
    private p2 zzi;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private d7 zzj = c8.f11659w;

    static {
        y2 y2Var = new y2();
        zzb = y2Var;
        z6.l(y2.class, y2Var);
    }

    public static q2 m() {
        return (q2) zzb.g();
    }

    public static /* synthetic */ void n(y2 y2Var, String str) {
        str.getClass();
        d7 d7Var = y2Var.zzj;
        if (!d7Var.zzc()) {
            int size = d7Var.size();
            y2Var.zzj = d7Var.a(size + size);
        }
        y2Var.zzj.add(str);
    }

    public static /* synthetic */ void o(y2 y2Var, String str) {
        y2Var.zzd |= 2;
        y2Var.zzf = str;
    }

    public static /* synthetic */ void p(y2 y2Var, p2 p2Var) {
        y2Var.zzi = p2Var;
        y2Var.zzd |= 16;
    }

    public static /* synthetic */ void q(y2 y2Var, s2 s2Var) {
        y2Var.zzh = s2Var;
        y2Var.zzd |= 8;
    }

    public static /* synthetic */ void r(y2 y2Var, u2 u2Var) {
        y2Var.zze = u2Var;
        y2Var.zzd |= 1;
    }

    public static /* synthetic */ void s(y2 y2Var, x2 x2Var) {
        y2Var.zzg = x2Var;
        y2Var.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.z6
    public final Object f(int i6) {
        int i7 = i6 - 1;
        if (i7 == 0) {
            return (byte) 1;
        }
        if (i7 == 2) {
            return new d8(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i7 == 3) {
            return new y2();
        }
        if (i7 == 4) {
            return new q2(zzb);
        }
        if (i7 == 5) {
            return zzb;
        }
        throw null;
    }
}
