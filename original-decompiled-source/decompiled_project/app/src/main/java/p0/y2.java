package p0;

import w1.d;

/* loaded from: classes.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21102a;

    public static final w1.d a() {
        w1.d dVar = f21102a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.DoneAll", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(18.0f, 7.0f, -1.41f, -1.41f);
        eVarA.g(-6.34f, 6.34f);
        id.i.b(eVarA, 1.41f, 1.41f, 18.0f, 7.0f);
        eVarA.h(22.24f, 5.59f);
        eVarA.f(11.66f, 16.17f);
        eVarA.f(7.48f, 12.0f);
        eVarA.g(-1.41f, 1.41f);
        eVarA.f(11.66f, 19.0f);
        h.b(eVarA, 12.0f, -12.0f, -1.42f, -1.41f);
        eVarA.h(0.41f, 13.41f);
        eVarA.f(6.0f, 19.0f);
        eVarA.g(1.41f, -1.41f);
        f0.a(eVarA, 1.83f, 12.0f, 0.41f, 13.41f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21102a = dVarB;
        return dVarB;
    }
}
