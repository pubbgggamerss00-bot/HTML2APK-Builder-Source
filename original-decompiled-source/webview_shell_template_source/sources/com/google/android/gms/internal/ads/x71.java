package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x71 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f10402a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f10403b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f10404c;

    public x71(w92 w92Var, w92 w92Var2, oc0 oc0Var) {
        this.f10402a = w92Var;
        this.f10403b = w92Var2;
        this.f10404c = oc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v71 zzb() {
        return new v71((ApplicationInfo) this.f10402a.zzb(), (PackageInfo) this.f10403b.zzb(), ((oc0) this.f10404c).a());
    }
}
