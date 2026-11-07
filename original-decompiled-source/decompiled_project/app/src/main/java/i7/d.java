package i7;

import g2.j;
import h7.k;
import ph.i0;
import q1.c1;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: y, reason: collision with root package name */
    public final h7.e f14187y;

    public d(h7.e eVar, j1.d dVar, j jVar, float f10, c1 c1Var, boolean z10, String str, k kVar) {
        this.f14177q = dVar;
        this.f14178r = jVar;
        this.f14179s = f10;
        this.f14180t = c1Var;
        this.f14181v = z10;
        this.f14182w = str;
        this.f14183x = kVar;
        this.f14187y = eVar;
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        i0 i0VarH1 = H1();
        h7.e eVar = this.f14187y;
        eVar.f12288n = i0VarH1;
        eVar.d();
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        this.f14187y.c();
    }

    @Override // androidx.compose.ui.d.c
    public final void N1() {
        this.f14187y.m(null);
    }
}
