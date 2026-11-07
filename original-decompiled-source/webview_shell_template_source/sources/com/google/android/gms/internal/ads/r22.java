package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
@Deprecated
/* loaded from: classes.dex */
public final class r22 extends j52 implements n62 {
    public static final /* synthetic */ int zza = 0;
    private static final r22 zzb;
    private static volatile s62 zzc;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private r52 zze = v62.f9734w;

    static {
        r22 r22Var = new r22();
        zzb = r22Var;
        j52.q(r22.class, r22Var);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzd", "zze", y12.class});
        }
        if (iA == 3) {
            return new r22();
        }
        if (iA == 4) {
            return new fd(zzb);
        }
        if (iA == 5) {
            return zzb;
        }
        if (iA != 6) {
            throw null;
        }
        s62 s62Var = zzc;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (r22.class) {
            try {
                f52Var = zzc;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzc = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
