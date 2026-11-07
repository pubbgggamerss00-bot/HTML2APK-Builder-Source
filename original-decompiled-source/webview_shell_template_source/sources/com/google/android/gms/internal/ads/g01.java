package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.ArrayList;
import org.json.JSONArray;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class g01 implements pr1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4858a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ac1 f4859b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tb1 f4860c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz0 f4861d;

    public /* synthetic */ g01(k01 k01Var, tb1 tb1Var, ac1 ac1Var, ht0 ht0Var) {
        this.f4861d = k01Var;
        this.f4860c = tb1Var;
        this.f4859b = ac1Var;
    }

    @Override // com.google.android.gms.internal.ads.pr1
    public final c5.a zza(Object obj) {
        switch (this.f4858a) {
            case 0:
                k01 k01Var = (k01) this.f4861d;
                bu buVar = k01Var.f6208f;
                ec1 ec1Var = k01Var.f6205c;
                zt0 zt0Var = k01Var.f6210i;
                nn nnVar = zn.f11437m2;
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-start", zt0Var.f11577c);
                }
                ct0 ct0Var = k01Var.f6204b;
                ac1 ac1Var = this.f4859b;
                vb1 vb1Var = (vb1) ac1Var.f2648b.f1103u;
                zzs zzsVar = ec1Var.f4210e;
                final tb1 tb1Var = this.f4860c;
                final xa0 xa0VarA = ct0Var.a(zzsVar, tb1Var, vb1Var);
                boolean z6 = tb1Var.W;
                xb1 xb1Var = tb1Var.s;
                xa0VarA.q(z6);
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-webview-creation-end", zt0Var.f11577c);
                }
                o70 o70Var = new o70();
                final ld0 ld0VarA = k01Var.f6203a.a(new androidx.camera.view.b(ac1Var, tb1Var, null), new bo0(new l01(k01Var.f6207e, o70Var, tb1Var, xa0VarA, ec1Var, k01Var.f6209g, buVar, k01Var.h, k01Var.f6211j), xa0VarA), new wg0(tb1Var.f9172a0));
                if (((Boolean) zzbe.zzc().a(nnVar)).booleanValue()) {
                    androidx.camera.camera2.internal.compat.workaround.c.f("rendering-ad-component-creation-end", zt0Var.f11577c);
                }
                bt0 bt0VarS = ld0VarA.s();
                if (!k01Var.f6209g) {
                    buVar = null;
                }
                bt0VarS.a(xa0VarA, false, buVar, zt0Var.f11577c);
                o70Var.a(ld0VarA);
                ld0VarA.m().l0(new al0() { // from class: com.google.android.gms.internal.ads.i01
                    @Override // com.google.android.gms.internal.ads.al0
                    public final void zzr() {
                        xa0 xa0Var = xa0VarA;
                        if (xa0Var.zzN() != null) {
                            xa0Var.zzN().k0();
                        }
                    }
                }, i70.f5592g);
                String strB = xb1Var.f10472a;
                if (((Boolean) zzbe.zzc().a(zn.f11394f5)).booleanValue() && ((uz0) ld0VarA.A.zzb()).d()) {
                    strB = vb0.b(strB, vb0.a(tb1Var));
                }
                ld0VarA.s();
                return bs1.o(bt0.b(xa0VarA, xb1Var.f10473b, strB, zt0Var.f11577c), new pl1() { // from class: com.google.android.gms.internal.ads.j01
                    @Override // com.google.android.gms.internal.ads.pl1
                    public final Object apply(Object obj2) {
                        boolean z7 = tb1Var.M;
                        xa0 xa0Var = xa0VarA;
                        if (z7) {
                            xa0Var.z();
                        }
                        xa0Var.i0();
                        xa0Var.onPause();
                        return ld0VarA.q();
                    }
                }, k01Var.f6206d);
            default:
                u11 u11Var = (u11) this.f4861d;
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() == 0) {
                    return bs1.l(new gw0(3));
                }
                ac1 ac1Var2 = this.f4859b;
                ec1 ec1Var2 = (ec1) ac1Var2.f2647a.f9702t;
                int i6 = ec1Var2.f4215k;
                tb1 tb1Var2 = this.f4860c;
                if (i6 <= 1) {
                    return bs1.o(u11Var.c(ac1Var2, tb1Var2, jSONArray.getJSONObject(0)), new ar0(1), u11Var.f9426b);
                }
                int length = jSONArray.length();
                if (((Boolean) zzbe.zzc().a(zn.f11443n2)).booleanValue()) {
                    u11Var.f9430f.a("nsl", String.valueOf(length));
                }
                sc1 sc1Var = u11Var.f9428d;
                int i7 = ec1Var2.f4215k;
                sc1Var.b(Math.min(length, ec1Var2.f4215k));
                ArrayList arrayList = new ArrayList(i7);
                for (int i8 = 0; i8 < i7; i8++) {
                    if (i8 < length) {
                        arrayList.add(u11Var.c(ac1Var2, tb1Var2, jSONArray.getJSONObject(i8)));
                    } else {
                        arrayList.add(bs1.l(new gw0(3)));
                    }
                }
                return bs1.m(arrayList);
        }
    }

    public /* synthetic */ g01(u11 u11Var, ac1 ac1Var, tb1 tb1Var) {
        this.f4861d = u11Var;
        this.f4859b = ac1Var;
        this.f4860c = tb1Var;
    }
}
