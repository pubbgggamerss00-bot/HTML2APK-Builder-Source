package androidx.compose.foundation.text.modifiers;

import eh.l;
import g2.k0;
import g2.m0;
import g2.o0;
import g2.p;
import i2.b0;
import i2.g1;
import i2.h0;
import i2.m;
import i2.r;
import i2.t;
import java.util.List;
import l0.g;
import l0.j;
import q1.e1;
import t2.l0;
import x2.f;
import y.c;

/* loaded from: classes.dex */
public final class a extends m implements b0, r, t {

    /* renamed from: s, reason: collision with root package name */
    public g f1100s;

    /* renamed from: t, reason: collision with root package name */
    public final b f1101t;

    public a() {
        throw null;
    }

    public a(t2.b bVar, l0 l0Var, f.a aVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, g gVar, e1 e1Var) {
        this.f1100s = gVar;
        b bVar2 = new b(bVar, l0Var, aVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, e1Var, null);
        T1(bVar2);
        this.f1101t = bVar2;
        if (this.f1100s != null) {
            return;
        }
        c.b("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        throw new pg.g();
    }

    @Override // i2.b0
    public final int F(i2.l0 l0Var, p pVar, int i10) {
        return this.f1101t.F(l0Var, pVar, i10);
    }

    @Override // i2.b0
    public final int G(i2.l0 l0Var, p pVar, int i10) {
        return this.f1101t.G(l0Var, pVar, i10);
    }

    @Override // androidx.compose.ui.d.c
    public final boolean I1() {
        return false;
    }

    @Override // i2.t
    public final void g0(g1 g1Var) {
        g gVar = this.f1100s;
        if (gVar != null) {
            gVar.f16612d = j.a(gVar.f16612d, g1Var, null, 2);
            gVar.f16610b.g(gVar.f16609a);
        }
    }

    @Override // i2.b0
    public final m0 m(o0 o0Var, k0 k0Var, long j10) {
        return this.f1101t.m(o0Var, k0Var, j10);
    }

    @Override // i2.b0
    public final int r(i2.l0 l0Var, p pVar, int i10) {
        return this.f1101t.r(l0Var, pVar, i10);
    }

    @Override // i2.b0
    public final int w(i2.l0 l0Var, p pVar, int i10) {
        return this.f1101t.w(l0Var, pVar, i10);
    }

    @Override // i2.r
    public final void z(h0 h0Var) throws Throwable {
        this.f1101t.z(h0Var);
    }
}
