package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbe;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l51 implements q81 {

    /* renamed from: a, reason: collision with root package name */
    public final hs1 f6579a;

    /* renamed from: b, reason: collision with root package name */
    public final mt0 f6580b;

    /* renamed from: c, reason: collision with root package name */
    public final fv0 f6581c;

    /* renamed from: d, reason: collision with root package name */
    public final n51 f6582d;

    public l51(hs1 hs1Var, mt0 mt0Var, fv0 fv0Var, n51 n51Var) {
        this.f6579a = hs1Var;
        this.f6580b = mt0Var;
        this.f6581c = fv0Var;
        this.f6582d = n51Var;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.q81
    public final c5.a zzb() {
        m51 m51Var;
        nn nnVar = zn.xb;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().a(nnVar)).booleanValue();
        n51 n51Var = this.f6582d;
        if (zBooleanValue && (m51Var = n51Var.f7316b) != null) {
            return bs1.m(m51Var);
        }
        if (rj1.j((String) zzbe.zzc().a(zn.f11517z1)) || (!((Boolean) zzbe.zzc().a(nnVar)).booleanValue() && (n51Var.f7315a.get() || !this.f6581c.f4788b))) {
            return bs1.m(new m51(new Bundle(), 0));
        }
        n51Var.f7315a.set(true);
        return this.f6579a.u(new x60(2, this));
    }
}
