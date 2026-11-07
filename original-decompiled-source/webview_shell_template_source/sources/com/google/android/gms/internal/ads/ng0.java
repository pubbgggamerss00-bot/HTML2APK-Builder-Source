package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ng0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7440a;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f7441b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f7442c;

    public /* synthetic */ ng0(w92 w92Var, w92 w92Var2, int i6) {
        this.f7440a = i6;
        this.f7441b = w92Var;
        this.f7442c = w92Var2;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        h70 h70Var;
        switch (this.f7440a) {
            case 0:
                xh xhVar = (xh) this.f7441b.zzb();
                rx rxVar = (rx) this.f7442c.zzb();
                if (((Boolean) zzbe.zzc().a(zn.F5)).booleanValue()) {
                    h70Var = i70.f5588c;
                } else {
                    h70Var = ((Boolean) zzbe.zzc().a(zn.E5)).booleanValue() ? i70.f5586a : i70.f5591f;
                }
                ih1.j(h70Var);
                return new gg0(xhVar.f10590c, rxVar, h70Var);
            default:
                return new ov0((fv0) this.f7441b.zzb(), (lt0) this.f7442c.zzb());
        }
    }
}
