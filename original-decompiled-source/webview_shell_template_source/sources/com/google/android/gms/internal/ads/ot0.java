package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ot0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f7856a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f7857b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f7858c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f7859d;

    /* renamed from: e, reason: collision with root package name */
    public final w92 f7860e;

    public ot0(ga2 ga2Var, nw0 nw0Var, ga2 ga2Var2, ca2 ca2Var, w92 w92Var) {
        this.f7856a = ga2Var;
        this.f7857b = nw0Var;
        this.f7858c = ga2Var2;
        this.f7859d = ca2Var;
        this.f7860e = w92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        Context contextA = ((oc0) this.f7856a).a();
        String packageName = ((oc0) ((nw0) this.f7857b).f7527a).a().getPackageName();
        ih1.j(packageName);
        VersionInfoParcel versionInfoParcelA = ((bd0) this.f7858c).a();
        ok okVar = (ok) this.f7859d.zzb();
        String str = (String) this.f7860e.zzb();
        kk kkVar = new kk(new mk(contextA));
        kl klVarE = ll.E();
        int i6 = versionInfoParcelA.buddyApkVersion;
        klVarE.i();
        ll.B((ll) klVarE.f4126t, i6);
        int i7 = versionInfoParcelA.clientJarVersion;
        klVarE.i();
        ll.D((ll) klVarE.f4126t, i7);
        int i8 = true != versionInfoParcelA.isClientJar ? 2 : 0;
        klVarE.i();
        ll.C((ll) klVarE.f4126t, i8);
        ll llVarG = klVarE.g();
        eu euVar = new eu();
        euVar.f4395t = okVar;
        euVar.s = packageName;
        euVar.f4396u = llVarG;
        euVar.f4397v = str;
        kkVar.a(euVar);
        return kkVar;
    }
}
