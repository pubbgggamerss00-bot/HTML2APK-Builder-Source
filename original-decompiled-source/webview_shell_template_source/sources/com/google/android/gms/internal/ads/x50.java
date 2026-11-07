package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x50 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10384a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f10385b;

    /* renamed from: c, reason: collision with root package name */
    public final y92 f10386c;

    public x50(w92 w92Var, y92 y92Var) {
        this.f10385b = w92Var;
        this.f10386c = y92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10384a) {
            case 0:
                return new r0((i3.a) this.f10386c.f10908a, (u50) this.f10385b.zzb());
            default:
                return new o01((Context) this.f10385b.zzb(), (yg0) this.f10386c.f10908a);
        }
    }

    public x50(y92 y92Var, w92 w92Var) {
        this.f10386c = y92Var;
        this.f10385b = w92Var;
    }
}
