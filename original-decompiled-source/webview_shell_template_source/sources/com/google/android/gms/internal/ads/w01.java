package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w01 extends qz {
    public final b01 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x01 f10004t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w01(x01 x01Var, b01 b01Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
        this.f10004t = x01Var;
        this.s = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.rz
    public final void t(k3.a aVar) {
        this.f10004t.f10327c = (View) k3.b.i1(aVar);
        ((e11) this.s.f2885c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.rz
    public final void z1(oy oyVar) {
        this.f10004t.f10328d = oyVar;
        ((e11) this.s.f2885c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.rz
    public final void zze(String str) {
        ((e11) this.s.f2885c).K(0, str);
    }

    @Override // com.google.android.gms.internal.ads.rz
    public final void zzf(zze zzeVar) {
        ((e11) this.s.f2885c).T(zzeVar);
    }
}
