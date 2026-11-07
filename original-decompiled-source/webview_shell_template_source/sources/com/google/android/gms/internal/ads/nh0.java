package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7443a;

    /* renamed from: b, reason: collision with root package name */
    public final lh0 f7444b;

    public /* synthetic */ nh0(lh0 lh0Var, int i6) {
        this.f7443a = i6;
        this.f7444b = lh0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f7443a) {
            case 0:
                View view = this.f7444b.f6732b;
                ih1.j(view);
                return view;
            default:
                return this.f7444b.f6734d;
        }
    }
}
