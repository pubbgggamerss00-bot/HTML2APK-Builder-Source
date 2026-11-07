package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yd0 extends ss0 {
    public final w92 A;
    public final w92 B;
    public final w92 C;
    public final w92 D;
    public final w92 E;
    public final w92 F;
    public final w92 G;
    public final w92 H;
    public final w92 I;
    public final w92 J;
    public final w92 K;
    public final w92 L;
    public final w92 M;
    public final w92 N;
    public final w92 O;
    public final w92 P;
    public final w92 Q;
    public final w92 R;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.camera.view.b f10919t;

    /* renamed from: u, reason: collision with root package name */
    public final ts0 f10920u;

    /* renamed from: v, reason: collision with root package name */
    public final kd0 f10921v;

    /* renamed from: w, reason: collision with root package name */
    public final ae0 f10922w;

    /* renamed from: x, reason: collision with root package name */
    public final w92 f10923x;

    /* renamed from: y, reason: collision with root package name */
    public final w92 f10924y;

    /* renamed from: z, reason: collision with root package name */
    public final w92 f10925z;

    public yd0(kd0 kd0Var, ae0 ae0Var, androidx.camera.view.b bVar, ts0 ts0Var) {
        this.f10921v = kd0Var;
        this.f10922w = ae0Var;
        this.f10919t = bVar;
        this.f10920u = ts0Var;
        int i6 = 1;
        qi0 qi0Var = new qi0(i6, bVar);
        w92 w92Var = ae0Var.f2726w;
        ee0 ee0Var = kd0Var.E0;
        w92 w92VarB = w92.b(new pe0(w92Var, qi0Var, 2));
        w92 w92VarB2 = w92.b(new sc0(w92VarB, 6));
        w92 w92VarB3 = w92.b(new ue0(kd0Var.F0, i6));
        w92 w92VarB4 = w92.b(new cd0(i6, qi0Var));
        bd0 bd0Var = kd0Var.f6348k;
        w92 w92VarB5 = w92.b(new pg0(bd0Var, w92VarB4, ae0Var.f2703f));
        oc0 oc0Var = kd0Var.h;
        int i7 = 0;
        w92 w92VarB6 = w92.b(new mg0(w92VarB3, w92.b(new ig0(oc0Var, w92VarB5, i7)), kd0Var.f6335d, w92.b(new ng0(w92VarB5, w92VarB3, i7)), kd0Var.f6341g));
        w92 w92VarB7 = w92.b(new qg0(w92VarB6, w92VarB4, i7));
        co0 co0Var = new co0(ts0Var, 1);
        af0 af0Var = new af0(7, new cd0(9, co0Var));
        int i8 = ea2.f4188c;
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(ae0Var.F);
        arrayList2.add(ae0Var.G);
        arrayList.add(w92VarB2);
        arrayList2.add(w92VarB7);
        arrayList.add(af0Var);
        w92 w92VarB8 = w92.b(new wk0(new ea2(arrayList, arrayList2), 1));
        this.f10923x = w92VarB8;
        w92 w92VarB9 = w92.b(me0.f7099u);
        this.f10924y = w92VarB9;
        w92 w92Var2 = kd0Var.f6335d;
        w92 w92VarB10 = w92.b(new qj0(w92VarB9, w92Var2, 0));
        rc0 rc0Var = new rc0(3, bVar);
        qc0 qc0Var = new qc0(2, bVar);
        oc0 oc0Var2 = kd0Var.h;
        w92 w92VarB11 = w92.b(new ke0(oc0Var2, 7));
        w92 w92VarB12 = w92.b(bq.f3247w);
        lc0 lc0Var = kd0Var.T;
        w92 w92Var3 = kd0Var.f6377z0;
        w92 w92Var4 = kd0Var.f6337e;
        w92 w92VarB13 = w92.b(new wf0(oc0Var2, lc0Var, w92VarB11, w92VarB12, w92Var3, w92Var4));
        w92 w92VarB14 = w92.b(new e91(kd0Var.I, kd0Var.H, qi0Var, qc0Var, w92VarB13, ae0Var.f2705g));
        af0 af0Var2 = new af0(5, ts0Var);
        w92 w92Var5 = kd0Var.f6335d;
        w92 w92VarB15 = w92.b(new dg0(oc0Var2, w92Var5, w92Var4, rc0Var, qi0Var, ae0Var.C, w92VarB14, af0Var2, co0Var, kd0Var.E, ae0Var.D, ae0Var.f2705g, ae0Var.L));
        int i9 = 4;
        sc0 sc0Var = new sc0(w92VarB15, i9);
        sc0 sc0Var2 = new sc0(w92.b(new yf0(qi0Var, kd0Var.R, 0)), 7);
        w92 w92VarB16 = w92.b(new vt0(oc0Var2, kd0Var.f6375y0, kd0Var.f6376z, rc0Var, qi0Var, kd0Var.G, ae0Var.f2703f));
        w92 w92VarB17 = w92.b(new qh0(w92VarB16, 2));
        w92 w92VarB18 = w92.b(new ig0(w92VarB9, w92Var5));
        w92 w92VarB19 = w92.b(new qj0(w92VarB9, w92Var5, 1));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(ae0Var.Q);
        arrayList3.add(w92VarB19);
        int i10 = 2;
        le0 le0Var = new le0(w92.b(new rg0(new ea2(arrayList3, arrayList4), qi0Var, i10)), i10);
        uc0 uc0Var = new uc0(w92VarB15, i9);
        w92 w92VarB20 = w92.b(new og0(w92VarB6, w92VarB4, 0));
        oc0 oc0Var3 = kd0Var.h;
        bd0 bd0Var2 = kd0Var.f6348k;
        w92 w92VarB21 = w92.b(new mg0(oc0Var3, bd0Var2, qi0Var, co0Var, kd0Var.f6376z));
        this.f10925z = w92VarB21;
        w92 w92VarB22 = w92.b(new lo0(kd0Var.h, co0Var, qi0Var, bd0Var2, ae0Var.f2714l, w92VarB21));
        rh0 rh0Var = new rh0(w92VarB22, i9);
        ArrayList arrayList5 = new ArrayList(7);
        ArrayList arrayList6 = new ArrayList(3);
        arrayList5.add(ae0Var.M);
        arrayList5.add(ae0Var.N);
        arrayList6.add(ae0Var.O);
        arrayList6.add(ae0Var.P);
        arrayList5.add(w92VarB17);
        arrayList5.add(w92VarB18);
        arrayList5.add(le0Var);
        arrayList5.add(uc0Var);
        arrayList6.add(w92VarB20);
        arrayList5.add(rh0Var);
        w92 w92VarB23 = w92.b(new zk0(new ea2(arrayList5, arrayList6), 0));
        this.A = w92VarB23;
        pc0 pc0Var = new pc0(3, bVar);
        w92 w92Var6 = kd0Var.f6337e;
        w92 w92VarB24 = w92.b(new zj0(w92VarB23, qi0Var, w92Var6, pc0Var));
        this.B = w92VarB24;
        t50 t50Var = new t50(ts0Var, w92VarB24, i9);
        oc0 oc0Var4 = kd0Var.h;
        w92 w92VarB25 = w92.b(new oo0(new jj0(oc0Var4, ae0Var.f2701e, 1), oc0Var4, kd0Var.f6364t, new co0(ts0Var, 0), ae0Var.f2714l));
        this.C = w92VarB25;
        rh0 rh0Var2 = new rh0(w92VarB25, 5);
        ArrayList arrayList7 = new ArrayList(6);
        ArrayList arrayList8 = new ArrayList(3);
        arrayList7.add(ae0Var.H);
        arrayList8.add(ae0Var.I);
        arrayList8.add(ae0Var.J);
        arrayList7.add(ae0Var.K);
        arrayList7.add(w92VarB10);
        arrayList7.add(sc0Var);
        arrayList7.add(sc0Var2);
        arrayList8.add(t50Var);
        arrayList7.add(rh0Var2);
        w92 w92VarB26 = w92.b(new wk0(new ea2(arrayList7, arrayList8), 2));
        this.D = w92VarB26;
        w92 w92VarB27 = w92.b(new wc0(w92VarB16, 4));
        w92 w92VarB28 = w92.b(new pe0(w92VarB9, w92Var2, 1));
        w92 w92VarB29 = w92.b(new uc0(w92.b(new jj0(kd0Var.f6367u0, ae0Var.f2701e, 0)), 6));
        rh0 rh0Var3 = new rh0(w92VarB15, 2);
        ArrayList arrayList9 = new ArrayList(5);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(ae0Var.R);
        arrayList9.add(ae0Var.S);
        arrayList10.add(ae0Var.T);
        arrayList10.add(ae0Var.U);
        arrayList9.add(w92VarB27);
        arrayList9.add(w92VarB28);
        arrayList10.add(w92VarB29);
        arrayList9.add(rh0Var3);
        w92 w92VarB30 = w92.b(new ok0(new ea2(arrayList9, arrayList10), 0));
        this.E = w92VarB30;
        wc0 wc0Var = new wc0(w92VarB15, 3);
        ArrayList arrayList11 = new ArrayList(1);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add(ae0Var.V);
        arrayList11.add(wc0Var);
        this.F = w92.b(new il0(new ea2(arrayList11, arrayList12), 3));
        int i11 = 1;
        qh0 qh0Var = new qh0(w92.b(new yf0(qi0Var, kd0Var.I, i11)), i11);
        ArrayList arrayList13 = new ArrayList(1);
        new ArrayList(1).add(ae0Var.W);
        arrayList13.add(qh0Var);
        w92 w92VarB31 = w92.b(new sj0(w92VarB9, w92Var2, 1));
        ArrayList arrayList14 = new ArrayList(1);
        ArrayList arrayList15 = new ArrayList(1);
        arrayList15.add(ae0Var.X);
        arrayList14.add(w92VarB31);
        w92 w92VarB32 = w92.b(new wk0(new ea2(arrayList14, arrayList15), 6));
        this.G = w92VarB32;
        int i12 = 4;
        w92 w92VarB33 = w92.b(new le0(w92VarB, i12));
        vc0 vc0Var = new vc0(w92VarB15, i12);
        sc0 sc0Var3 = new sc0(w92VarB22, 10);
        w92 w92Var7 = ae0Var.f2726w;
        zj0 zj0Var = new zj0(w92Var7, bd0Var, qi0Var, ae0Var.f2701e);
        ArrayList arrayList16 = new ArrayList(8);
        ArrayList arrayList17 = new ArrayList(4);
        arrayList16.add(ae0Var.Y);
        arrayList17.add(ae0Var.Z);
        arrayList16.add(ae0Var.f2694a0);
        arrayList16.add(ae0Var.f2696b0);
        arrayList17.add(ae0Var.f2698c0);
        arrayList17.add(ae0Var.f2700d0);
        arrayList17.add(ae0Var.f2702e0);
        arrayList16.add(ae0Var.f2704f0);
        arrayList16.add(w92VarB33);
        arrayList16.add(vc0Var);
        arrayList16.add(sc0Var3);
        arrayList16.add(zj0Var);
        w92 w92VarB34 = w92.b(new il0(new ea2(arrayList16, arrayList17), 0));
        this.H = w92VarB34;
        w92 w92VarB35 = w92.b(new sc0(w92VarB26, 2));
        this.I = w92VarB35;
        sc0 sc0Var4 = new sc0(w92VarB35, 5);
        w92 w92VarB36 = w92.b(new sj0(w92VarB9, w92Var2, 0));
        w92 w92VarB37 = w92.b(new rg0(w92VarB6, w92VarB4, 0));
        le0 le0Var2 = new le0(w92VarB22, 6);
        ArrayList arrayList18 = new ArrayList(3);
        ArrayList arrayList19 = new ArrayList(2);
        arrayList19.add(ae0Var.f2707h0);
        arrayList18.add(sc0Var4);
        arrayList18.add(w92VarB36);
        arrayList19.add(w92VarB37);
        arrayList18.add(le0Var2);
        w92 w92VarB38 = w92.b(new ol0(new ea2(arrayList18, arrayList19), 1));
        this.J = w92VarB38;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList20 = new ArrayList(1);
        arrayList20.add(ae0Var.f2709i0);
        w92 w92VarB39 = w92.b(new wn0(new ea2(list, arrayList20)));
        this.K = w92VarB39;
        int i13 = 5;
        w92 w92VarB40 = w92.b(new vc0(w92VarB16, i13));
        wc0 wc0Var2 = new wc0(w92VarB24, i13);
        ArrayList arrayList21 = new ArrayList(1);
        ArrayList arrayList22 = new ArrayList(1);
        arrayList21.add(w92VarB40);
        arrayList22.add(wc0Var2);
        w92 w92VarB41 = w92.b(new cd0(6, new ea2(arrayList21, arrayList22)));
        this.L = w92VarB41;
        w92 w92VarB42 = w92.b(new t50(w92VarB9, w92Var2, 2));
        le0 le0Var3 = new le0(w92VarB15, 3);
        sc0 sc0Var5 = new sc0(w92VarB24, 9);
        w92 w92VarB43 = w92.b(new jj0(oc0Var, ae0Var.f2705g, 4));
        this.M = w92VarB43;
        le0 le0Var4 = new le0(w92VarB43, 5);
        ArrayList arrayList23 = new ArrayList(3);
        ArrayList arrayList24 = new ArrayList(2);
        arrayList24.add(ae0Var.f2711j0);
        arrayList23.add(w92VarB42);
        arrayList23.add(le0Var3);
        arrayList24.add(sc0Var5);
        arrayList23.add(le0Var4);
        wk0 wk0Var = new wk0(new ea2(arrayList23, arrayList24), 0);
        w92 w92VarB44 = w92.b(new uc0(w92VarB16, 5));
        ArrayList arrayList25 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList25.add(w92VarB44);
        w92 w92VarB45 = w92.b(new v50(wk0Var, new ea2(arrayList25, list2), w92Var6, 1));
        this.N = w92VarB45;
        sc0 sc0Var6 = new sc0(w92.b(new vc0(w92VarB8, 6)), 11);
        uc0 uc0Var2 = new uc0(w92VarB43, 7);
        int i14 = 1;
        ArrayList arrayList26 = new ArrayList(1);
        ArrayList arrayList27 = new ArrayList(1);
        arrayList27.add(sc0Var6);
        arrayList26.add(uc0Var2);
        this.O = w92.b(new qg0(w92VarB38, w92.b(new wk0(new ea2(arrayList26, arrayList27), 5)), i14));
        uc0 uc0Var3 = new uc0(w92.b(new pe0(w92VarB26, qi0Var, 4)), 8);
        ArrayList arrayList28 = new ArrayList(1);
        List list3 = Collections.EMPTY_LIST;
        arrayList28.add(uc0Var3);
        w92 w92VarB46 = w92.b(new wk0(new ea2(arrayList28, list3), 7));
        this.P = w92VarB46;
        w92 w92VarB47 = w92.b(new xc0(w92VarB6, (Object) w92VarB4, i14));
        wc0 wc0Var3 = new wc0(w92VarB24, 6);
        List list4 = Collections.EMPTY_LIST;
        ArrayList arrayList29 = new ArrayList(3);
        arrayList29.add(ae0Var.f2715l0);
        arrayList29.add(w92VarB47);
        arrayList29.add(wc0Var3);
        ea2 ea2Var = new ea2(list4, arrayList29);
        int i15 = 0;
        w92 w92VarB48 = w92.b(new mn0(w92Var7, ea2Var, qi0Var, i15));
        w92 w92VarB49 = w92.b(new li0(w92Var7, bd0Var, qi0Var));
        w92 w92VarB50 = w92.b(new ig0(w92Var7, w92VarB49, 2));
        eo0 eo0Var = new eo0(ts0Var, w92Var2, i15);
        ArrayList arrayList30 = new ArrayList(1);
        ArrayList arrayList31 = new ArrayList(1);
        arrayList31.add(ae0Var.f2717m0);
        arrayList30.add(eo0Var);
        w92 w92VarB51 = w92.b(new il0(new ea2(arrayList30, arrayList31), 1));
        w92 w92Var8 = ae0Var.f2713k0;
        w92 w92Var9 = ae0Var.f2706g0;
        this.Q = w92.b(new dt0(w92VarB30, w92VarB26, w92Var8, w92VarB38, w92Var9, kd0Var.f6335d, w92VarB48, w92VarB6, w92VarB50, w92VarB49, kd0Var.E, w92VarB51, kd0Var.G, kd0Var.I, kd0Var.f6376z, w92VarB32, w92VarB13, w92VarB12));
        this.R = w92.b(new y21(w92VarB30, w92VarB32, w92VarB23, w92VarB26, w92VarB34, w92VarB45, w92Var9, w92VarB39, w92VarB38, w92VarB46, w92VarB41));
    }

    @Override // com.google.android.gms.internal.ads.me
    public final nk0 i() {
        return (nk0) this.E.zzb();
    }

    @Override // com.google.android.gms.internal.ads.me
    public final yk0 m() {
        return (yk0) this.A.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ss0
    public final sn0 q() {
        return (sn0) this.P.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ss0
    public final fo0 r() {
        return (fo0) this.O.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ss0
    public final rs0 s() {
        androidx.camera.view.b bVar = this.f10919t;
        ac1 ac1Var = (ac1) bVar.f674t;
        ih1.j(ac1Var);
        tb1 tb1Var = (tb1) bVar.f675u;
        ih1.j(tb1Var);
        dl0 dl0Var = (dl0) this.f10923x.zzb();
        hl0 hl0Var = (hl0) this.H.zzb();
        ae0 ae0Var = this.f10922w;
        ba1 ba1Var = ae0Var.f2695b.f8669o;
        ih1.j(tb1Var);
        mk0 mk0Var = new mk0(tb1Var, (String) bVar.f676v, (e01) ae0Var.f2728y.zzb(), bVar.a(), (String) ae0Var.h.zzb());
        bm0 bm0Var = (bm0) this.f10924y.zzb();
        fo1 fo1VarL = go1.l(2);
        fo1VarL.u(ae0Var.f2695b.f8662g);
        kv0 kv0Var = (kv0) ae0Var.f2729z.zzb();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        fo1VarL.t(new kn0(kv0Var, h70Var));
        si0 si0Var = new si0(ac1Var, tb1Var, dl0Var, hl0Var, ba1Var, mk0Var, bm0Var, new kl0(fo1VarL.v()), (in0) this.F.zzb());
        Context context = (Context) ae0Var.f2726w.zzb();
        ts0 ts0Var = this.f10920u;
        xa0 xa0Var = ts0Var.f3235b;
        jo0 jo0Var = ts0Var.f3234a;
        fo1 fo1VarL2 = go1.l(3);
        Set setB = ts0Var.b((yj0) this.B.zzb());
        ih1.j(setB);
        fo1VarL2.u(setB);
        no0 no0Var = (no0) this.C.zzb();
        h70 h70Var2 = i70.f5592g;
        fo1VarL2.t(new kn0(no0Var, h70Var2));
        fo1VarL2.t(new kn0((ce1) this.M.zzb(), h70Var2));
        cn0 cn0Var = new cn0(fo1VarL2.v());
        vk0 vk0Var = (vk0) this.N.zzb();
        ml0 ml0Var = (ml0) ae0Var.f2713k0.zzb();
        cj0 cj0Var = (cj0) this.I.zzb();
        ih1.j(tb1Var);
        return new rs0(si0Var, context, xa0Var, jo0Var, cn0Var, vk0Var, ml0Var, cj0Var, tb1Var, (di1) this.f10921v.J0.zzb(), (cc1) ae0Var.B.zzb());
    }

    @Override // com.google.android.gms.internal.ads.ss0
    public final bt0 t() {
        return (bt0) this.Q.zzb();
    }

    public final dl0 u() {
        return (dl0) this.f10923x.zzb();
    }
}
