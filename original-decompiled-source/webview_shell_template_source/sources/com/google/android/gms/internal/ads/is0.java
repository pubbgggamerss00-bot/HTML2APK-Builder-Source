package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class is0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5832a = 2;

    /* renamed from: b, reason: collision with root package name */
    public final w92 f5833b;

    /* renamed from: c, reason: collision with root package name */
    public final ca2 f5834c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f5835d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f5836e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f5837f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f5838g;
    public final ga2 h;

    /* renamed from: i, reason: collision with root package name */
    public final ga2 f5839i;

    /* renamed from: j, reason: collision with root package name */
    public final ga2 f5840j;

    public is0(oc0 oc0Var, sc0 sc0Var, w92 w92Var, w92 w92Var2, w92 w92Var3, lk0 lk0Var, w92 w92Var4, w92 w92Var5, w92 w92Var6) {
        this.f5835d = oc0Var;
        this.f5834c = sc0Var;
        this.f5836e = w92Var;
        this.f5833b = w92Var2;
        this.f5837f = w92Var3;
        this.f5838g = lk0Var;
        this.h = w92Var4;
        this.f5839i = w92Var5;
        this.f5840j = w92Var6;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f5832a) {
            case 0:
                Context contextA = ((oc0) this.f5835d).a();
                Executor executor = (Executor) this.f5833b.zzb();
                mf mfVar = (mf) ((w92) this.f5834c).zzb();
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f5840j).a();
                zza zzaVarA = de0.a();
                new ib0();
                return new es0(contextA, executor, mfVar, versionInfoParcelA, zzaVarA, (dz0) ((w92) this.f5836e).zzb(), (cf1) ((w92) this.f5837f).zzb(), (cu0) ((w92) this.f5838g).zzb(), (oz0) ((w92) this.h).zzb(), (fc1) ((w92) this.f5839i).zzb());
            case 1:
                return new k01((yg0) ((y92) this.f5835d).f10908a, (Context) this.f5833b.zzb(), (Executor) this.f5836e.zzb(), (ct0) ((w92) this.f5834c).zzb(), ((lk0) this.f5837f).a(), ((bd0) this.f5838g).a(), new bu(), (oz0) this.h.zzb(), (zt0) this.f5839i.zzb(), (cu0) this.f5840j.zzb());
            default:
                Context contextA2 = ((oc0) this.f5835d).a();
                String str = ((hj0) ((sc0) this.f5834c).f8893b.zzb()).f5430t.f9726e;
                ih1.j(str);
                return new y51(contextA2, str, (String) this.f5836e.zzb(), (hj0) this.f5833b.zzb(), (uc1) this.f5837f.zzb(), ((lk0) this.f5838g).a(), (zt0) this.h.zzb(), (mj0) this.f5839i.zzb(), ((Long) this.f5840j.zzb()).longValue());
        }
    }

    public is0(oc0 oc0Var, w92 w92Var, w92 w92Var2, bd0 bd0Var, de0 de0Var, w92 w92Var3, w92 w92Var4, w92 w92Var5, w92 w92Var6, w92 w92Var7) {
        this.f5835d = oc0Var;
        this.f5833b = w92Var;
        this.f5834c = w92Var2;
        this.f5840j = bd0Var;
        this.f5836e = w92Var3;
        this.f5837f = w92Var4;
        this.f5838g = w92Var5;
        this.h = w92Var6;
        this.f5839i = w92Var7;
    }

    public is0(y92 y92Var, w92 w92Var, w92 w92Var2, w92 w92Var3, lk0 lk0Var, bd0 bd0Var, w92 w92Var4, w92 w92Var5, w92 w92Var6) {
        this.f5835d = y92Var;
        this.f5833b = w92Var;
        this.f5836e = w92Var2;
        this.f5834c = w92Var3;
        this.f5837f = lk0Var;
        this.f5838g = bd0Var;
        this.h = w92Var4;
        this.f5839i = w92Var5;
        this.f5840j = w92Var6;
    }
}
