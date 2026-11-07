package m0;

import androidx.compose.ui.d;
import j2.a5;
import x0.j;

/* loaded from: classes.dex */
public final class w0 {

    public static final class a implements w, kotlin.jvm.internal.m {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ eh.a f17539a;

        public a(eh.a aVar) {
            this.f17539a = aVar;
        }

        @Override // m0.w
        public final /* synthetic */ long a() {
            return ((p1.c) this.f17539a.invoke()).f21129a;
        }

        @Override // kotlin.jvm.internal.m
        public final pg.f<?> b() {
            return this.f17539a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof w) || !(obj instanceof kotlin.jvm.internal.m)) {
                return false;
            }
            return kotlin.jvm.internal.r.a(this.f17539a, ((kotlin.jvm.internal.m) obj).b());
        }

        public final int hashCode() {
            return this.f17539a.hashCode();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(androidx.compose.ui.d dVar, f1.b bVar, x0.j jVar, int i10) {
        f1.b bVar2;
        x0.k kVarP = jVar.p(-1075498320);
        int i11 = i10 | 6;
        if (kVarP.A(i11 & 1, (i11 & 19) != 18)) {
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = bg.b.h(null);
                kVarP.C(objG);
            }
            x0.n1 n1Var = (x0.n1) objG;
            z zVar = (z) n1Var.getValue();
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                objG2 = new i0(n1Var);
                kVarP.C(objG2);
            }
            d.a aVar = d.a.f1143b;
            bVar2 = bVar;
            b(aVar, zVar, (eh.l) objG2, bVar2, kVarP, 3462);
            dVar = aVar;
        } else {
            bVar2 = bVar;
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new j0(dVar, bVar2, i10);
        }
    }

    public static final void b(androidx.compose.ui.d dVar, z zVar, eh.l lVar, f1.b bVar, x0.j jVar, int i10) {
        int i11;
        x0.k kVarP = jVar.p(2078139907);
        if ((i10 & 6) == 0) {
            i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= kVarP.K(zVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= kVarP.l(lVar) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= kVarP.l(bVar) ? 2048 : 1024;
        }
        if (kVarP.A(i11 & 1, (i11 & 1171) != 1170)) {
            l2 l2Var = (l2) b0.a0.d(new Object[0], l2.f17395l, v0.f17535a, kVarP, 3072, 4);
            Object objG = kVarP.g();
            j.a.C0321a c0321a = j.a.f31715a;
            if (objG == c0321a) {
                objG = new r1(l2Var);
                kVarP.C(objG);
            }
            r1 r1Var = (r1) objG;
            j2.f2 f2Var = (j2.f2) kVarP.f(j2.j2.f14777f);
            Object objG2 = kVarP.g();
            if (objG2 == c0321a) {
                x0.l0 l0Var = x0.o0.f31834a;
                x0.w2 w2Var = new x0.w2(kVarP.x());
                kVarP.C(w2Var);
                objG2 = w2Var;
            }
            ph.i0 i0Var = (ph.i0) objG2;
            r1Var.f17473e = (y1.a) kVarP.f(j2.j2.f14783l);
            boolean zK = kVarP.K(i0Var) | kVarP.K(f2Var);
            Object objG3 = kVarP.g();
            if (zK || objG3 == c0321a) {
                objG3 = new l0(i0Var, f2Var);
                kVarP.C(objG3);
            }
            r1Var.f17474f = (eh.l) objG3;
            r1Var.f17475g = (a5) kVarP.f(j2.j2.f14788q);
            r1Var.f17472d = new z1(r1Var, lVar);
            r1Var.m(zVar);
            u1 u1Var = new u1(r1Var);
            pg.f0 f0Var = pg.f0.f21461a;
            y1 y1Var = new y1(r1Var, u1Var);
            androidx.compose.ui.d dVarA = d.a.f1143b;
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.input.key.a.a(c2.s0.a(androidx.compose.foundation.c.a(androidx.compose.ui.focus.a.a(androidx.compose.ui.focus.b.a(androidx.compose.ui.layout.c.a(c2.s0.a(dVarA, f0Var, y1Var), new h1.o(r1Var)), r1Var.f17476h), new v1(r1Var)), true, null), 8675309, new d1(new w1(r1Var))), new x1(r1Var));
            if (r1Var.d() != null && r1Var.g()) {
                z zVarE = r1Var.e();
                if (!(zVarE != null ? kotlin.jvm.internal.r.a(zVarE.f17593a, zVarE.f17594b) : true)) {
                    q2.c0<eh.a<p1.c>> c0Var = t.a1.f25160a;
                    dVarA = androidx.compose.ui.c.a(dVarA, j2.c3.f14686a, new i2(r1Var));
                }
            }
            q2.a(dVar.h(dVarA2.h(dVarA)), f1.c.b(-1869667463, new r0(bVar, r1Var, l2Var), kVarP), kVarP, 48);
            boolean zL = kVarP.l(r1Var);
            Object objG4 = kVarP.g();
            if (zL || objG4 == c0321a) {
                objG4 = new t0(r1Var);
                kVarP.C(objG4);
            }
            x0.o0.a(r1Var, (eh.l) objG4, kVarP);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new u0(dVar, zVar, lVar, bVar, i10);
        }
    }
}
