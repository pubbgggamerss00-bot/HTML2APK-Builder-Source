package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nv implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7515b;

    public /* synthetic */ nv(int i6, Object obj) {
        this.f7514a = i6;
        this.f7515b = obj;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) throws gw0 {
        ed1 ed1Var;
        ld1 ld1Var;
        switch (this.f7514a) {
            case 0:
                lv lvVar = (lv) obj;
                o70 o70Var = new o70();
                mv mvVar = new mv(o70Var);
                gv gvVar = (gv) this.f7515b;
                Parcel parcelZza = lvVar.zza();
                th.c(parcelZza, gvVar);
                th.e(parcelZza, mvVar);
                lvVar.zzdb(2, parcelZza);
                return o70Var;
            case 1:
                Throwable th = (Throwable) obj;
                ((c91) this.f7515b).f3476c.w(new yh(13, th));
                return bs1.m(th instanceof SecurityException ? new d91(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 2) : th instanceof IllegalStateException ? new d91(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 3) : th instanceof IllegalArgumentException ? new d91(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 4) : th instanceof TimeoutException ? new d91(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 5) : new d91(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 0));
            case 2:
                return bs1.m(new f51(((h91) this.f7515b).f5306b, 1));
            default:
                na1 na1Var = (na1) this.f7515b;
                kd1 kd1Var = (kd1) obj;
                if (kd1Var == null || (ed1Var = kd1Var.f6378a) == null || (ld1Var = kd1Var.f6379b) == null) {
                    throw new gw0(1, "Empty prefetch");
                }
                vl vlVarB = am.B();
                tl tlVarE = ul.E();
                tlVarE.i();
                ul.B((ul) tlVarE.f4126t);
                xl xlVarD = xl.D();
                tlVarE.i();
                ul.C((ul) tlVarE.f4126t, xlVarD);
                vlVarB.i();
                am.D((am) vlVarB.f4126t, tlVarE.g());
                ed1Var.f4234a.zzb().f4698f.j(vlVarB.g());
                return na1Var.a(ed1Var, ((ma1) ld1Var).f7033b);
        }
    }
}
