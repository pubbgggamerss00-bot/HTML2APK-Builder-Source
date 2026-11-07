package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class iw0 implements yl0, tn0 {
    public final Context s;

    /* renamed from: t, reason: collision with root package name */
    public final cu0 f5874t;

    public iw0(Context context, cu0 cu0Var) {
        this.s = context;
        this.f5874t = cu0Var;
    }

    public final void a(Context context) {
        if (((Boolean) zzbe.zzc().a(zn.G4)).booleanValue()) {
            i70.f5586a.execute(new q(7, this, context));
        }
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void k(r30 r30Var) {
        a(this.s);
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zze(zzbk zzbkVar) {
        a(this.s);
    }

    @Override // com.google.android.gms.internal.ads.yl0
    public final void b0(ac1 ac1Var) {
    }

    @Override // com.google.android.gms.internal.ads.tn0
    public final void zzf(String str) {
    }
}
