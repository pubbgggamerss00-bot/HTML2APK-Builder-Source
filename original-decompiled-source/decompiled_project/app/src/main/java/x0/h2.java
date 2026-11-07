package x0;

import java.util.List;
import x0.j;

/* loaded from: classes.dex */
public final class h2 implements g2 {

    /* renamed from: a, reason: collision with root package name */
    public int f31700a;

    /* renamed from: b, reason: collision with root package name */
    public j2 f31701b;

    /* renamed from: c, reason: collision with root package name */
    public b f31702c;

    /* renamed from: d, reason: collision with root package name */
    public eh.p<? super j, ? super Integer, pg.f0> f31703d;

    /* renamed from: e, reason: collision with root package name */
    public int f31704e;

    /* renamed from: f, reason: collision with root package name */
    public p.f0<Object> f31705f;

    /* renamed from: g, reason: collision with root package name */
    public p.l0<h0<?>, Object> f31706g;

    public static final class a {
        public static void a(d3 d3Var, List list, j2 j2Var) {
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                int iC = d3Var.c((b) list.get(i10));
                int iM = d3Var.M(d3Var.f31633b, d3Var.q(iC));
                Object obj = iM < d3Var.f(d3Var.f31633b, d3Var.q(iC + 1)) ? d3Var.f31634c[d3Var.g(iM)] : j.a.f31715a;
                h2 h2Var = obj instanceof h2 ? (h2) obj : null;
                if (h2Var != null) {
                    h2Var.f31701b = j2Var;
                }
            }
        }
    }

    public h2(v vVar) {
        this.f31701b = vVar;
    }

    public static boolean a(h0 h0Var, p.l0 l0Var) {
        kotlin.jvm.internal.r.c(h0Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        i3 i3VarA = h0Var.a();
        if (i3VarA == null) {
            i3VarA = u3.f31923a;
        }
        return !i3VarA.a(h0Var.l().f31691f, l0Var.d(h0Var));
    }

    public final boolean b() {
        if (this.f31701b != null) {
            b bVar = this.f31702c;
            if (bVar != null ? bVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final v0 c(Object obj) {
        v0 v0VarH;
        j2 j2Var = this.f31701b;
        return (j2Var == null || (v0VarH = j2Var.h(this, obj)) == null) ? v0.f31944a : v0VarH;
    }

    public final void d() {
        j2 j2Var = this.f31701b;
        if (j2Var != null) {
            j2Var.g();
        }
        this.f31701b = null;
        this.f31705f = null;
        this.f31706g = null;
    }

    public final void e(boolean z10) {
        if (z10) {
            this.f31700a |= 32;
        } else {
            this.f31700a &= -33;
        }
    }

    public final void f(eh.p<? super j, ? super Integer, pg.f0> pVar) {
        this.f31703d = pVar;
    }

    @Override // x0.g2
    public final void invalidate() {
        j2 j2Var = this.f31701b;
        if (j2Var != null) {
            j2Var.h(this, null);
        }
    }
}
