package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nc0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7383a;

    /* renamed from: b, reason: collision with root package name */
    public final oc0 f7384b;

    public /* synthetic */ nc0(oc0 oc0Var, int i6) {
        this.f7383a = i6;
        this.f7384b = oc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f7383a) {
            case 0:
                ApplicationInfo applicationInfo = this.f7384b.a().getApplicationInfo();
                ih1.j(applicationInfo);
                return applicationInfo;
            default:
                return new l91(this.f7384b.a());
        }
    }
}
