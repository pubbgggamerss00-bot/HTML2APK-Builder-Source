package p0;

import w1.d;

/* loaded from: classes.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20896a;

    public static final w1.d a() {
        w1.d dVar = f20896a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.WatchLater", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.b(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f);
        eVarA.j(4.5f, 10.0f, 10.0f, 10.0f);
        eVarA.j(10.0f, -4.5f, 10.0f, -10.0f);
        eVarA.i(17.5f, 2.0f, 12.0f, 2.0f);
        l9.i.b(eVarA, 16.2f, 16.2f, 11.0f, 13.0f);
        eVarA.k(7.0f);
        eVarA.e(1.5f);
        eVarA.l(5.2f);
        id.i.b(eVarA, 4.5f, 2.7f, 16.2f, 16.2f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20896a = dVarB;
        return dVarB;
    }
}
