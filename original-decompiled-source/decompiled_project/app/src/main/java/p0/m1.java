package p0;

import w1.d;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20940a;

    public static final w1.d a() {
        w1.d dVar = f20940a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
        eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
        eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
        l9.y.a(eVarA, 10.0f, 17.0f, -5.0f, -5.0f);
        eVarA.g(1.41f, -1.41f);
        eVarA.f(10.0f, 14.17f);
        eVarA.g(7.59f, -7.59f);
        eVarA.f(19.0f, 8.0f);
        eVarA.g(-9.0f, 9.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20940a = dVarB;
        return dVarB;
    }
}
