package p0;

import w1.d;

/* loaded from: classes.dex */
public final class z5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21118a;

    public static final w1.d a() {
        w1.d dVar = f21118a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Landscape", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(14.0f, 6.0f, -3.75f, 5.0f);
        eVarA.g(2.85f, 3.8f);
        eVarA.g(-1.6f, 1.2f);
        eVarA.b(9.81f, 13.75f, 7.0f, 10.0f, 7.0f, 10.0f);
        eVarA.g(-6.0f, 8.0f);
        eVarA.e(22.0f);
        eVarA.f(14.0f, 6.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21118a = dVarB;
        return dVarB;
    }
}
