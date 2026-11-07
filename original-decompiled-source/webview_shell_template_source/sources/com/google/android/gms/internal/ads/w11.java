package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w11 extends wz {
    public final b01 s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ x11 f10012t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w11(x11 x11Var, b01 b01Var) {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
        this.f10012t = x11Var;
        this.s = b01Var;
    }

    @Override // com.google.android.gms.internal.ads.xz
    public final void q0(ty tyVar) {
        this.f10012t.f10332c = tyVar;
        ((e11) this.s.f2885c).zzo();
    }

    @Override // com.google.android.gms.internal.ads.xz
    public final void zze(String str) {
        ((e11) this.s.f2885c).K(0, str);
    }

    @Override // com.google.android.gms.internal.ads.xz
    public final void zzf(zze zzeVar) {
        ((e11) this.s.f2885c).T(zzeVar);
    }
}
