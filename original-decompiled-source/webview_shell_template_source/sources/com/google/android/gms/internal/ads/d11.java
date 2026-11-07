package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d11 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final wh0 f3726a;

    /* renamed from: b, reason: collision with root package name */
    public final r01 f3727b;

    /* renamed from: c, reason: collision with root package name */
    public final hs1 f3728c;

    /* renamed from: d, reason: collision with root package name */
    public final qk0 f3729d;

    /* renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f3730e;

    /* renamed from: f, reason: collision with root package name */
    public final zt0 f3731f;

    public d11(wh0 wh0Var, r01 r01Var, qk0 qk0Var, ScheduledExecutorService scheduledExecutorService, hs1 hs1Var, zt0 zt0Var) {
        this.f3726a = wh0Var;
        this.f3727b = r01Var;
        this.f3729d = qk0Var;
        this.f3730e = scheduledExecutorService;
        this.f3728c = hs1Var;
        this.f3731f = zt0Var;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        ps psVarA = ((ec1) ac1Var.f2647a.f9702t).a();
        boolean zA = this.f3727b.a(ac1Var, tb1Var);
        if (((Boolean) zzbe.zzc().a(zn.Qb)).booleanValue()) {
            String str = psVarA != null ? "1" : "0";
            zt0 zt0Var = this.f3731f;
            zt0Var.f11575a.put("has_dbl", str);
            zt0Var.f11575a.put("crdb", true == zA ? "1" : "0");
        }
        return psVarA != null && zA;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(final ac1 ac1Var, final tb1 tb1Var) {
        return this.f3728c.u(new Callable() { // from class: com.google.android.gms.internal.ads.b11
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ac1 ac1Var2 = ac1Var;
                tb1 tb1Var2 = tb1Var;
                androidx.camera.view.b bVar = new androidx.camera.view.b(ac1Var2, tb1Var2, null);
                ps psVarA = ((ec1) ac1Var2.f2647a.f9702t).a();
                d11 d11Var = this.f2889a;
                fi0 fi0Var = (fi0) d11Var.f3726a.b(bVar, new ni0(8, psVarA, new c11(d11Var, ac1Var2, tb1Var2, 0))).f8611a.zzb();
                ih1.j(fi0Var);
                return fi0Var;
            }
        });
    }
}
