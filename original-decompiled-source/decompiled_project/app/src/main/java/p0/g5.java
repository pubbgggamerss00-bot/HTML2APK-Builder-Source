package p0;

import w1.d;

/* loaded from: classes.dex */
public final class g5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20862a;

    public static final w1.d a() {
        w1.d dVar = f20862a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Highlight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(6.0f, 14.0f);
        eVar.g(3.0f, 3.0f);
        eVar.l(5.0f);
        eVar.e(6.0f);
        eVar.l(-5.0f);
        eVar.g(3.0f, -3.0f);
        eVar.k(9.0f);
        eVar.d(6.0f);
        eVar.k(14.0f);
        eVar.a();
        n.a(eVar, 11.0f, 2.0f, 2.0f, 3.0f);
        b0.a(eVar, -2.0f, 2.0f, 3.5f, 5.88f);
        eVar.g(1.41f, -1.41f);
        eVar.g(2.12f, 2.12f);
        f0.a(eVar, 5.62f, 8.0f, 3.5f, 5.88f);
        eVar.h(16.96f, 6.59f);
        eVar.g(2.12f, -2.12f);
        eVar.g(1.41f, 1.41f);
        f0.a(eVar, 18.38f, 8.0f, 16.96f, 6.59f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20862a = dVarB;
        return dVarB;
    }
}
