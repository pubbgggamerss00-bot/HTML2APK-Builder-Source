package g2;

import androidx.compose.ui.d;
import i2.e0;
import i2.g;
import ph.v1;
import x0.a2;
import x0.h2;
import x0.j;
import x0.k;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11417a = new a();

    public static final class a {
        public final String toString() {
            return "ReusedSlotId";
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f11418a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ eh.p<t1, f3.b, m0> f11419b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f11420c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f11421d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.ui.d dVar, eh.p<? super t1, ? super f3.b, ? extends m0> pVar, int i10, int i11) {
            super(2);
            this.f11418a = dVar;
            this.f11419b = pVar;
            this.f11420c = i10;
            this.f11421d = i11;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(this.f11420c | 1);
            int i10 = this.f11421d;
            p1.a(this.f11418a, this.f11419b, jVar, iN, i10);
            return pg.f0.f21461a;
        }
    }

    public static final void a(androidx.compose.ui.d dVar, eh.p<? super t1, ? super f3.b, ? extends m0> pVar, x0.j jVar, int i10, int i11) {
        int i12;
        x0.k kVarP = jVar.p(-1298353104);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= kVarP.l(pVar) ? 32 : 16;
        }
        if (kVarP.A(i12 & 1, (i12 & 19) != 18)) {
            if (i13 != 0) {
                dVar = d.a.f1143b;
            }
            Object objG = kVarP.g();
            if (objG == j.a.f31715a) {
                objG = new s1();
                kVarP.C(objG);
            }
            b((s1) objG, dVar, pVar, kVarP, (i12 << 3) & 1008);
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new b(dVar, pVar, i10, i11);
        }
    }

    public static final void b(s1 s1Var, androidx.compose.ui.d dVar, eh.p pVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(-511989831);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.l(s1Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(dVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(pVar) ? 256 : 128;
        }
        int i12 = 0;
        if (kVarP.A(i11 & 1, (i11 & 147) != 146)) {
            int i13 = kVarP.P;
            k.b bVarE = kVarP.E();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
            a2 a2VarP = kVarP.P();
            e0.a aVar = i2.e0.V;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            v1.j(s1Var.f11442c, s1Var, kVarP);
            v1.j(s1Var.f11443d, bVarE, kVarP);
            v1.j(s1Var.f11444e, pVar, kVarP);
            i2.g.f13861o.getClass();
            v1.j(g.a.f13866e, a2VarP, kVarP);
            v1.j(g.a.f13865d, dVarC, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i13))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i13, kVarP, i13, c0128a);
            }
            kVarP.T(true);
            if (kVarP.s()) {
                kVarP.L(-26267397);
                kVarP.T(false);
            } else {
                kVarP.L(-26326018);
                boolean zL = kVarP.l(s1Var);
                Object objG = kVarP.g();
                if (zL || objG == j.a.f31715a) {
                    objG = new q1(s1Var, i12);
                    kVarP.C(objG);
                }
                x0.l0 l0Var = x0.o0.f31834a;
                kVarP.u((eh.a) objG);
                kVarP.T(false);
            }
        } else {
            kVarP.v();
        }
        h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new r1(s1Var, dVar, pVar, i10);
        }
    }
}
