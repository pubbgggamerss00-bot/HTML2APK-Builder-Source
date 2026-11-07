package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class k01 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final yg0 f6203a;

    /* renamed from: b, reason: collision with root package name */
    public final ct0 f6204b;

    /* renamed from: c, reason: collision with root package name */
    public final ec1 f6205c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f6206d;

    /* renamed from: e, reason: collision with root package name */
    public final VersionInfoParcel f6207e;

    /* renamed from: f, reason: collision with root package name */
    public final bu f6208f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6209g = ((Boolean) zzbe.zzc().a(zn.M8)).booleanValue();
    public final oz0 h;

    /* renamed from: i, reason: collision with root package name */
    public final zt0 f6210i;

    /* renamed from: j, reason: collision with root package name */
    public final cu0 f6211j;

    public k01(yg0 yg0Var, Context context, Executor executor, ct0 ct0Var, ec1 ec1Var, VersionInfoParcel versionInfoParcel, bu buVar, oz0 oz0Var, zt0 zt0Var, cu0 cu0Var) {
        this.f6203a = yg0Var;
        this.f6206d = executor;
        this.f6204b = ct0Var;
        this.f6205c = ec1Var;
        this.f6207e = versionInfoParcel;
        this.f6208f = buVar;
        this.h = oz0Var;
        this.f6210i = zt0Var;
        this.f6211j = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        xb1 xb1Var = tb1Var.s;
        return (xb1Var == null || xb1Var.f10472a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(ac1 ac1Var, tb1 tb1Var) {
        ht0 ht0Var = new ht0();
        ds1 ds1Var = ds1.f4001t;
        g01 g01Var = new g01(this, tb1Var, ac1Var, ht0Var);
        Executor executor = this.f6206d;
        gr1 gr1VarP = bs1.p(ds1Var, g01Var, executor);
        gr1VarP.addListener(new h01(ht0Var), executor);
        return gr1VarP;
    }
}
