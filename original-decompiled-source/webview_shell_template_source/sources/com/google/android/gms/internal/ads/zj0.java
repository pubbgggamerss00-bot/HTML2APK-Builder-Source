package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.zzv;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zj0 implements x92 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11309a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final ga2 f11310b;

    /* renamed from: c, reason: collision with root package name */
    public final ga2 f11311c;

    /* renamed from: d, reason: collision with root package name */
    public final ga2 f11312d;

    /* renamed from: e, reason: collision with root package name */
    public final ga2 f11313e;

    public zj0(w92 w92Var, bd0 bd0Var, qi0 qi0Var, lk0 lk0Var) {
        this.f11310b = w92Var;
        this.f11312d = bd0Var;
        this.f11311c = qi0Var;
        this.f11313e = lk0Var;
    }

    @Override // com.google.android.gms.internal.ads.ga2
    public final Object zzb() {
        switch (this.f11309a) {
            case 0:
                yk0 yk0Var = (yk0) ((w92) this.f11312d).zzb();
                tb1 tb1VarA = ((qi0) this.f11311c).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f11310b.zzb();
                h70 h70Var = i70.f5586a;
                ih1.j(h70Var);
                return new yj0(yk0Var, tb1VarA, scheduledExecutorService, h70Var, (String) ((androidx.camera.view.b) ((pc0) this.f11313e).f8025b).f676v);
            case 1:
                final Context context = (Context) this.f11310b.zzb();
                final VersionInfoParcel versionInfoParcelA = ((bd0) this.f11312d).a();
                final tb1 tb1VarA2 = ((qi0) this.f11311c).a();
                final ec1 ec1VarA = ((lk0) this.f11313e).a();
                return new kn0(new jl0() { // from class: com.google.android.gms.internal.ads.zn0
                    @Override // com.google.android.gms.internal.ads.jl0
                    public final void t() {
                        zzay zzayVarZzt = zzv.zzt();
                        JSONObject jSONObject = tb1VarA2.C;
                        zzayVarZzt.zzn(context, versionInfoParcelA.afmaVersion, jSONObject.toString(), ec1VarA.f4211f);
                    }
                }, i70.f5592g);
            default:
                xh xhVar = (xh) ((w92) this.f11312d).zzb();
                Executor executor = (Executor) this.f11310b.zzb();
                Context context2 = (Context) this.f11311c.zzb();
                return new sg0(executor, new hg0(context2, xhVar), (i3.a) this.f11313e.zzb());
        }
    }

    public zj0(w92 w92Var, qi0 qi0Var, w92 w92Var2, pc0 pc0Var) {
        this.f11312d = w92Var;
        this.f11311c = qi0Var;
        this.f11310b = w92Var2;
        this.f11313e = pc0Var;
    }

    public zj0(w92 w92Var, w92 w92Var2, w92 w92Var3, w92 w92Var4) {
        this.f11312d = w92Var;
        this.f11310b = w92Var2;
        this.f11311c = w92Var3;
        this.f11313e = w92Var4;
    }
}
