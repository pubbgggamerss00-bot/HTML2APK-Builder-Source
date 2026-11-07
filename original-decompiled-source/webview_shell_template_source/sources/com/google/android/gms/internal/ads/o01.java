package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o01 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7555a;

    /* renamed from: b, reason: collision with root package name */
    public final yg0 f7556b;

    public o01(Context context, yg0 yg0Var) {
        this.f7555a = context;
        this.f7556b = yg0Var;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws gc1 {
        Object obj = b01Var.f2884b;
        try {
            ((e00) obj).S1(tb1Var.Z);
            ((e00) obj).R0(tb1Var.U, tb1Var.f9210v.toString(), ((ec1) ac1Var.f2647a.f9702t).f4209d, new k3.b(this.f7555a), new n01(b01Var), (my) b01Var.f2885c);
        } catch (RemoteException e6) {
            zze.zzb("Remote exception loading an app open RTB ad", e6);
            throw new gc1(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        y50 y50Var = new y50(tb1Var, (e00) b01Var.f2884b, AdFormat.APP_OPEN_AD);
        ld0 ld0VarA = this.f7556b.a(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new bo0(y50Var, null), new wg0(tb1Var.f9172a0));
        y50Var.f10862v = ld0VarA.m();
        ((e11) b01Var.f2885c).e2(new m31((nk0) ld0VarA.F.zzb(), (nn0) ld0VarA.H.zzb(), (yk0) ld0VarA.B.zzb(), (fl0) ld0VarA.E.zzb(), (hl0) ld0VarA.I.zzb(), (gm0) ld0VarA.f6668x.f7394d0.zzb(), (rl0) ld0VarA.J.zzb(), (vn0) ld0VarA.K.zzb(), (em0) ld0VarA.L.zzb(), (vk0) ld0VarA.N.zzb()));
        return ld0VarA.q();
    }
}
