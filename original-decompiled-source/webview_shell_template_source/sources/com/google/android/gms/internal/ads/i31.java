package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i31 implements f01 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5543a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f5544b;

    /* renamed from: c, reason: collision with root package name */
    public final us0 f5545c;

    public i31(Context context, Executor executor, us0 us0Var) {
        this.f5543a = context;
        this.f5544b = executor;
        this.f5545c = us0Var;
    }

    public static final void c(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        try {
            rc1 rc1Var = (rc1) b01Var.f2884b;
            try {
                rc1Var.f8609a.d1(((ec1) ac1Var.f2647a.f9702t).f4209d, tb1Var.f9210v.toString());
            } catch (Throwable th) {
                throw new gc1(th);
            }
        } catch (Exception e6) {
            zzo.zzk("Fail to load ad from adapter ".concat(String.valueOf(b01Var.f2883a)), e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final void a(ac1 ac1Var, tb1 tb1Var, b01 b01Var) throws gc1 {
        if (((rc1) b01Var.f2884b).a()) {
            c(ac1Var, tb1Var, b01Var);
            return;
        }
        g31 g31Var = new g31(this, ac1Var, tb1Var, b01Var);
        f11 f11Var = (f11) b01Var.f2885c;
        synchronized (f11Var) {
            f11Var.f4441u = g31Var;
        }
        Object obj = b01Var.f2884b;
        Context context = this.f5543a;
        rc1 rc1Var = (rc1) obj;
        ec1 ec1Var = (ec1) ac1Var.f2647a.f9702t;
        k40 k40Var = (k40) b01Var.f2885c;
        String string = tb1Var.f9210v.toString();
        try {
            rc1Var.f8609a.k1(new k3.b(context), ec1Var.f4209d, k40Var, string);
        } catch (Throwable th) {
            throw new gc1(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.f01
    public final Object b(ac1 ac1Var, tb1 tb1Var, b01 b01Var) {
        yd0 yd0VarB = this.f5545c.b(new androidx.camera.view.b(ac1Var, tb1Var, b01Var.f2883a), new ts0(new t21(b01Var, 1), null));
        yd0VarB.u().l0(new nf0((rc1) b01Var.f2884b), this.f5544b);
        fl0 fl0Var = (fl0) yd0VarB.D.zzb();
        nk0 nk0VarI = yd0VarB.i();
        rl0 rl0Var = (rl0) yd0VarB.J.zzb();
        sn0 sn0VarQ = yd0VarB.q();
        f11 f11Var = (f11) b01Var.f2885c;
        h31 h31Var = new h31(rl0Var, nk0VarI, fl0Var, sn0VarQ);
        synchronized (f11Var) {
            f11Var.s = h31Var;
        }
        return yd0VarB.s();
    }
}
