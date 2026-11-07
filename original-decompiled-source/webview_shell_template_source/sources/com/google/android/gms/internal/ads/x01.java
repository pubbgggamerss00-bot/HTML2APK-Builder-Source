package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x01 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10325a;

    /* renamed from: b, reason: collision with root package name */
    public final wh0 f10326b;

    /* renamed from: c, reason: collision with root package name */
    public View f10327c;

    /* renamed from: d, reason: collision with root package name */
    public oy f10328d;

    public x01(Context context, wh0 wh0Var) {
        this.f10325a = context;
        this.f10326b = wh0Var;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws gc1 {
        try {
            Object obj = b01Var.f2884b;
            IInterface iInterface = b01Var.f2885c;
            String str = tb1Var.Z;
            JSONObject jSONObject = tb1Var.f9210v;
            ((e00) obj).S1(str);
            boolean zBooleanValue = ((Boolean) zzbe.zzc().a(zn.J7)).booleanValue();
            Context context = this.f10325a;
            if (zBooleanValue && tb1Var.f9184g0) {
                ((e00) obj).x1(tb1Var.U, jSONObject.toString(), ((ec1) ac1Var.f2647a.f9702t).f4209d, new k3.b(context), new w01(this, b01Var), (my) iInterface, ((ec1) ac1Var.f2647a.f9702t).f4210e);
            } else {
                ((e00) obj).O1(tb1Var.U, jSONObject.toString(), ((ec1) ac1Var.f2647a.f9702t).f4209d, new k3.b(context), new w01(this, b01Var), (my) iInterface, ((ec1) ac1Var.f2647a.f9702t).f4210e);
            }
        } catch (RemoteException e6) {
            throw new gc1(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws gc1 {
        View view;
        if (((Boolean) zzbe.zzc().a(zn.J7)).booleanValue() && tb1Var.f9184g0) {
            try {
                view = (View) k3.b.i1(this.f10328d.zze());
                boolean zZzf = this.f10328d.zzf();
                if (view == null) {
                    throw new gc1(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) bs1.p(ds1.f4001t, new q01(this, view, tb1Var, 1), i70.f5591f).get();
                    } catch (InterruptedException | ExecutionException e6) {
                        throw new gc1(e6);
                    }
                }
            } catch (RemoteException e7) {
                throw new gc1(e7);
            }
        } else {
            view = this.f10327c;
        }
        od0 od0VarA = this.f10326b.a(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new lh0(view, null, new xj0(10, b01Var), (ub1) tb1Var.f9208u.get(0)));
        ((ln0) od0VarA.Q.zzb()).p0(view);
        ((e11) b01Var.f2885c).e2(new m31((nk0) od0VarA.C.zzb(), (nn0) od0VarA.I.zzb(), (yk0) od0VarA.F.zzb(), (fl0) od0VarA.B.zzb(), od0VarA.r(), (gm0) od0VarA.f7722w.f8334o0.zzb(), (rl0) od0VarA.L.zzb(), (vn0) od0VarA.M.zzb(), (em0) od0VarA.N.zzb(), (vk0) od0VarA.O.zzb()));
        return od0VarA.q();
    }
}
