package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.ads.zzc;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class u01 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9418a;

    /* renamed from: b, reason: collision with root package name */
    public final wh0 f9419b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f9420c;

    public u01(Context context, wh0 wh0Var, Executor executor) {
        this.f9418a = context;
        this.f9419b = wh0Var;
        this.f9420c = executor;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws JSONException, IOException {
        zzs zzsVar;
        gc1 gc1Var;
        xb1 xb1Var = tb1Var.s;
        JSONObject jSONObject = tb1Var.f9210v;
        boolean z6 = tb1Var.f9184g0;
        IInterface iInterface = b01Var.f2885c;
        Object obj = b01Var.f2884b;
        v31 v31Var = ac1Var.f2647a;
        ec1 ec1Var = (ec1) v31Var.f9702t;
        zzs zzsVar2 = ((ec1) v31Var.f9702t).f4210e;
        boolean z7 = zzsVar2.zzn;
        Context context = this.f9418a;
        if (z7) {
            zzsVar = new zzs(context, zzc.zzd(zzsVar2.zze, zzsVar2.zzb));
        } else {
            zzsVar = (((Boolean) zzbe.zzc().a(zn.J7)).booleanValue() && z6) ? new zzs(context, zzc.zze(zzsVar2.zze, zzsVar2.zzb)) : ed0.g(context, tb1Var.f9208u);
        }
        zzs zzsVar3 = zzsVar;
        if (((Boolean) zzbe.zzc().a(zn.J7)).booleanValue() && z6) {
            rc1 rc1Var = (rc1) obj;
            try {
                rc1Var.f8609a.E(new k3.b(context), zzsVar3, ec1Var.f4209d, jSONObject.toString(), zzbs.zzm(xb1Var), (my) iInterface);
                return;
            } finally {
            }
        }
        rc1 rc1Var2 = (rc1) obj;
        try {
            rc1Var2.f8609a.Z(new k3.b(context), zzsVar3, ec1Var.f4209d, jSONObject.toString(), zzbs.zzm(xb1Var), (my) iInterface);
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, final tb1 tb1Var, b01 b01Var) throws gc1 {
        gc1 gc1Var;
        final View view;
        Object obj = b01Var.f2884b;
        if (((Boolean) zzbe.zzc().a(zn.J7)).booleanValue() && tb1Var.f9184g0) {
            try {
                oy oyVarZzj = ((rc1) obj).f8609a.zzj();
                if (oyVarZzj == null) {
                    zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                    throw new gc1(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
                }
                try {
                    view = (View) k3.b.i1(oyVarZzj.zze());
                    boolean zZzf = oyVarZzj.zzf();
                    if (view == null) {
                        throw new gc1(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                    }
                    if (zZzf) {
                        try {
                            view = (View) bs1.p(ds1.f4001t, new pr1() { // from class: com.google.android.gms.internal.ads.s01
                                @Override // com.google.android.gms.internal.ads.pr1
                                public final c5.a zza(Object obj2) {
                                    return bs1.m(hi0.a(this.f8758a.f9418a, view, tb1Var));
                                }
                            }, i70.f5591f).get();
                        } catch (InterruptedException | ExecutionException e6) {
                            throw new gc1(e6);
                        }
                    }
                } catch (RemoteException e62) {
                    throw new gc1(e62);
                }
            } finally {
            }
        } else {
            try {
                view = (View) k3.b.i1(((rc1) obj).f8609a.zzn());
            } finally {
            }
        }
        rc1 rc1Var = (rc1) obj;
        od0 od0VarA = this.f9419b.a(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new lh0(view, null, new xj1(18, rc1Var), (ub1) tb1Var.f9208u.get(0)));
        ((ln0) od0VarA.Q.zzb()).p0(view);
        ((dl0) od0VarA.f7724y.zzb()).l0(new nf0(rc1Var), this.f9420c);
        ((e11) b01Var.f2885c).e2(new p31((nk0) od0VarA.C.zzb(), (nn0) od0VarA.I.zzb(), (yk0) od0VarA.F.zzb(), (fl0) od0VarA.B.zzb(), od0VarA.r(), (gm0) od0VarA.f7722w.f8334o0.zzb(), (rl0) od0VarA.L.zzb(), (vn0) od0VarA.M.zzb(), (em0) od0VarA.N.zzb(), (vk0) od0VarA.O.zzb()));
        return od0VarA.q();
    }
}
