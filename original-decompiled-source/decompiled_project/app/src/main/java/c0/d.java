package c0;

import c0.b;
import z.b;

/* loaded from: classes.dex */
public final class d implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public final g f4360a;

    /* renamed from: b, reason: collision with root package name */
    public long f4361b = f3.c.b(0, 0, 15);

    /* renamed from: c, reason: collision with root package name */
    public float f4362c;

    /* renamed from: d, reason: collision with root package name */
    public s0 f4363d;

    public d(g gVar) {
        this.f4360a = gVar;
    }

    @Override // c0.t0
    public final s0 a(d0.q0 q0Var, long j10) {
        if (this.f4363d != null && f3.b.c(this.f4361b, j10) && this.f4362c == q0Var.getDensity()) {
            s0 s0Var = this.f4363d;
            kotlin.jvm.internal.r.b(s0Var);
            return s0Var;
        }
        this.f4361b = j10;
        this.f4362c = q0Var.getDensity();
        if (f3.b.i(j10) == Integer.MAX_VALUE) {
            y.c.a("LazyVerticalGrid's width should be bound by parent.");
        }
        int i10 = f3.b.i(j10);
        g gVar = this.f4360a;
        b.a aVar = gVar.f4389a;
        b.e eVar = gVar.f4390b;
        int[] iArrB0 = qg.x.b0(aVar.a(q0Var, i10, q0Var.b1(eVar.a())));
        int[] iArr = new int[iArrB0.length];
        eVar.b(q0Var, i10, iArrB0, f3.r.f8828a, iArr);
        s0 s0Var2 = new s0(iArrB0, iArr);
        this.f4363d = s0Var2;
        return s0Var2;
    }
}
