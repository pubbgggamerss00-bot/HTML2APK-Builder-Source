package n1;

import p.h0;
import p.r0;
import q1.k1;

/* loaded from: classes.dex */
public final class o implements k1 {

    /* renamed from: a, reason: collision with root package name */
    public h0<t1.d> f18325a;

    /* renamed from: b, reason: collision with root package name */
    public k1 f18326b;

    @Override // q1.k1
    public final void a(t1.d dVar) {
        k1 k1Var = this.f18326b;
        if (k1Var != null) {
            k1Var.a(dVar);
        }
    }

    @Override // q1.k1
    public final t1.d b() {
        k1 k1Var = this.f18326b;
        if (k1Var == null) {
            f2.a.b("GraphicsContext not provided");
        }
        t1.d dVarB = k1Var.b();
        h0<t1.d> h0Var = this.f18325a;
        if (h0Var != null) {
            h0Var.g(dVarB);
            return dVarB;
        }
        Object[] objArr = r0.f20710a;
        h0<t1.d> h0Var2 = new h0<>(1);
        h0Var2.g(dVarB);
        this.f18325a = h0Var2;
        return dVarB;
    }

    public final void c() {
        h0<t1.d> h0Var = this.f18325a;
        if (h0Var != null) {
            Object[] objArr = h0Var.f20706a;
            int i10 = h0Var.f20707b;
            for (int i11 = 0; i11 < i10; i11++) {
                a((t1.d) objArr[i11]);
            }
            h0Var.i();
        }
    }
}
