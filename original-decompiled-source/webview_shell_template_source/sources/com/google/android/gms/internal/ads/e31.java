package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class e31 implements yz0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4091a;

    /* renamed from: b, reason: collision with root package name */
    public final ct0 f4092b;

    /* renamed from: c, reason: collision with root package name */
    public final us0 f4093c;

    /* renamed from: d, reason: collision with root package name */
    public final ec1 f4094d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f4095e;

    /* renamed from: f, reason: collision with root package name */
    public final VersionInfoParcel f4096f;

    /* renamed from: g, reason: collision with root package name */
    public final bu f4097g;
    public final boolean h = ((Boolean) zzbe.zzc().a(zn.M8)).booleanValue();

    /* renamed from: i, reason: collision with root package name */
    public final oz0 f4098i;

    /* renamed from: j, reason: collision with root package name */
    public final zt0 f4099j;

    /* renamed from: k, reason: collision with root package name */
    public final cu0 f4100k;

    public e31(Context context, VersionInfoParcel versionInfoParcel, ec1 ec1Var, Executor executor, us0 us0Var, ct0 ct0Var, bu buVar, oz0 oz0Var, zt0 zt0Var, cu0 cu0Var) {
        this.f4091a = context;
        this.f4094d = ec1Var;
        this.f4093c = us0Var;
        this.f4095e = executor;
        this.f4096f = versionInfoParcel;
        this.f4092b = ct0Var;
        this.f4097g = buVar;
        this.f4098i = oz0Var;
        this.f4099j = zt0Var;
        this.f4100k = cu0Var;
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
        pr1 pr1Var = new pr1(tb1Var, ac1Var, ht0Var) { // from class: com.google.android.gms.internal.ads.b31

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ tb1 f2907b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ ac1 f2908c;

            @Override // com.google.android.gms.internal.ads.pr1
            public final c5.a zza(Object obj) {
                zt0 zt0Var;
                e31 e31Var = this.f2906a;
                bu buVar = e31Var.f4097g;
                ec1 ec1Var = e31Var.f4094d;
                zt0 zt0Var2 = e31Var.f4099j;
                nn nnVar = zn.f11437m2;
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-start", zt0Var2.f11577c);
                }
                ct0 ct0Var = e31Var.f4092b;
                ac1 ac1Var2 = this.f2908c;
                vb1 vb1Var = (vb1) ac1Var2.f2648b.f1103u;
                zzs zzsVar = ec1Var.f4210e;
                tb1 tb1Var2 = this.f2907b;
                final xa0 xa0VarA = ct0Var.a(zzsVar, tb1Var2, vb1Var);
                boolean z6 = tb1Var2.W;
                xb1 xb1Var = tb1Var2.s;
                xa0VarA.q(z6);
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-end", zt0Var2.f11577c);
                }
                o70 o70Var = new o70();
                yd0 yd0VarB = e31Var.f4093c.b(new androidx.camera.view.b(ac1Var2, tb1Var2, null), new ts0(new d31(e31Var.f4091a, e31Var.f4092b, ec1Var, e31Var.f4096f, tb1Var2, o70Var, xa0VarA, buVar, e31Var.h, e31Var.f4098i, e31Var.f4099j, e31Var.f4100k), xa0VarA));
                o70Var.a(yd0VarB);
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    zt0Var = zt0Var2;
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-ad-component-creation-end", zt0Var.f11577c);
                } else {
                    zt0Var = zt0Var2;
                }
                xa0VarA.Z("/reward", new nu(0, yd0VarB.q()));
                yd0VarB.m().l0(new al0() { // from class: com.google.android.gms.internal.ads.a31
                    @Override // com.google.android.gms.internal.ads.al0
                    public final void zzr() {
                        xa0 xa0Var = xa0VarA;
                        if (xa0Var.zzN() != null) {
                            xa0Var.zzN().k0();
                        }
                    }
                }, i70.f5592g);
                bt0 bt0VarT = yd0VarB.t();
                if (!e31Var.h) {
                    buVar = null;
                }
                bt0VarT.a(xa0VarA, true, buVar, zt0Var.f11577c);
                String strB = xb1Var.f10472a;
                if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue() && ((uz0) yd0VarB.f10925z.zzb()).d()) {
                    strB = vb0.b(strB, vb0.a(tb1Var2));
                }
                yd0VarB.t();
                return bs1.o(bt0.b(xa0VarA, xb1Var.f10473b, strB, zt0Var.f11577c), new wj0(xa0VarA, tb1Var2, yd0VarB, 1), e31Var.f4095e);
            }
        };
        Executor executor = this.f4095e;
        gr1 gr1VarP = bs1.p(ds1Var, pr1Var, executor);
        gr1VarP.addListener(new c31(), executor);
        return gr1VarP;
    }
}
