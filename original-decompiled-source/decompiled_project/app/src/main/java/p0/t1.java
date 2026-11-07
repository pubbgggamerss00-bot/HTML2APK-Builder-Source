package p0;

import w1.d;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21036a;

    public static final w1.d a() {
        w1.d dVar = f21036a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(19.0f, 6.41f, 17.59f, 5.0f);
        eVarA.f(12.0f, 10.59f);
        eVarA.f(6.41f, 5.0f);
        eVarA.f(5.0f, 6.41f);
        eVarA.f(10.59f, 12.0f);
        eVarA.f(5.0f, 17.59f);
        eVarA.f(6.41f, 19.0f);
        eVarA.f(12.0f, 13.41f);
        eVarA.f(17.59f, 19.0f);
        f0.a(eVarA, 19.0f, 17.59f, 13.41f, 12.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21036a = dVarB;
        return dVarB;
    }
}
