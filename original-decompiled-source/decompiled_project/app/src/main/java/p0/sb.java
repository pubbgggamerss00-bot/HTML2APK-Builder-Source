package p0;

import w1.d;

/* loaded from: classes.dex */
public final class sb {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21033a;

    public static final w1.d a() {
        w1.d dVar = f21033a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.TrendingUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(16.0f, 6.0f, 2.29f, 2.29f);
        eVarA.g(-4.88f, 4.88f);
        eVarA.g(-4.0f, -4.0f);
        eVarA.f(2.0f, 16.59f);
        eVarA.f(3.41f, 18.0f);
        eVarA.g(6.0f, -6.0f);
        eVarA.g(4.0f, 4.0f);
        eVarA.g(6.3f, -6.29f);
        eVarA.f(22.0f, 12.0f);
        eVarA.k(6.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21033a = dVarB;
        return dVarB;
    }
}
