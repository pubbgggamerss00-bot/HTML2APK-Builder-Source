package i2;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.d;
import c2.k0;
import com.yalantis.ucrop.view.CropImageView;
import i2.v1;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c extends d.c implements b0, r, k2, i2, h2.f, h2.h, g2, a0, t, o1.h, o1.a0, o1.e0, w1, n1.b {

    /* renamed from: q, reason: collision with root package name */
    public d.b f13773q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13774r;

    /* renamed from: s, reason: collision with root package name */
    public h2.a f13775s;

    /* renamed from: t, reason: collision with root package name */
    public HashSet<h2.c<?>> f13776t;

    /* renamed from: v, reason: collision with root package name */
    public g2.v f13777v;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            c.this.V1();
            return pg.f0.f21461a;
        }
    }

    public static final class b implements v1.a {
        public b() {
        }

        @Override // i2.v1.a
        public final void b() {
            c cVar = c.this;
            if (cVar.f13777v == null) {
                cVar.t0(k.d(cVar, 128));
            }
        }
    }

    /* renamed from: i2.c$c, reason: collision with other inner class name */
    public static final class C0127c extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public C0127c() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            c cVar = c.this;
            d.b bVar = cVar.f13773q;
            kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((h2.d) bVar).p(cVar);
            return pg.f0.f21461a;
        }
    }

    @Override // h2.f
    public final c5.p E0() {
        h2.a aVar = this.f13775s;
        return aVar != null ? aVar : h2.b.f12220a;
    }

    @Override // i2.b0
    public final int F(l0 l0Var, g2.p pVar, int i10) {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.b0) bVar).F(l0Var, pVar, i10);
    }

    @Override // i2.b0
    public final int G(l0 l0Var, g2.p pVar, int i10) {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.b0) bVar).G(l0Var, pVar, i10);
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // i2.i2
    public final void J(c2.r rVar, c2.t tVar, long j10) {
        boolean z10;
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        k0.b bVarO = ((c2.h0) bVar).o();
        bVarO.getClass();
        ?? r10 = rVar.f4687a;
        c2.k0 k0Var = c2.k0.this;
        if (k0Var.f4656d) {
            z10 = true;
            break;
        }
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            c2.b0 b0Var = (c2.b0) r10.get(i10);
            if (c2.s.a(b0Var) || c2.s.c(b0Var)) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        if (bVarO.f4662b != k0.a.f4660c) {
            if (tVar == c2.t.f4694a && z10) {
                bVarO.c0(rVar);
            }
            if (tVar == c2.t.f4696c && !z10) {
                bVarO.c0(rVar);
            }
        }
        if (tVar == c2.t.f4696c) {
            int size2 = r10.size();
            for (int i11 = 0; i11 < size2; i11++) {
                if (!c2.s.c((c2.b0) r10.get(i11))) {
                    return;
                }
            }
            bVarO.f4662b = k0.a.f4658a;
            k0Var.f4656d = false;
        }
    }

    @Override // androidx.compose.ui.d.c
    public final void L1() {
        T1(true);
    }

    @Override // androidx.compose.ui.d.c
    public final void M1() {
        U1();
    }

    @Override // i2.a0
    public final void O(long j10) {
        d.b bVar = this.f13773q;
        if (bVar instanceof g2.a1) {
            ((g2.a1) bVar).v();
        }
    }

    @Override // i2.g2
    public final Object O0(f3.d dVar, Object obj) {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((g2.d1) bVar).t();
    }

    @Override // o1.h
    public final void Q(o1.i0 i0Var) {
        d.b bVar = this.f13773q;
        if (!(bVar instanceof o1.g)) {
            f2.a.b("onFocusEvent called on wrong node");
        }
        ((o1.g) bVar).q();
    }

    public final void T1(boolean z10) {
        if (!this.f1157p) {
            f2.a.b("initializeModifier called on unattached node");
        }
        d.b bVar = this.f13773q;
        if ((this.f1146c & 32) != 0) {
            if (bVar instanceof h2.d) {
                k.g(this).d(new a());
            }
            if (bVar instanceof h2.g) {
                h2.g<?> gVar = (h2.g) bVar;
                h2.a aVar = this.f13775s;
                if (aVar == null || !aVar.P(gVar.getKey())) {
                    h2.a aVar2 = new h2.a();
                    aVar2.f12219a = gVar;
                    this.f13775s = aVar2;
                    if (e.a(this)) {
                        h2.e modifierLocalManager = k.g(this).getModifierLocalManager();
                        h2.i<?> key = gVar.getKey();
                        modifierLocalManager.f12223b.b(this);
                        modifierLocalManager.f12224c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f12219a = gVar;
                    h2.e modifierLocalManager2 = k.g(this).getModifierLocalManager();
                    h2.i<?> key2 = gVar.getKey();
                    modifierLocalManager2.f12223b.b(this);
                    modifierLocalManager2.f12224c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f1146c & 4) != 0) {
            if (bVar instanceof n1.i) {
                this.f13774r = true;
            }
            if (!z10) {
                k.d(this, 2).x1();
            }
        }
        if ((this.f1146c & 2) != 0) {
            if (e.a(this)) {
                g1 g1Var = this.f1151h;
                kotlin.jvm.internal.r.b(g1Var);
                ((c0) g1Var).X1(this);
                u1 u1Var = g1Var.M;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
            }
            if (!z10) {
                k.d(this, 2).x1();
                k.f(this).O();
            }
        }
        if (bVar instanceof g2.j1) {
            ((g2.j1) bVar).u(k.f(this));
        }
        if ((this.f1146c & 128) != 0) {
            if ((bVar instanceof g2.a1) && e.a(this)) {
                k.f(this).O();
            }
            if (bVar instanceof g2.z0) {
                this.f13777v = null;
                if (e.a(this)) {
                    k.g(this).w(new b());
                }
            }
        }
        if ((this.f1146c & 256) != 0 && (bVar instanceof g2.x0) && e.a(this)) {
            k.f(this).O();
        }
        if (bVar instanceof o1.d0) {
            ((o1.d0) bVar).n().f18857a.b(this);
        }
        if ((this.f1146c & 16) != 0 && (bVar instanceof c2.h0)) {
            ((c2.h0) bVar).o().f4646a = this.f1151h;
        }
        if ((this.f1146c & 8) != 0) {
            k.g(this).v();
        }
    }

    @Override // i2.w1
    public final boolean U() {
        return this.f1157p;
    }

    public final void U1() {
        if (!this.f1157p) {
            f2.a.b("unInitializeModifier called on unattached node");
        }
        d.b bVar = this.f13773q;
        if ((this.f1146c & 32) != 0) {
            if (bVar instanceof h2.g) {
                h2.e modifierLocalManager = k.g(this).getModifierLocalManager();
                h2.i key = ((h2.g) bVar).getKey();
                modifierLocalManager.f12225d.b(k.f(this));
                modifierLocalManager.f12226e.b(key);
                modifierLocalManager.a();
            }
            if (bVar instanceof h2.d) {
                ((h2.d) bVar).p(e.f13804a);
            }
        }
        if ((this.f1146c & 8) != 0) {
            k.g(this).v();
        }
        if (bVar instanceof o1.d0) {
            ((o1.d0) bVar).n().f18857a.j(this);
        }
    }

    public final void V1() {
        if (this.f1157p) {
            this.f13776t.clear();
            k.g(this).getSnapshotObserver().a(this, e.f13806c, new C0127c());
        }
    }

    @Override // i2.k2
    public final void X(q2.d0 d0Var) {
        int i10;
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        q2.l lVarE = ((q2.p) bVar).e();
        kotlin.jvm.internal.r.c(d0Var, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        q2.l lVar = (q2.l) d0Var;
        p.l0<q2.c0<?>, Object> l0Var = lVar.f21799a;
        if (lVarE.f21801c) {
            lVar.f21801c = true;
        }
        if (lVarE.f21802d) {
            lVar.f21802d = true;
        }
        p.l0<q2.c0<?>, Object> l0Var2 = lVarE.f21799a;
        Object[] objArr = l0Var2.f20738b;
        Object[] objArr2 = l0Var2.f20739c;
        long[] jArr = l0Var2.f20737a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i11 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((255 & j10) < 128) {
                        int i15 = (i11 << 3) + i14;
                        Object obj = objArr[i15];
                        Object obj2 = objArr2[i15];
                        q2.c0<?> c0Var = (q2.c0) obj;
                        if (!l0Var.a(c0Var)) {
                            l0Var.l(c0Var, obj2);
                        } else if (obj2 instanceof q2.a) {
                            Object objD = l0Var.d(c0Var);
                            kotlin.jvm.internal.r.c(objD, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            q2.a aVar = (q2.a) objD;
                            i10 = i12;
                            String str = aVar.f21752a;
                            if (str == null) {
                                str = ((q2.a) obj2).f21752a;
                            }
                            pg.f fVar = aVar.f21753b;
                            if (fVar == null) {
                                fVar = ((q2.a) obj2).f21753b;
                            }
                            l0Var.l(c0Var, new q2.a(str, fVar));
                        }
                        i10 = i12;
                    } else {
                        i10 = i12;
                    }
                    j10 >>= i10;
                    i14++;
                    i12 = i10;
                }
                if (i13 != i12) {
                    return;
                }
            }
            if (i11 == length) {
                return;
            } else {
                i11++;
            }
        }
    }

    @Override // o1.a0
    public final void Y0(o1.w wVar) {
        d.b bVar = this.f13773q;
        if (!(bVar instanceof o1.o)) {
            f2.a.b("applyFocusProperties called on wrong node");
        }
        ((o1.o) bVar).y();
    }

    @Override // i2.t
    public final void g0(g1 g1Var) {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((g2.x0) bVar).x();
    }

    @Override // n1.b
    public final f3.d getDensity() {
        return k.f(this).B;
    }

    @Override // n1.b
    public final f3.r getLayoutDirection() {
        return k.f(this).C;
    }

    @Override // n1.b
    public final long i() {
        return f3.q.e(k.d(this, 128).f11384c);
    }

    @Override // i2.i2
    public final boolean i1() {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((c2.h0) bVar).o().getClass();
        return true;
    }

    @Override // i2.b0
    public final g2.m0 m(g2.o0 o0Var, g2.k0 k0Var, long j10) {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.b0) bVar).m(o0Var, k0Var, j10);
    }

    @Override // i2.b0
    public final int r(l0 l0Var, g2.p pVar, int i10) {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.b0) bVar).r(l0Var, pVar, i10);
    }

    @Override // i2.i2
    public final void r0() {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        k0.b bVarO = ((c2.h0) bVar).o();
        c2.k0 k0Var = c2.k0.this;
        if (bVarO.f4662b == k0.a.f4659b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            c2.l0 l0Var = new c2.l0(k0Var);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
            motionEventObtain.setSource(0);
            l0Var.invoke(motionEventObtain);
            motionEventObtain.recycle();
            bVarO.f4662b = k0.a.f4658a;
            k0Var.f4656d = false;
        }
    }

    @Override // i2.a0
    public final void t0(g2.v vVar) {
        this.f13777v = vVar;
        d.b bVar = this.f13773q;
        if (bVar instanceof g2.z0) {
            ((g2.z0) bVar).g();
        }
    }

    public final String toString() {
        return this.f13773q.toString();
    }

    @Override // i2.b0
    public final int w(l0 l0Var, g2.p pVar, int i10) {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((g2.b0) bVar).w(l0Var, pVar, i10);
    }

    @Override // i2.r
    public final void w0() {
        this.f13774r = true;
        s.a(this);
    }

    @Override // i2.j, i2.i2
    public final void x() {
        if (this.f13773q instanceof c2.h0) {
            r0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [z0.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // h2.f, h2.h
    public final <T> T y(h2.c<T> cVar) {
        d1 d1Var;
        this.f13776t.add(cVar);
        if (!this.f1144a.f1157p) {
            f2.a.b("visitAncestors called on an unattached node");
        }
        d.c cVar2 = this.f1144a.f1148e;
        e0 e0VarF = k.f(this);
        while (e0VarF != null) {
            if ((e0VarF.I.f13793e.f1147d & 32) != 0) {
                while (cVar2 != null) {
                    if ((cVar2.f1146c & 32) != 0) {
                        m mVarB = cVar2;
                        ?? bVar = 0;
                        while (mVarB != 0) {
                            if (mVarB instanceof h2.f) {
                                h2.f fVar = (h2.f) mVarB;
                                if (fVar.E0().P(cVar)) {
                                    return (T) fVar.E0().U(cVar);
                                }
                            } else if ((mVarB.f1146c & 32) != 0 && (mVarB instanceof m)) {
                                d.c cVar3 = mVarB.f13947r;
                                int i10 = 0;
                                mVarB = mVarB;
                                bVar = bVar;
                                while (cVar3 != null) {
                                    if ((cVar3.f1146c & 32) != 0) {
                                        i10++;
                                        bVar = bVar;
                                        if (i10 == 1) {
                                            mVarB = cVar3;
                                        } else {
                                            if (bVar == 0) {
                                                bVar = new z0.b(new d.c[16]);
                                            }
                                            if (mVarB != 0) {
                                                bVar.b(mVarB);
                                                mVarB = 0;
                                            }
                                            bVar.b(cVar3);
                                        }
                                    }
                                    cVar3 = cVar3.f1149f;
                                    mVarB = mVarB;
                                    bVar = bVar;
                                }
                                if (i10 == 1) {
                                }
                            }
                            mVarB = k.b(bVar);
                        }
                    }
                    cVar2 = cVar2.f1148e;
                }
            }
            e0VarF = e0VarF.G();
            cVar2 = (e0VarF == null || (d1Var = e0VarF.I) == null) ? null : d1Var.f13792d;
        }
        return cVar.f12221a.invoke();
    }

    @Override // i2.r
    public final void z(h0 h0Var) {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        n1.j jVar = (n1.j) bVar;
        if (this.f13774r && (bVar instanceof n1.i)) {
            d.b bVar2 = this.f13773q;
            if (bVar2 instanceof n1.i) {
                k.g(this).getSnapshotObserver().a(this, e.f13805b, new d(bVar2, this));
            }
            this.f13774r = false;
        }
        jVar.z(h0Var);
    }

    @Override // i2.i2
    public final void z0() {
        d.b bVar = this.f13773q;
        kotlin.jvm.internal.r.c(bVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((c2.h0) bVar).o().getClass();
    }
}
