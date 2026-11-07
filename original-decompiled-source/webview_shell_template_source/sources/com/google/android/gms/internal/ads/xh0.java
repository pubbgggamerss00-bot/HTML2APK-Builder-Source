package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class xh0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10593a;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f10594b;

    /* renamed from: c, reason: collision with root package name */
    public final ca2 f10595c;

    /* renamed from: d, reason: collision with root package name */
    public final ca2 f10596d;

    public xh0(w92 w92Var, bd0 bd0Var, y92 y92Var) {
        this.f10593a = 2;
        this.f10595c = w92Var;
        this.f10594b = bd0Var;
        this.f10596d = y92Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f10593a) {
            case 0:
                return ((lk0) this.f10594b).a().a() != null ? ((zx0) this.f10595c).a() : ((au0) this.f10596d).a();
            case 1:
                return new tr0((String) ((androidx.camera.view.b) ((pc0) this.f10594b).f8025b).f676v, (fp0) ((pc0) this.f10595c).zzb(), ((qc0) this.f10596d).a());
            case 2:
                Context context = (Context) ((w92) this.f10595c).zzb();
                VersionInfoParcel versionInfoParcelA = ((bd0) this.f10594b).a();
                go0 go0Var = (go0) ((y92) this.f10596d).f10908a;
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new o11(context, versionInfoParcelA, go0Var, h70Var);
            default:
                f61 f61VarZzb = ((h61) this.f10594b).zzb();
                i3.a aVar = (i3.a) ((w92) this.f10595c).zzb();
                h70 h70Var2 = i70.f5586a;
                ih1.j(h70Var2);
                return new n61(f61VarZzb, ((Long) jp.f6117b.c()).longValue(), aVar, h70Var2, (cu0) ((w92) this.f10596d).zzb());
        }
    }

    public /* synthetic */ xh0(x92 x92Var, ca2 ca2Var, ca2 ca2Var2, int i6) {
        this.f10593a = i6;
        this.f10594b = x92Var;
        this.f10595c = ca2Var;
        this.f10596d = ca2Var2;
    }
}
