package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class et0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4383a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f4384b;

    /* renamed from: c, reason: collision with root package name */
    public final w92 f4385c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f4386d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f4387e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f4388f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f4389g;
    public final ga2 h;

    /* renamed from: i, reason: collision with root package name */
    public final ga2 f4390i;

    /* renamed from: j, reason: collision with root package name */
    public final ca2 f4391j;

    public et0(w92 w92Var, w92 w92Var2, w92 w92Var3, bd0 bd0Var, de0 de0Var, w92 w92Var4, x92 x92Var, w92 w92Var5, w92 w92Var6) {
        this.f4384b = w92Var;
        this.f4386d = w92Var2;
        this.f4385c = w92Var3;
        this.f4387e = bd0Var;
        this.f4388f = de0Var;
        this.f4389g = w92Var4;
        this.f4391j = x92Var;
        this.h = w92Var5;
        this.f4390i = w92Var6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f4383a) {
            case 0:
                new ib0();
                Context context = (Context) this.f4384b.zzb();
                mf mfVar = (mf) this.f4386d.zzb();
                cp cpVar = (cp) this.f4385c.zzb();
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f4387e).a();
                f0 f0Var = ((de0) this.f4388f).f3865a;
                return new ct0(context, mfVar, cpVar, versionInfoParcelA, de0.a(), (kk) this.f4389g.zzb(), (wl0) ((x92) this.f4391j).zzb(), (oz0) this.h.zzb(), (fc1) this.f4390i.zzb());
            default:
                return new m41((Context) ((y92) this.f4389g).f10908a, (zzs) ((y92) this.h).f10908a, (String) ((y92) this.f4390i).f10908a, (fb1) this.f4384b.zzb(), (j41) this.f4385c.zzb(), (hb1) ((w92) this.f4391j).zzb(), ((bd0) this.f4386d).a(), (mf) this.f4387e.zzb(), (cu0) this.f4388f.zzb());
        }
    }

    public et0(y92 y92Var, y92 y92Var2, y92 y92Var3, w92 w92Var, w92 w92Var2, w92 w92Var3, bd0 bd0Var, w92 w92Var4, w92 w92Var5) {
        this.f4389g = y92Var;
        this.h = y92Var2;
        this.f4390i = y92Var3;
        this.f4384b = w92Var;
        this.f4385c = w92Var2;
        this.f4391j = w92Var3;
        this.f4386d = bd0Var;
        this.f4387e = w92Var4;
        this.f4388f = w92Var5;
    }
}
