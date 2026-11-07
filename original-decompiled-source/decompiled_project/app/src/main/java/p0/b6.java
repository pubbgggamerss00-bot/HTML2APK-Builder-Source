package p0;

import w1.d;

/* loaded from: classes.dex */
public final class b6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20795a;

    public static final w1.d a() {
        w1.d dVar = f20795a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Leaderboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(7.5f, 21.0f);
        eVar.d(2.0f);
        eVar.k(9.0f);
        eVar.e(5.5f);
        eVar.k(21.0f);
        eVar.a();
        eVar.h(14.75f, 3.0f);
        eVar.e(-5.5f);
        eVar.l(18.0f);
        eVar.e(5.5f);
        eVar.k(3.0f);
        eVar.a();
        n.a(eVar, 22.0f, 11.0f, -5.5f, 10.0f);
        eVar.d(22.0f);
        eVar.k(11.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20795a = dVarB;
        return dVarB;
    }
}
