package d0;

import g2.g1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class r0 implements q0, g2.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f7265a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.t1 f7266b;

    /* renamed from: c, reason: collision with root package name */
    public final g0 f7267c;

    /* renamed from: d, reason: collision with root package name */
    public final p.y<List<g2.g1>> f7268d;

    public r0(c0 c0Var, g2.t1 t1Var) {
        this.f7265a = c0Var;
        this.f7266b = t1Var;
        this.f7267c = (g0) c0Var.f7071b.invoke();
        p.y yVar = p.j.f20648a;
        this.f7268d = new p.y<>();
    }

    @Override // d0.q0
    public final List<g2.g1> C0(int i10, long j10) {
        p.y<List<g2.g1>> yVar = this.f7268d;
        List<g2.g1> listB = yVar.b(i10);
        if (listB != null) {
            return listB;
        }
        g0 g0Var = this.f7267c;
        Object objD = g0Var.d(i10);
        List<g2.k0> listF0 = this.f7266b.F0(objD, this.f7265a.a(i10, objD, g0Var.e(i10)));
        int size = listF0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listF0.get(i11).P(j10));
        }
        yVar.h(i10, arrayList);
        return arrayList;
    }

    @Override // d0.q0, f3.d
    public final long E(long j10) {
        return this.f7266b.E(j10);
    }

    @Override // f3.d
    public final float G0() {
        return this.f7266b.G0();
    }

    @Override // g2.q
    public final boolean I0() {
        return this.f7266b.I0();
    }

    @Override // g2.o0
    public final g2.m0 K0(int i10, int i11, Map map, eh.l lVar) {
        return this.f7266b.K0(i10, i11, map, lVar);
    }

    @Override // f3.d
    public final float N0(float f10) {
        return this.f7266b.N0(f10);
    }

    @Override // f3.d
    public final int T0(long j10) {
        return this.f7266b.T0(j10);
    }

    @Override // f3.d
    public final int b1(float f10) {
        return this.f7266b.b1(f10);
    }

    @Override // f3.d
    public final float getDensity() {
        return this.f7266b.getDensity();
    }

    @Override // g2.q
    public final f3.r getLayoutDirection() {
        return this.f7266b.getLayoutDirection();
    }

    @Override // g2.o0
    public final g2.m0 i0(int i10, int i11, Map<g2.a, Integer> map, eh.l<? super g1.a, pg.f0> lVar) {
        return this.f7266b.i0(i10, i11, map, lVar);
    }

    @Override // d0.q0, f3.d
    public final long o(float f10) {
        return this.f7266b.o(f10);
    }

    @Override // d0.q0, f3.d
    public final long p(long j10) {
        return this.f7266b.p(j10);
    }

    @Override // d0.q0, f3.d
    public final float q(long j10) {
        return this.f7266b.q(j10);
    }

    @Override // f3.d
    public final float r1(long j10) {
        return this.f7266b.r1(j10);
    }

    @Override // d0.q0, f3.d
    public final long t(float f10) {
        return this.f7266b.t(f10);
    }

    @Override // d0.q0, f3.d
    public final float u(int i10) {
        return this.f7266b.u(i10);
    }

    @Override // d0.q0, f3.d
    public final float v(float f10) {
        return this.f7266b.v(f10);
    }
}
