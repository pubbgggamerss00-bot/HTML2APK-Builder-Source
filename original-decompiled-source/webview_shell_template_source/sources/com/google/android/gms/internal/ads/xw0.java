package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xw0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final ga2 f10725a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f10726b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f10727c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f10728d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f10729e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f10730f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f10731g;
    public final ga2 h;

    public xw0(y92 y92Var, oc0 oc0Var, bd0 bd0Var, lk0 lk0Var, x92 x92Var, w92 w92Var, w92 w92Var2, w92 w92Var3) {
        this.f10725a = y92Var;
        this.f10726b = oc0Var;
        this.f10727c = bd0Var;
        this.f10728d = lk0Var;
        this.f10729e = x92Var;
        this.f10730f = w92Var;
        this.f10731g = w92Var2;
        this.h = w92Var3;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ww0 zzb() {
        hc0 hc0Var = (hc0) this.f10725a.zzb();
        Context contextA = ((oc0) this.f10726b).a();
        VersionInfoParcel versionInfoParcelA = ((bd0) this.f10727c).a();
        ec1 ec1VarA = ((lk0) this.f10728d).a();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        String str = (String) this.f10729e.zzb();
        he1 he1Var = (he1) this.f10730f.zzb();
        zt0 zt0Var = (zt0) this.f10731g.zzb();
        ed0 ed0Var = new ed0(14);
        new f0(26);
        return new ww0(hc0Var, contextA, versionInfoParcelA, ec1VarA, h70Var, str, he1Var, zt0Var, ed0Var, (ScheduledExecutorService) this.h.zzb());
    }
}
