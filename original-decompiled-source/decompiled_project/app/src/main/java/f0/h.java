package f0;

import androidx.compose.ui.d;
import g2.v;
import i2.a0;
import i2.g1;
import i2.k;
import pg.f0;
import ph.j0;

/* loaded from: classes.dex */
public final class h extends d.c implements n2.a, a0 {

    /* renamed from: q, reason: collision with root package name */
    public v.f f8775q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8776r;

    public static final p1.e T1(h hVar, g1 g1Var, n2.b bVar) {
        p1.e eVar;
        if (hVar.f1157p && hVar.f8776r) {
            g1 g1VarE = k.e(hVar);
            if (!g1Var.l1().f1157p) {
                g1Var = null;
            }
            if (g1Var != null && (eVar = (p1.e) bVar.invoke()) != null) {
                return eVar.j(g1VarE.N(g1Var, false).e());
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // n2.a
    public final Object l1(g1 g1Var, n2.b bVar, vg.c cVar) {
        Object objC = j0.c(new f(this, g1Var, bVar, new g(this, g1Var, bVar), null), cVar);
        return objC == ug.a.f29706a ? objC : f0.f21461a;
    }

    @Override // i2.a0
    public final void t0(v vVar) {
        this.f8776r = true;
    }
}
