package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m01 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6898a;

    /* renamed from: b, reason: collision with root package name */
    public final yg0 f6899b;

    /* renamed from: c, reason: collision with root package name */
    public final Executor f6900c;

    public m01(Context context, yg0 yg0Var, h70 h70Var) {
        this.f6898a = context;
        this.f6899b = yg0Var;
        this.f6900c = h70Var;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws gc1 {
        rc1 rc1Var = (rc1) b01Var.f2884b;
        ec1 ec1Var = (ec1) ac1Var.f2647a.f9702t;
        String string = tb1Var.f9210v.toString();
        Context context = this.f6898a;
        my myVar = (my) b01Var.f2885c;
        try {
            rc1Var.f8609a.G1(new k3.b(context), ec1Var.f4209d, string, myVar);
        } catch (Throwable th) {
            throw new gc1(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        ld0 ld0VarA = this.f6899b.a(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new bo0(new xj1(17, b01Var), null), new wg0(tb1Var.f9172a0));
        ((dl0) ld0VarA.f6669y.zzb()).l0(new nf0((rc1) b01Var.f2884b), this.f6900c);
        ((e11) b01Var.f2885c).e2(new p31((nk0) ld0VarA.F.zzb(), (nn0) ld0VarA.H.zzb(), (yk0) ld0VarA.B.zzb(), (fl0) ld0VarA.E.zzb(), (hl0) ld0VarA.I.zzb(), (gm0) ld0VarA.f6668x.f7394d0.zzb(), (rl0) ld0VarA.J.zzb(), (vn0) ld0VarA.K.zzb(), (em0) ld0VarA.L.zzb(), (vk0) ld0VarA.N.zzb()));
        return ld0VarA.q();
    }
}
