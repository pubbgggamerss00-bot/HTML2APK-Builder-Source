package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class sw0 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9038a;

    public /* synthetic */ sw0(int i6) {
        this.f9038a = i6;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        p21 p21Var;
        switch (this.f9038a) {
            case 0:
                return bs1.l(new gw0(5));
            case 1:
                Exception exc = (Exception) obj;
                zzv.zzp().g("PreloadedLoader.getTypeTwoAdResponseString", exc);
                if (exc instanceof TimeoutException) {
                    p21Var = new p21(1, "Timed out waiting for ad response.");
                } else if (exc instanceof p21) {
                    p21Var = (p21) exc;
                } else {
                    p21Var = new p21(1, exc.getMessage() == null ? "Fetch failed." : exc.getMessage());
                }
                return bs1.l(p21Var);
            case 2:
                Throwable cause = (ExecutionException) obj;
                if (cause.getCause() != null) {
                    cause = cause.getCause();
                }
                return bs1.l(cause);
            case 3:
                return bs1.m(new f51((String) obj, 0));
            default:
                r1.b bVar = (r1.b) obj;
                if (bVar == null) {
                    return bs1.m(new d91(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 1));
                }
                c82 c82VarB = d82.B();
                for (r1.c cVar : bVar.f14258a) {
                    z72 z72VarB = b82.B();
                    int i6 = cVar.f14261c;
                    z72VarB.i();
                    ((b82) z72VarB.f4126t).zzc = i6;
                    long j6 = cVar.f14260b;
                    z72VarB.i();
                    ((b82) z72VarB.f4126t).zzd = j6;
                    long j7 = cVar.f14259a;
                    z72VarB.i();
                    ((b82) z72VarB.f4126t).zze = j7;
                    b82 b82Var = (b82) z72VarB.g();
                    c82VarB.i();
                    d82.C((d82) c82VarB.f4126t, b82Var);
                }
                return bs1.m(new d91(Base64.encodeToString(((d82) c82VarB.g()).i(), 1), 1));
        }
    }
}
