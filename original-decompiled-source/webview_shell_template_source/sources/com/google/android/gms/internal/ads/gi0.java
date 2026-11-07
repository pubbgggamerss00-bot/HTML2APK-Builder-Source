package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class gi0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5054a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f5055b;

    /* renamed from: c, reason: collision with root package name */
    public final ca2 f5056c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f5057d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f5058e;

    public /* synthetic */ gi0(x92 x92Var, x92 x92Var2, ca2 ca2Var, w92 w92Var, int i6) {
        this.f5054a = i6;
        this.f5056c = x92Var;
        this.f5057d = x92Var2;
        this.f5058e = ca2Var;
        this.f5055b = w92Var;
    }

    public t81 a() {
        Context contextA = ((oc0) this.f5055b).a();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new t81(contextA, h70Var, ((ea2) this.f5056c).zzb(), (he1) this.f5057d.zzb(), (cu0) this.f5058e.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f5054a) {
            case 0:
                si0 si0VarA = ((nj0) this.f5056c).a();
                ps psVar = (ps) ((ni0) ((af0) this.f5057d).f2738b).f7447t;
                ih1.j(psVar);
                return new fi0(si0VarA, psVar, (c11) ((ni0) ((cd0) this.f5058e).f3521b).f7448u, (Executor) this.f5055b.zzb());
            case 1:
                return new pr0((Executor) this.f5055b.zzb(), (sg0) ((w92) this.f5056c).zzb(), (ln0) ((w92) this.f5057d).zzb(), (vf0) ((w92) this.f5058e).zzb());
            case 2:
                return a();
            default:
                return new zf1(((oc0) this.f5056c).a(), ((bd0) this.f5057d).a(), (ScheduledExecutorService) ((w92) this.f5058e).zzb(), (i3.a) ((w92) this.f5055b).zzb());
        }
    }

    public /* synthetic */ gi0(ca2 ca2Var, ca2 ca2Var2, w92 w92Var, w92 w92Var2, int i6) {
        this.f5054a = i6;
        this.f5055b = ca2Var;
        this.f5056c = ca2Var2;
        this.f5057d = w92Var;
        this.f5058e = w92Var2;
    }
}
