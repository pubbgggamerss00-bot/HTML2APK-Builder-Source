package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class l11 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6555a;

    /* renamed from: b, reason: collision with root package name */
    public final ct0 f6556b;

    /* renamed from: c, reason: collision with root package name */
    public final go0 f6557c;

    /* renamed from: d, reason: collision with root package name */
    public final ec1 f6558d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f6559e;

    /* renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f6560f;

    /* renamed from: g, reason: collision with root package name */
    public final bu f6561g;
    public final boolean h = ((Boolean) zzbe.zzc().a(zn.M8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    public final oz0 f6562i;

    /* renamed from: j, reason: collision with root package name */
    public final zt0 f6563j;

    /* renamed from: k, reason: collision with root package name */
    public final cu0 f6564k;

    public l11(Context context, VersionInfoParcel versionInfoParcel, ec1 ec1Var, Executor executor, go0 go0Var, ct0 ct0Var, bu buVar, oz0 oz0Var, zt0 zt0Var, cu0 cu0Var) {
        this.f6555a = context;
        this.f6558d = ec1Var;
        this.f6557c = go0Var;
        this.f6559e = executor;
        this.f6560f = versionInfoParcel;
        this.f6556b = ct0Var;
        this.f6561g = buVar;
        this.f6562i = oz0Var;
        this.f6563j = zt0Var;
        this.f6564k = cu0Var;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final boolean a(ac1 ac1Var, tb1 tb1Var) {
        xb1 xb1Var = tb1Var.s;
        return (xb1Var == null || xb1Var.f10472a == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.yz0
    public final c5.a b(final ac1 ac1Var, final tb1 tb1Var) {
        final ht0 ht0Var = new ht0();
        ds1 ds1Var = ds1.f4001t;
        pr1 pr1Var = new pr1(tb1Var, ac1Var, ht0Var) { // from class: com.google.android.gms.internal.ads.g11

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tb1 f4866b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ac1 f4867c;

            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                l11 l11Var = this.f4865a;
                bu buVar = l11Var.f6561g;
                ec1 ec1Var = l11Var.f6558d;
                zt0 zt0Var = l11Var.f6563j;
                nn nnVar = zn.f11437m2;
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-start", zt0Var.f11577c);
                }
                ct0 ct0Var = l11Var.f6556b;
                ac1 ac1Var2 = this.f4867c;
                vb1 vb1Var = (vb1) ac1Var2.f2648b.f1103u;
                zzs zzsVar = ec1Var.f4210e;
                final tb1 tb1Var2 = this.f4866b;
                final xa0 xa0VarA = ct0Var.a(zzsVar, tb1Var2, vb1Var);
                boolean z6 = tb1Var2.W;
                xb1 xb1Var = tb1Var2.s;
                xa0VarA.q(z6);
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-end", zt0Var.f11577c);
                }
                o70 o70Var = new o70();
                final ud0 ud0VarA = l11Var.f6557c.a(new androidx.camera.view.b(ac1Var2, tb1Var2, null), new bo0(new k11(l11Var.f6555a, l11Var.f6560f, o70Var, tb1Var2, xa0VarA, ec1Var, l11Var.h, buVar, l11Var.f6562i, l11Var.f6564k), xa0VarA));
                o70Var.a(ud0VarA);
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-ad-component-creation-end", zt0Var.f11577c);
                }
                ud0VarA.m().l0(new al0() { // from class: com.google.android.gms.internal.ads.i11
                    @Override // com.google.android.gms.internal.ads.al0
                    public final void zzr() {
                        xa0 xa0Var = xa0VarA;
                        if (xa0Var.zzN() != null) {
                            xa0Var.zzN().k0();
                        }
                    }
                }, i70.f5592g);
                String strB = xb1Var.f10472a;
                if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue() && ((uz0) ud0VarA.f9537z.zzb()).d()) {
                    strB = vb0.b(strB, vb0.a(tb1Var2));
                }
                bt0 bt0VarS = ud0VarA.s();
                if (!l11Var.h) {
                    buVar = null;
                }
                bt0VarS.a(xa0VarA, true, buVar, zt0Var.f11577c);
                ud0VarA.s();
                return bs1.o(bt0.b(xa0VarA, xb1Var.f10473b, strB, zt0Var.f11577c), new pl1() { // from class: com.google.android.gms.internal.ads.j11
                    @Override // com.google.android.gms.internal.ads.pl1
                    public final Object apply(Object obj2) {
                        boolean z7 = tb1Var2.M;
                        xa0 xa0Var = xa0VarA;
                        if (z7) {
                            xa0Var.z();
                        }
                        xa0Var.i0();
                        xa0Var.onPause();
                        return ud0VarA.q();
                    }
                }, l11Var.f6559e);
            }
        };
        Executor executor = this.f6559e;
        gr1 gr1VarP = bs1.p(ds1Var, pr1Var, executor);
        gr1VarP.addListener(new h11(), executor);
        return gr1VarP;
    }
}
