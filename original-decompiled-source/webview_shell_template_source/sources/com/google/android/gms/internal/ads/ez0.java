package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ez0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4425a;

    /* renamed from: b, reason: collision with root package name */
    public final oc0 f4426b;

    public /* synthetic */ ez0(oc0 oc0Var, int i6) {
        this.f4425a = i6;
        this.f4426b = oc0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f4425a) {
            case 0:
                Context contextA = this.f4426b.a();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new dz0(contextA, h70Var);
            default:
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new k61(this.f4426b.a(), h70Var2);
        }
    }
}
