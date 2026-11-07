package p0;

import w1.d;

/* loaded from: classes.dex */
public final class l5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20931a;

    public static final w1.d a() {
        w1.d dVar = f20931a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.HourglassEmpty", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(6.0f, 2.0f);
        eVar.l(6.0f);
        eVar.e(0.01f);
        eVar.f(6.0f, 8.01f);
        eVar.f(10.0f, 12.0f);
        eVar.g(-4.0f, 4.0f);
        eVar.g(0.01f, 0.01f);
        eVar.f(6.0f, 16.01f);
        eVar.f(6.0f, 22.0f);
        eVar.e(12.0f);
        eVar.l(-5.99f);
        eVar.e(-0.01f);
        eVar.f(18.0f, 16.0f);
        eVar.g(-4.0f, -4.0f);
        eVar.g(4.0f, -3.99f);
        eVar.g(-0.01f, -0.01f);
        eVar.f(18.0f, 8.0f);
        f0.a(eVar, 18.0f, 2.0f, 6.0f, 2.0f);
        eVar.h(16.0f, 16.5f);
        eVar.f(16.0f, 20.0f);
        eVar.f(8.0f, 20.0f);
        eVar.l(-3.5f);
        h.b(eVar, 4.0f, -4.0f, 4.0f, 4.0f);
        eVar.h(12.0f, 11.5f);
        eVar.g(-4.0f, -4.0f);
        eVar.f(8.0f, 4.0f);
        eVar.e(8.0f);
        eVar.l(3.5f);
        eVar.g(-4.0f, 4.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20931a = dVarB;
        return dVarB;
    }
}
