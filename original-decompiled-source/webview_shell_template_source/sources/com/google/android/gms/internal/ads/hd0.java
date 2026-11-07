package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class hd0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final oc0 f5339a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f5340b;

    public hd0(oc0 oc0Var, w92 w92Var) {
        this.f5339a = oc0Var;
        this.f5340b = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final n30 zzb() {
        Context contextA = this.f5339a.a();
        ie1 ie1Var = (ie1) this.f5340b.zzb();
        lx lxVarB = zzv.zzg().b(contextA, VersionInfoParcel.forPackage(), ie1Var);
        fo foVar = kx.f6519b;
        lxVarB.getClass();
        return new n30(contextA, zzv.zzg().b(contextA, VersionInfoParcel.forPackage(), ie1Var).a("google.afma.sdkConstants.getSdkConstants", foVar, foVar), VersionInfoParcel.forPackage());
    }
}
