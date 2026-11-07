package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class w21 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10022a;

    /* renamed from: b, reason: collision with root package name */
    public final us0 f10023b;

    public w21(Context context, us0 us0Var) {
        this.f10022a = context;
        this.f10023b = us0Var;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        Object obj;
        IInterface iInterface;
        JSONObject jSONObject;
        ec1 ec1Var;
        int i6;
        Context context;
        try {
            obj = b01Var.f2884b;
            iInterface = b01Var.f2885c;
            String str = tb1Var.Z;
            jSONObject = tb1Var.f9210v;
            ((e00) obj).S1(str);
            v31 v31Var = ac1Var.f2647a;
            ec1Var = (ec1) v31Var.f9702t;
            i6 = ((ec1) v31Var.f9702t).f4219o.f2239a;
            context = this.f10022a;
        } catch (RemoteException e6) {
            e = e6;
        }
        try {
            if (i6 == 3) {
                ((e00) obj).w(tb1Var.U, jSONObject.toString(), ec1Var.f4209d, new k3.b(context), new v21(b01Var), (my) iInterface);
            } else {
                ((e00) obj).P(tb1Var.U, jSONObject.toString(), ec1Var.f4209d, new k3.b(context), new v21(b01Var), (my) iInterface);
            }
        } catch (RemoteException e7) {
            e = e7;
            zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        y50 y50Var = new y50(tb1Var, (e00) b01Var.f2884b, AdFormat.REWARDED);
        yd0 yd0VarB = this.f10023b.b(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new ts0(y50Var, null));
        y50Var.f10862v = yd0VarB.m();
        ((e11) b01Var.f2885c).e2(new l31((nk0) yd0VarB.E.zzb(), (nn0) yd0VarB.G.zzb(), (yk0) yd0VarB.A.zzb(), (fl0) yd0VarB.D.zzb(), (hl0) yd0VarB.H.zzb(), (vk0) yd0VarB.N.zzb(), (gm0) yd0VarB.f10922w.f2706g0.zzb(), (vn0) yd0VarB.K.zzb(), (rl0) yd0VarB.J.zzb(), (sn0) yd0VarB.P.zzb(), (em0) yd0VarB.L.zzb()));
        return yd0VarB.s();
    }
}
