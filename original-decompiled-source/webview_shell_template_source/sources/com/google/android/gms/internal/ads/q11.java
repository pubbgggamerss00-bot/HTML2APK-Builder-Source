package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class q11 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8193a;

    /* renamed from: b, reason: collision with root package name */
    public final go0 f8194b;

    public q11(Context context, go0 go0Var) {
        this.f8193a = context;
        this.f8194b = go0Var;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws gc1 {
        Object obj = b01Var.f2884b;
        try {
            ((e00) obj).S1(tb1Var.Z);
            ((e00) obj).o0(tb1Var.U, tb1Var.f9210v.toString(), ((ec1) ac1Var.f2647a.f9702t).f4209d, new k3.b(this.f8193a), new p11(b01Var), (my) b01Var.f2885c);
        } catch (RemoteException e6) {
            zze.zzb("Remote exception loading a interstitial RTB ad", e6);
            throw new gc1(e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        y50 y50Var = new y50(tb1Var, (e00) b01Var.f2884b, AdFormat.INTERSTITIAL);
        ud0 ud0VarA = this.f8194b.a(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new bo0(y50Var, null));
        y50Var.f10862v = ud0VarA.m();
        ((e11) b01Var.f2885c).e2(new m31((nk0) ud0VarA.E.zzb(), (nn0) ud0VarA.H.zzb(), (yk0) ud0VarA.A.zzb(), (fl0) ud0VarA.D.zzb(), (hl0) ud0VarA.I.zzb(), (gm0) ud0VarA.f9534w.f10522i0.zzb(), (rl0) ud0VarA.K.zzb(), (vn0) ud0VarA.L.zzb(), (em0) ud0VarA.M.zzb(), (vk0) ud0VarA.O.zzb()));
        return ud0VarA.q();
    }
}
