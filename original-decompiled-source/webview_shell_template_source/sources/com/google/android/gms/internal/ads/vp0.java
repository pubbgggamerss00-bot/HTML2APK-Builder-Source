package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class vp0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9906a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f9907b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f9908c;

    /* renamed from: d, reason: collision with root package name */
    public final w92 f9909d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f9910e;

    /* renamed from: f, reason: collision with root package name */
    public final ca2 f9911f;

    /* renamed from: g, reason: collision with root package name */
    public final ga2 f9912g;
    public final ga2 h;

    /* renamed from: i, reason: collision with root package name */
    public final ca2 f9913i;

    public vp0(lc0 lc0Var, lk0 lk0Var, ca2 ca2Var, qc0 qc0Var, x92 x92Var, x92 x92Var2, w92 w92Var, w92 w92Var2) {
        this.f9907b = lc0Var;
        this.f9908c = lk0Var;
        this.f9911f = ca2Var;
        this.f9912g = qc0Var;
        this.h = x92Var;
        this.f9913i = x92Var2;
        this.f9910e = w92Var;
        this.f9909d = w92Var2;
    }

    public up0 a() {
        zzj zzjVarZzb = ((lc0) this.f9907b).zzb();
        ec1 ec1VarA = ((lk0) this.f9908c).a();
        mp0 mp0Var = (mp0) this.f9911f.zzb();
        jp0 jp0VarA = ((qc0) this.f9912g).a();
        bq0 bq0Var = (bq0) ((x92) this.h).zzb();
        gq0 gq0Var = (gq0) ((x92) this.f9913i).zzb();
        Executor executor = (Executor) this.f9910e.zzb();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        return new up0(zzjVarZzb, ec1VarA, mp0Var, jp0VarA, bq0Var, gq0Var, executor, h70Var, (hp0) this.f9909d.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.f9906a) {
            case 0:
                return a();
            default:
                return new qr0(((lk0) this.f9907b).a(), (Executor) this.f9908c.zzb(), (ct0) this.f9909d.zzb(), (Context) ((w92) this.f9911f).zzb(), (cu0) this.f9910e.zzb(), (cf1) this.f9912g.zzb(), (dz0) this.h.zzb(), (ms0) ((w92) this.f9913i).zzb());
        }
    }

    public vp0(lk0 lk0Var, w92 w92Var, w92 w92Var2, w92 w92Var3, w92 w92Var4, w92 w92Var5, w92 w92Var6, w92 w92Var7) {
        this.f9907b = lk0Var;
        this.f9908c = w92Var;
        this.f9909d = w92Var2;
        this.f9911f = w92Var3;
        this.f9910e = w92Var4;
        this.f9912g = w92Var5;
        this.h = w92Var6;
        this.f9913i = w92Var7;
    }
}
