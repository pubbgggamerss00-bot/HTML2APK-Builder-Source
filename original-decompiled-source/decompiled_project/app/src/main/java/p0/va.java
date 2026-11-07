package p0;

import w1.d;

/* loaded from: classes.dex */
public final class va {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21071a;

    public static final w1.d a() {
        w1.d dVar = f21071a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(12.0f, 17.27f, 18.18f, 21.0f);
        eVarA.g(-1.64f, -7.03f);
        eVarA.f(22.0f, 9.24f);
        eVarA.g(-7.19f, -0.61f);
        eVarA.f(12.0f, 2.0f);
        eVarA.f(9.19f, 8.63f);
        eVarA.f(2.0f, 9.24f);
        id.i.b(eVarA, 5.46f, 4.73f, 5.82f, 21.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21071a = dVarB;
        return dVarB;
    }
}
