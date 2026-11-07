package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ud0 extends yn0 {
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

    /* renamed from: t, reason: collision with root package name */
    public final androidx.camera.view.b f9531t;

    /* renamed from: u, reason: collision with root package name */
    public final bo0 f9532u;

    /* renamed from: v, reason: collision with root package name */
    public final kd0 f9533v;

    /* renamed from: w, reason: collision with root package name */
    public final xd0 f9534w;

    /* renamed from: x, reason: collision with root package name */
    public final w92 f9535x;

    /* renamed from: y, reason: collision with root package name */
    public final w92 f9536y;

    /* renamed from: z, reason: collision with root package name */
    public final w92 f9537z;

    public ud0(kd0 kd0Var, xd0 xd0Var, androidx.camera.view.b bVar, bo0 bo0Var) {
        this.f9533v = kd0Var;
        this.f9534w = xd0Var;
        this.f9531t = bVar;
        this.f9532u = bo0Var;
        int i6 = 1;
        qi0 qi0Var = new qi0(i6, bVar);
        w92 w92Var = xd0Var.f10544z;
        ee0 ee0Var = kd0Var.E0;
        w92 w92VarB = w92.b(new pe0(w92Var, qi0Var, 2));
        w92 w92VarB2 = w92.b(new sc0(w92VarB, 6));
        w92 w92VarB3 = w92.b(new ue0(kd0Var.F0, i6));
        w92 w92VarB4 = w92.b(new cd0(i6, qi0Var));
        bd0 bd0Var = kd0Var.f6348k;
        ei eiVar = fo.B;
        w92 w92VarB5 = w92.b(new pg0(bd0Var, w92VarB4, eiVar));
        oc0 oc0Var = kd0Var.h;
        int i7 = 0;
        w92 w92VarB6 = w92.b(new mg0(w92VarB3, w92.b(new ig0(oc0Var, w92VarB5, i7)), kd0Var.f6335d, w92.b(new ng0(w92VarB5, w92VarB3, i7)), kd0Var.f6341g));
        w92 w92VarB7 = w92.b(new qg0(w92VarB6, w92VarB4, i7));
        co0 co0Var = new co0(bo0Var, 1);
        af0 af0Var = new af0(7, new cd0(9, co0Var));
        int i8 = ea2.f4188c;
        ArrayList arrayList = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList2.add(xd0Var.H);
        arrayList2.add(xd0Var.I);
        arrayList.add(w92VarB2);
        arrayList2.add(w92VarB7);
        arrayList.add(af0Var);
        w92 w92VarB8 = w92.b(new wk0(new ea2(arrayList, arrayList2), 1));
        this.f9535x = w92VarB8;
        w92 w92VarB9 = w92.b(me0.f7099u);
        this.f9536y = w92VarB9;
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
        w92 w92VarB14 = w92.b(new e91(kd0Var.I, kd0Var.H, qi0Var, qc0Var, w92VarB13, xd0Var.A));
        af0 af0Var2 = new af0(5, bo0Var);
        w92 w92Var5 = kd0Var.f6335d;
        w92 w92VarB15 = w92.b(new dg0(oc0Var2, w92Var5, w92Var4, rc0Var, qi0Var, xd0Var.E, w92VarB14, af0Var2, co0Var, kd0Var.E, xd0Var.F, xd0Var.A, xd0Var.N));
        int i9 = 4;
        sc0 sc0Var = new sc0(w92VarB15, i9);
        sc0 sc0Var2 = new sc0(w92.b(new yf0(qi0Var, kd0Var.R, 0)), 7);
        w92 w92VarB16 = w92.b(new vt0(oc0Var2, kd0Var.f6375y0, kd0Var.f6376z, rc0Var, qi0Var, kd0Var.G, eiVar));
        w92 w92VarB17 = w92.b(new qh0(w92VarB16, 2));
        w92 w92VarB18 = w92.b(new ig0(w92VarB9, w92Var5));
        w92 w92VarB19 = w92.b(new qj0(w92VarB9, w92Var5, 1));
        ArrayList arrayList3 = new ArrayList(1);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add(xd0Var.S);
        arrayList3.add(w92VarB19);
        int i10 = 2;
        le0 le0Var = new le0(w92.b(new rg0(new ea2(arrayList3, arrayList4), qi0Var, i10)), i10);
        uc0 uc0Var = new uc0(w92VarB15, i9);
        w92 w92VarB20 = w92.b(new og0(w92VarB6, w92VarB4, 0));
        oc0 oc0Var3 = kd0Var.h;
        bd0 bd0Var2 = kd0Var.f6348k;
        w92 w92VarB21 = w92.b(new mg0(oc0Var3, bd0Var2, qi0Var, co0Var, kd0Var.f6376z));
        this.f9537z = w92VarB21;
        oc0 oc0Var4 = kd0Var.h;
        ho0 ho0Var = d0.D;
        w92 w92VarB22 = w92.b(new lo0(oc0Var4, co0Var, qi0Var, bd0Var2, ho0Var, w92VarB21));
        rh0 rh0Var = new rh0(w92VarB22, i9);
        ArrayList arrayList5 = new ArrayList(7);
        ArrayList arrayList6 = new ArrayList(3);
        arrayList5.add(xd0Var.O);
        arrayList5.add(xd0Var.P);
        arrayList6.add(xd0Var.Q);
        arrayList6.add(xd0Var.R);
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
        t50 t50Var = new t50(bo0Var, w92VarB24, i9);
        oc0 oc0Var5 = kd0Var.h;
        w92 w92VarB25 = w92.b(new oo0(new jj0(oc0Var5, xd0Var.f10527l, 1), oc0Var5, kd0Var.f6364t, new co0(bo0Var, 0), ho0Var));
        this.C = w92VarB25;
        rh0 rh0Var2 = new rh0(w92VarB25, 5);
        ArrayList arrayList7 = new ArrayList(6);
        ArrayList arrayList8 = new ArrayList(3);
        arrayList7.add(xd0Var.J);
        arrayList8.add(xd0Var.K);
        arrayList8.add(xd0Var.L);
        arrayList7.add(xd0Var.M);
        arrayList7.add(w92VarB10);
        arrayList7.add(sc0Var);
        arrayList7.add(sc0Var2);
        arrayList8.add(t50Var);
        arrayList7.add(rh0Var2);
        w92 w92VarB26 = w92.b(new wk0(new ea2(arrayList7, arrayList8), 2));
        this.D = w92VarB26;
        w92 w92VarB27 = w92.b(new wc0(w92VarB16, 4));
        w92 w92VarB28 = w92.b(new pe0(w92VarB9, w92Var2, 1));
        w92 w92VarB29 = w92.b(new uc0(w92.b(new jj0(kd0Var.f6367u0, xd0Var.f10527l, 0)), 6));
        rh0 rh0Var3 = new rh0(w92VarB15, 2);
        ArrayList arrayList9 = new ArrayList(5);
        ArrayList arrayList10 = new ArrayList(3);
        arrayList9.add(xd0Var.T);
        arrayList9.add(xd0Var.U);
        arrayList10.add(xd0Var.V);
        arrayList10.add(xd0Var.W);
        arrayList9.add(w92VarB27);
        arrayList9.add(w92VarB28);
        arrayList10.add(w92VarB29);
        arrayList9.add(rh0Var3);
        w92 w92VarB30 = w92.b(new ok0(new ea2(arrayList9, arrayList10), 0));
        this.E = w92VarB30;
        int i11 = 3;
        wc0 wc0Var = new wc0(w92VarB15, i11);
        ArrayList arrayList11 = new ArrayList(1);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add(xd0Var.X);
        arrayList11.add(wc0Var);
        this.F = w92.b(new il0(new ea2(arrayList11, arrayList12), i11));
        int i12 = 1;
        qh0 qh0Var = new qh0(w92.b(new yf0(qi0Var, kd0Var.I, i12)), i12);
        ArrayList arrayList13 = new ArrayList(1);
        ArrayList arrayList14 = new ArrayList(1);
        arrayList14.add(xd0Var.Y);
        arrayList13.add(qh0Var);
        this.G = w92.b(new il0(new ea2(arrayList13, arrayList14), 4));
        w92 w92VarB31 = w92.b(new sj0(w92VarB9, w92Var2, i12));
        ArrayList arrayList15 = new ArrayList(1);
        ArrayList arrayList16 = new ArrayList(1);
        arrayList16.add(xd0Var.Z);
        arrayList15.add(w92VarB31);
        w92 w92VarB32 = w92.b(new wk0(new ea2(arrayList15, arrayList16), 6));
        this.H = w92VarB32;
        int i13 = 4;
        w92 w92VarB33 = w92.b(new le0(w92VarB, i13));
        vc0 vc0Var = new vc0(w92VarB15, i13);
        sc0 sc0Var3 = new sc0(w92VarB22, 10);
        w92 w92Var7 = xd0Var.f10544z;
        zj0 zj0Var = new zj0(w92Var7, bd0Var, qi0Var, xd0Var.f10527l);
        ArrayList arrayList17 = new ArrayList(8);
        ArrayList arrayList18 = new ArrayList(4);
        arrayList17.add(xd0Var.f10507a0);
        arrayList18.add(xd0Var.f10509b0);
        arrayList17.add(xd0Var.f10511c0);
        arrayList17.add(xd0Var.f10513d0);
        arrayList18.add(xd0Var.f10515e0);
        arrayList18.add(xd0Var.f10517f0);
        arrayList18.add(xd0Var.f10519g0);
        arrayList17.add(xd0Var.f10520h0);
        arrayList17.add(w92VarB33);
        arrayList17.add(vc0Var);
        arrayList17.add(sc0Var3);
        arrayList17.add(zj0Var);
        int i14 = 0;
        this.I = w92.b(new il0(new ea2(arrayList17, arrayList18), i14));
        w92 w92VarB34 = w92.b(new sc0(w92VarB26, 2));
        this.J = w92VarB34;
        sc0 sc0Var4 = new sc0(w92VarB34, 5);
        w92 w92VarB35 = w92.b(new sj0(w92VarB9, w92Var2, i14));
        w92 w92VarB36 = w92.b(new rg0(w92VarB6, w92VarB4, i14));
        le0 le0Var2 = new le0(w92VarB22, 6);
        ArrayList arrayList19 = new ArrayList(3);
        ArrayList arrayList20 = new ArrayList(2);
        arrayList20.add(xd0Var.f10524j0);
        arrayList19.add(sc0Var4);
        arrayList19.add(w92VarB35);
        arrayList20.add(w92VarB36);
        arrayList19.add(le0Var2);
        w92 w92VarB37 = w92.b(new ol0(new ea2(arrayList19, arrayList20), 1));
        this.K = w92VarB37;
        List list = Collections.EMPTY_LIST;
        ArrayList arrayList21 = new ArrayList(1);
        arrayList21.add(xd0Var.f10526k0);
        this.L = w92.b(new wn0(new ea2(list, arrayList21)));
        int i15 = 5;
        w92 w92VarB38 = w92.b(new vc0(w92VarB16, i15));
        wc0 wc0Var2 = new wc0(w92VarB24, i15);
        ArrayList arrayList22 = new ArrayList(1);
        ArrayList arrayList23 = new ArrayList(1);
        arrayList22.add(w92VarB38);
        arrayList23.add(wc0Var2);
        this.M = w92.b(new cd0(6, new ea2(arrayList22, arrayList23)));
        w92 w92VarB39 = w92.b(new t50(w92VarB9, w92Var2, 2));
        le0 le0Var3 = new le0(w92VarB15, 3);
        sc0 sc0Var5 = new sc0(w92VarB24, 9);
        w92 w92VarB40 = w92.b(new jj0(oc0Var, xd0Var.A, 4));
        this.N = w92VarB40;
        le0 le0Var4 = new le0(w92VarB40, 5);
        ArrayList arrayList24 = new ArrayList(3);
        ArrayList arrayList25 = new ArrayList(2);
        arrayList25.add(xd0Var.f10528l0);
        arrayList24.add(w92VarB39);
        arrayList24.add(le0Var3);
        arrayList25.add(sc0Var5);
        arrayList24.add(le0Var4);
        wk0 wk0Var = new wk0(new ea2(arrayList24, arrayList25), 0);
        w92 w92VarB41 = w92.b(new uc0(w92VarB16, 5));
        ArrayList arrayList26 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList26.add(w92VarB41);
        this.O = w92.b(new v50(wk0Var, new ea2(arrayList26, list2), w92Var6, 1));
        sc0 sc0Var6 = new sc0(w92.b(new vc0(w92VarB8, 6)), 11);
        uc0 uc0Var2 = new uc0(w92VarB40, 7);
        int i16 = 1;
        ArrayList arrayList27 = new ArrayList(1);
        ArrayList arrayList28 = new ArrayList(1);
        arrayList28.add(sc0Var6);
        arrayList27.add(uc0Var2);
        this.P = w92.b(new qg0(w92VarB37, w92.b(new wk0(new ea2(arrayList27, arrayList28), 5)), i16));
        w92 w92VarB42 = w92.b(new xc0(w92VarB6, (Object) w92VarB4, i16));
        wc0 wc0Var3 = new wc0(w92VarB24, 6);
        List list3 = Collections.EMPTY_LIST;
        ArrayList arrayList29 = new ArrayList(3);
        arrayList29.add(xd0Var.f10532n0);
        arrayList29.add(w92VarB42);
        arrayList29.add(wc0Var3);
        int i17 = 0;
        w92 w92VarB43 = w92.b(new mn0(w92Var7, new ea2(list3, arrayList29), qi0Var, i17));
        w92 w92VarB44 = w92.b(new li0(w92Var7, bd0Var, qi0Var));
        w92 w92VarB45 = w92.b(new ig0(w92Var7, w92VarB44, 2));
        eo0 eo0Var = new eo0(bo0Var, w92Var2, i17);
        ArrayList arrayList30 = new ArrayList(1);
        ArrayList arrayList31 = new ArrayList(1);
        arrayList31.add(xd0Var.f10534o0);
        arrayList30.add(eo0Var);
        this.Q = w92.b(new dt0(w92VarB30, w92VarB26, xd0Var.f10530m0, w92VarB37, xd0Var.f10522i0, kd0Var.f6335d, w92VarB43, w92VarB6, w92VarB45, w92VarB44, kd0Var.E, w92.b(new il0(new ea2(arrayList30, arrayList31), 1)), kd0Var.G, kd0Var.I, kd0Var.f6376z, w92VarB32, w92VarB13, w92VarB12));
    }

    @Override // com.google.android.gms.internal.ads.me
    public final nk0 i() {
        return (nk0) this.E.zzb();
    }

    @Override // com.google.android.gms.internal.ads.me
    public final yk0 m() {
        return (yk0) this.A.zzb();
    }

    @Override // com.google.android.gms.internal.ads.me
    public final pn0 p() {
        return (pn0) this.G.zzb();
    }

    @Override // com.google.android.gms.internal.ads.yn0
    public final xn0 q() {
        androidx.camera.view.b bVar = this.f9531t;
        ac1 ac1Var = (ac1) bVar.f674t;
        ih1.j(ac1Var);
        tb1 tb1Var = (tb1) bVar.f675u;
        ih1.j(tb1Var);
        dl0 dl0Var = (dl0) this.f9535x.zzb();
        hl0 hl0Var = (hl0) this.I.zzb();
        xd0 xd0Var = this.f9534w;
        ba1 ba1Var = xd0Var.f10506a.f8669o;
        ih1.j(tb1Var);
        mk0 mk0Var = new mk0(tb1Var, (String) bVar.f676v, (e01) xd0Var.D.zzb(), bVar.a(), (String) xd0Var.f10529m.zzb());
        bm0 bm0Var = (bm0) this.f9536y.zzb();
        fo1 fo1VarL = go1.l(2);
        fo1VarL.u(xd0Var.f10506a.f8662g);
        kv0 kv0Var = (kv0) xd0Var.f10539u.zzb();
        h70 h70Var = i70.f5586a;
        ih1.j(h70Var);
        fo1VarL.t(new kn0(kv0Var, h70Var));
        si0 si0Var = new si0(ac1Var, tb1Var, dl0Var, hl0Var, ba1Var, mk0Var, bm0Var, new kl0(fo1VarL.v()), (in0) this.F.zzb());
        Context context = (Context) xd0Var.f10544z.zzb();
        bo0 bo0Var = this.f9532u;
        xa0 xa0Var = bo0Var.f3235b;
        fo1 fo1VarL2 = go1.l(3);
        Set setB = bo0Var.b((yj0) this.B.zzb());
        ih1.j(setB);
        fo1VarL2.u(setB);
        no0 no0Var = (no0) this.C.zzb();
        h70 h70Var2 = i70.f5592g;
        fo1VarL2.t(new kn0(no0Var, h70Var2));
        fo1VarL2.t(new kn0((ce1) this.N.zzb(), h70Var2));
        cn0 cn0Var = new cn0(fo1VarL2.v());
        jo0 jo0Var = bo0Var.f3234a;
        cj0 cj0Var = (cj0) this.J.zzb();
        kd0 kd0Var = this.f9533v;
        return new xn0(si0Var, context, xa0Var, cn0Var, jo0Var, cj0Var, (di1) kd0Var.J0.zzb(), (vk0) this.O.zzb(), ((b70) kd0Var.Q.zzb()).f2948c);
    }

    @Override // com.google.android.gms.internal.ads.yn0
    public final fo0 r() {
        return (fo0) this.P.zzb();
    }

    public final bt0 s() {
        return (bt0) this.Q.zzb();
    }
}
