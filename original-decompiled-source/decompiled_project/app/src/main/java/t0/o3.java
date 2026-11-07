package t0;

import android.content.res.Configuration;
import android.view.View;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import i2.e0;
import i2.g;
import j1.d;
import x0.j;

/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f26577a = 16;

    public static final class a extends kotlin.jvm.internal.s implements eh.l<x0.l0, x0.k0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26578a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f26579b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, eh.a<pg.f0> aVar) {
            super(1);
            this.f26578a = view;
            this.f26579b = aVar;
        }

        @Override // eh.l
        public final x0.k0 invoke(x0.l0 l0Var) {
            return new m3(new n3(this.f26578a, this.f26579b));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26580a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f3.d f26581b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ eh.a<pg.f0> f26582c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f26583d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, f3.d dVar, eh.a<pg.f0> aVar, int i10) {
            super(2);
            this.f26580a = view;
            this.f26581b = dVar;
            this.f26582c = aVar;
            this.f26583d = i10;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f26583d | 1);
            o3.b(this.f26580a, this.f26581b, this.f26582c, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, x0.j, x0.k] */
    /* JADX WARN: Type inference failed for: r2v4, types: [f1.b] */
    public static final void a(boolean z10, eh.l lVar, androidx.compose.ui.d dVar, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        int i12;
        int i13;
        Object obj;
        View view;
        x0.n1 n1Var;
        boolean z11;
        eh.l lVar2;
        androidx.compose.ui.d dVar2;
        f1.b bVar2;
        boolean z12 = z10;
        ?? P = jVar.p(2067579792);
        int i14 = i10 | (P.c(z12) ? 4 : 2);
        if ((i10 & 48) == 0) {
            i14 |= P.l(lVar) ? 32 : 16;
        }
        int i15 = i14 | 384;
        if ((i15 & 1171) == 1170 && P.s()) {
            P.v();
            dVar2 = dVar;
            lVar2 = lVar;
            bVar2 = bVar;
        } else {
            Configuration configuration = (Configuration) P.f(AndroidCompositionLocals_androidKt.f1280a);
            View view2 = (View) P.f(AndroidCompositionLocals_androidKt.f1285f);
            f3.d dVar3 = (f3.d) P.f(j2.j2.f14779h);
            int iB1 = dVar3.b1(z5.f27518a);
            Object objG = P.g();
            Object obj2 = j.a.f31715a;
            if (objG == obj2) {
                objG = bg.b.h(null);
                P.C(objG);
            }
            x0.n1 n1Var2 = (x0.n1) objG;
            Object objG2 = P.g();
            if (objG2 == obj2) {
                objG2 = new x0.v1(0);
                P.C(objG2);
            }
            x0.l1 l1Var = (x0.l1) objG2;
            Object objG3 = P.g();
            if (objG3 == obj2) {
                objG3 = new x0.v1(0);
                P.C(objG3);
            }
            x0.l1 l1Var2 = (x0.l1) objG3;
            Object objG4 = P.g();
            if (objG4 == obj2) {
                objG4 = new o1.c0();
                P.C(objG4);
            }
            o1.c0 c0Var = (o1.c0) objG4;
            j2.z4 z4Var = (j2.z4) P.f(j2.j2.f14787p);
            String strB = di.a.b(R.string.m3c_dropdown_menu_expanded, P);
            String strB2 = di.a.b(R.string.m3c_dropdown_menu_collapsed, P);
            String strB3 = di.a.b(R.string.m3c_dropdown_menu_toggle, P);
            Object objG5 = P.g();
            if (objG5 == obj2) {
                objG5 = bg.b.h(new m5());
                P.C(objG5);
            }
            x0.n1 n1Var3 = (x0.n1) objG5;
            int i16 = i15 & 14;
            int i17 = i15 & 112;
            boolean zK = (i16 == 4) | (i17 == 32) | P.K(configuration) | P.K(view2) | P.K(dVar3);
            Object objG6 = P.g();
            if (zK || objG6 == obj2) {
                i11 = i17;
                i12 = iB1;
                i13 = i16;
                obj = obj2;
                k3 k3Var = new k3(c0Var, z12, strB, strB2, strB3, z4Var, n1Var3, lVar, l1Var, l1Var2);
                c0Var = c0Var;
                z12 = z12;
                P.C(k3Var);
                objG6 = k3Var;
            } else {
                i13 = i16;
                i11 = i17;
                obj = obj2;
                i12 = iB1;
            }
            k3 k3Var2 = (k3) objG6;
            boolean zL = P.l(view2) | P.i(i12);
            Object objG7 = P.g();
            if (zL || objG7 == obj) {
                view = view2;
                n1Var = n1Var2;
                objG7 = new f3(view, i12, n1Var, l1Var, l1Var2);
                P.C(objG7);
            } else {
                view = view2;
                n1Var = n1Var2;
            }
            d.a aVar = d.a.f1143b;
            androidx.compose.ui.d dVarA = androidx.compose.ui.layout.c.a(aVar, (eh.l) objG7);
            g2.l0 l0VarD = z.g.d(d.a.f14602a, false);
            int i18 = P.P;
            x0.a2 a2VarP = P.P();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVarA, P);
            i2.g.f13861o.getClass();
            e0.a aVar2 = g.a.f13863b;
            P.r();
            if (P.O) {
                P.w(aVar2);
            } else {
                P.z();
            }
            ph.v1.j(g.a.f13867f, l0VarD, P);
            ph.v1.j(g.a.f13866e, a2VarP, P);
            g.a.C0128a c0128a = g.a.f13868g;
            if (P.O || !kotlin.jvm.internal.r.a(P.g(), Integer.valueOf(i18))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i18, P, i18, c0128a);
            }
            ph.v1.j(g.a.f13865d, dVarC, P);
            ?? r22 = bVar;
            r22.b(k3Var2, P, 48);
            P.T(true);
            P.L(426363998);
            if (z12) {
                boolean zL2 = P.l(view) | P.i(i12);
                Object objG8 = P.g();
                if (zL2 || objG8 == obj) {
                    objG8 = new g3(view, i12, n1Var, l1Var2);
                    P.C(objG8);
                }
                z11 = false;
                b(view, dVar3, (eh.a) objG8, P, 0);
            } else {
                z11 = false;
            }
            P.T(z11);
            int i19 = i13;
            boolean z13 = i19 == 4;
            Object objG9 = P.g();
            if (z13 || objG9 == obj) {
                objG9 = new h3(z12, c0Var);
                P.C(objG9);
            }
            x0.l0 l0Var = x0.o0.f31834a;
            P.u((eh.a) objG9);
            boolean z14 = i11 == 32;
            Object objG10 = P.g();
            if (z14 || objG10 == obj) {
                lVar2 = lVar;
                objG10 = new b0.s(lVar2, 1);
                P.C(objG10);
            } else {
                lVar2 = lVar;
            }
            c.e.a(i19, 0, (eh.a) objG10, P, z12);
            dVar2 = aVar;
            bVar2 = r22;
        }
        x0.h2 h2VarV = P.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new i3(z12, lVar2, dVar2, bVar2, i10);
        }
    }

    public static final void b(View view, f3.d dVar, eh.a<pg.f0> aVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-1319522472);
        int i11 = (kVarP.l(view) ? 4 : 2) | i10 | (kVarP.K(dVar) ? 32 : 16);
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(aVar) ? 256 : 128;
        }
        if ((i11 & 147) == 146 && kVarP.s()) {
            kVarP.v();
        } else {
            boolean zL = ((i11 & 896) == 256) | kVarP.l(view);
            Object objG = kVarP.g();
            if (zL || objG == j.a.f31715a) {
                objG = new a(view, aVar);
                kVarP.C(objG);
            }
            x0.o0.b(view, dVar, (eh.l) objG, kVarP);
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b(view, dVar, aVar, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int c(int i10, p1.e eVar, p1.e eVar2) {
        int iB;
        float f10 = eVar.f21132b;
        float f11 = i10;
        float f12 = f10 + f11;
        float f13 = eVar.f21134d;
        float f14 = f13 - f11;
        float f15 = eVar2.f21132b;
        if (f15 <= f13) {
            float f16 = eVar2.f21134d;
            iB = f16 < f10 ? gh.a.b(f14 - f12) : gh.a.b(Math.max(f15 - f12, f14 - f16));
        }
        return Math.max(iB, 0);
    }
}
