package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x11 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10330a;

    /* renamed from: b, reason: collision with root package name */
    public final uo0 f10331b;

    /* renamed from: c, reason: collision with root package name */
    public ty f10332c;

    /* renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f10333d;

    public x11(Context context, uo0 uo0Var, VersionInfoParcel versionInfoParcel) {
        this.f10330a = context;
        this.f10331b = uo0Var;
        this.f10333d = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws gc1 {
        try {
            Object obj = b01Var.f2884b;
            IInterface iInterface = b01Var.f2885c;
            String str = tb1Var.Z;
            JSONObject jSONObject = tb1Var.f9210v;
            ((e00) obj).S1(str);
            int i6 = this.f10333d.clientJarVersion;
            int iIntValue = ((Integer) zzbe.zzc().a(zn.P1)).intValue();
            Context context = this.f10330a;
            if (i6 < iIntValue) {
                ((e00) obj).M(tb1Var.U, jSONObject.toString(), ((ec1) ac1Var.f2647a.f9702t).f4209d, new k3.b(context), new w11(this, b01Var), (my) iInterface);
            } else {
                ((e00) obj).Y(tb1Var.U, jSONObject.toString(), ((ec1) ac1Var.f2647a.f9702t).f4209d, new k3.b(context), new w11(this, b01Var), (my) iInterface, ((ec1) ac1Var.f2647a.f9702t).f4213i);
            }
        } catch (RemoteException e6) {
            throw new gc1(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws p21 {
        if (!((ec1) ac1Var.f2647a.f9702t).f4212g.contains(Integer.toString(6))) {
            throw new p21(2, "Unified must be used for RTB.");
        }
        jp0 jp0VarN = jp0.n(this.f10332c);
        ec1 ec1Var = (ec1) ac1Var.f2647a.f9702t;
        if (!ec1Var.f4212g.contains(Integer.toString(jp0VarN.g()))) {
            throw new p21(1, "No corresponding native ad listener");
        }
        ce0 ce0VarB = this.f10331b.b(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new ck1(5, jp0VarN), new mq0(null, null, this.f10332c));
        ((e11) b01Var.f2885c).e2(new m31((nk0) ce0VarB.f3539w.zzb(), (nn0) ce0VarB.f3541y.zzb(), (yk0) ce0VarB.f3540x.zzb(), (fl0) ce0VarB.f3538v.zzb(), (hl0) ce0VarB.f3542z.zzb(), (gm0) ce0VarB.f3536t.f5691f0.zzb(), (rl0) ce0VarB.A.zzb(), (vn0) ce0VarB.B.zzb(), (em0) ce0VarB.C.zzb(), (vk0) ce0VarB.D.zzb()));
        return ce0VarB.r();
    }
}
