package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbs;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class o11 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7564a;

    /* renamed from: b, reason: collision with root package name */
    public final go0 f7565b;

    /* renamed from: c, reason: collision with root package name */
    public final VersionInfoParcel f7566c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f7567d;

    public o11(Context context, VersionInfoParcel versionInfoParcel, go0 go0Var, h70 h70Var) {
        this.f7564a = context;
        this.f7566c = versionInfoParcel;
        this.f7565b = go0Var;
        this.f7567d = h70Var;
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws JSONException, gc1, IOException {
        rc1 rc1Var = (rc1) b01Var.f2884b;
        ec1 ec1Var = (ec1) ac1Var.f2647a.f9702t;
        String string = tb1Var.f9210v.toString();
        String strZzm = zzbs.zzm(tb1Var.s);
        Context context = this.f7564a;
        my myVar = (my) b01Var.f2885c;
        try {
            rc1Var.f8609a.o1(new k3.b(context), ec1Var.f4209d, string, strZzm, myVar);
        } catch (Throwable th) {
            throw new gc1(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        ud0 ud0VarA = this.f7565b.a(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new bo0(new lo(7, this, b01Var), null));
        ((dl0) ud0VarA.f9535x.zzb()).l0(new nf0((rc1) b01Var.f2884b), this.f7567d);
        ((e11) b01Var.f2885c).e2(new p31((nk0) ud0VarA.E.zzb(), (nn0) ud0VarA.H.zzb(), (yk0) ud0VarA.A.zzb(), (fl0) ud0VarA.D.zzb(), (hl0) ud0VarA.I.zzb(), (gm0) ud0VarA.f9534w.f10522i0.zzb(), (rl0) ud0VarA.K.zzb(), (vn0) ud0VarA.L.zzb(), (em0) ud0VarA.M.zzb(), (vk0) ud0VarA.O.zzb()));
        return ud0VarA.q();
    }
}
