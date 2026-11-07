package p0;

import w1.d;

/* loaded from: classes.dex */
public final class da {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20826a;

    public static final w1.d a() {
        w1.d dVar = f20826a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.ShowChart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(3.5f, 18.49f, 6.0f, -6.01f);
        eVarA.g(4.0f, 4.0f);
        eVarA.f(22.0f, 6.92f);
        eVarA.g(-1.41f, -1.41f);
        eVarA.g(-7.09f, 7.97f);
        id.i.b(eVarA, -4.0f, -4.0f, 2.0f, 16.99f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20826a = dVarB;
        return dVarB;
    }
}
