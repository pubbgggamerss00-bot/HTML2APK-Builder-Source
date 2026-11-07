package z;

import g2.g1;
import i2.e0;
import i2.g;
import j1.d;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final p.l0<j1.d, g2.l0> f34506a = c(true);

    /* renamed from: b, reason: collision with root package name */
    public static final p.l0<j1.d, g2.l0> f34507b = c(false);

    /* renamed from: c, reason: collision with root package name */
    public static final b f34508c = b.f34510a;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<x0.j, Integer, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.d f34509a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.ui.d dVar, int i10) {
            super(2);
            this.f34509a = dVar;
        }

        @Override // eh.p
        public final pg.f0 invoke(x0.j jVar, Integer num) {
            num.intValue();
            int iN = f3.i.n(1);
            g.a(this.f34509a, jVar, iN);
            return pg.f0.f21461a;
        }
    }

    public static final class b implements g2.l0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34510a = new b();

        public static final class a extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f34511a = new a(1);

            @Override // eh.l
            public final /* bridge */ /* synthetic */ pg.f0 invoke(g1.a aVar) {
                return pg.f0.f21461a;
            }
        }

        @Override // g2.l0
        public final g2.m0 h(g2.o0 o0Var, List<? extends g2.k0> list, long j10) {
            return o0Var.i0(f3.b.k(j10), f3.b.j(j10), qg.a0.f22708a, a.f34511a);
        }
    }

    public static final void a(androidx.compose.ui.d dVar, x0.j jVar, int i10) {
        x0.k kVarP = jVar.p(-211209833);
        int i11 = (kVarP.K(dVar) ? 4 : 2) | i10;
        if (kVarP.A(i11 & 1, (i11 & 3) != 2)) {
            int i12 = kVarP.P;
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(dVar, kVarP);
            x0.a2 a2VarP = kVarP.P();
            i2.g.f13861o.getClass();
            e0.a aVar = g.a.f13863b;
            kVarP.r();
            if (kVarP.O) {
                kVarP.w(aVar);
            } else {
                kVarP.z();
            }
            ph.v1.j(g.a.f13867f, f34508c, kVarP);
            ph.v1.j(g.a.f13866e, a2VarP, kVarP);
            ph.v1.j(g.a.f13865d, dVarC, kVarP);
            g.a.C0128a c0128a = g.a.f13868g;
            if (kVarP.O || !kotlin.jvm.internal.r.a(kVarP.g(), Integer.valueOf(i12))) {
                org.bouncycastle.jcajce.provider.digest.e.a(i12, kVarP, i12, c0128a);
            }
            kVarP.T(true);
        } else {
            kVarP.v();
        }
        x0.h2 h2VarV = kVarP.V();
        if (h2VarV != null) {
            h2VarV.f31703d = new a(dVar, i10);
        }
    }

    public static final void b(g1.a aVar, g2.g1 g1Var, g2.k0 k0Var, f3.r rVar, int i10, int i11, j1.d dVar) {
        j1.f fVar;
        Object objW = k0Var.w();
        f fVar2 = objW instanceof f ? (f) objW : null;
        g1.a.f(aVar, g1Var, ((fVar2 == null || (fVar = fVar2.f34503q) == null) ? dVar : fVar).a((g1Var.f11382a << 32) | (g1Var.f11383b & BodyPartID.bodyIdMax), (i10 << 32) | (i11 & BodyPartID.bodyIdMax), rVar));
    }

    public static final p.l0<j1.d, g2.l0> c(boolean z10) {
        p.l0<j1.d, g2.l0> l0Var = new p.l0<>(9);
        j1.f fVar = d.a.f14602a;
        l0Var.l(fVar, new h(fVar, z10));
        j1.f fVar2 = d.a.f14603b;
        l0Var.l(fVar2, new h(fVar2, z10));
        j1.f fVar3 = d.a.f14604c;
        l0Var.l(fVar3, new h(fVar3, z10));
        j1.f fVar4 = d.a.f14605d;
        l0Var.l(fVar4, new h(fVar4, z10));
        j1.f fVar5 = d.a.f14606e;
        l0Var.l(fVar5, new h(fVar5, z10));
        j1.f fVar6 = d.a.f14607f;
        l0Var.l(fVar6, new h(fVar6, z10));
        j1.f fVar7 = d.a.f14608g;
        l0Var.l(fVar7, new h(fVar7, z10));
        j1.f fVar8 = d.a.f14609h;
        l0Var.l(fVar8, new h(fVar8, z10));
        j1.f fVar9 = d.a.f14610i;
        l0Var.l(fVar9, new h(fVar9, z10));
        return l0Var;
    }

    public static final g2.l0 d(j1.d dVar, boolean z10) {
        g2.l0 l0VarD = (z10 ? f34506a : f34507b).d(dVar);
        return l0VarD == null ? new h(dVar, z10) : l0VarD;
    }
}
