package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e91 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4171a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f4172b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f4173c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f4174d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f4175e;

    /* renamed from: f, reason: collision with root package name */
    public final ga2 f4176f;

    /* renamed from: g, reason: collision with root package name */
    public final ca2 f4177g;

    public e91(lc0 lc0Var, oc0 oc0Var, w92 w92Var, bi0 bi0Var, lk0 lk0Var, bd0 bd0Var) {
        this.f4172b = lc0Var;
        this.f4173c = oc0Var;
        this.f4174d = w92Var;
        this.f4177g = bi0Var;
        this.f4175e = lk0Var;
        this.f4176f = bd0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f4171a) {
            case 0:
                zzj zzjVarZzb = ((lc0) this.f4172b).zzb();
                Context contextA = ((oc0) this.f4173c).a();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new c91(zzjVarZzb, contextA, h70Var, (ScheduledExecutorService) this.f4174d.zzb(), new xz0(((oc0) ((bi0) this.f4177g).f3184b).a()), ((lk0) this.f4175e).a(), ((bd0) this.f4176f).a());
            default:
                return new kc1((cf1) this.f4172b.zzb(), (ze1) this.f4173c.zzb(), ((qi0) this.f4175e).a(), ((androidx.camera.view.b) ((qc0) this.f4176f).f8305b).a(), (vf0) ((w92) this.f4177g).zzb(), (he1) this.f4174d.zzb());
        }
    }

    public e91(w92 w92Var, w92 w92Var2, qi0 qi0Var, qc0 qc0Var, w92 w92Var3, w92 w92Var4) {
        this.f4172b = w92Var;
        this.f4173c = w92Var2;
        this.f4175e = qi0Var;
        this.f4176f = qc0Var;
        this.f4177g = w92Var3;
        this.f4174d = w92Var4;
    }
}
