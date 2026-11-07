package p0;

import w1.d;

/* loaded from: classes.dex */
public final class n9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20961a;

    public static final w1.d a() {
        w1.d dVar = f20961a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.School", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(5.0f, 13.18f);
        eVar.l(4.0f);
        eVar.f(12.0f, 21.0f);
        eVar.g(7.0f, -3.82f);
        eVar.l(-4.0f);
        eVar.f(12.0f, 17.0f);
        eVar.g(-7.0f, -3.82f);
        eVar.a();
        eVar.h(12.0f, 3.0f);
        eVar.f(1.0f, 9.0f);
        eVar.g(11.0f, 6.0f);
        eVar.g(9.0f, -4.91f);
        eVar.k(17.0f);
        eVar.e(2.0f);
        eVar.k(9.0f);
        eVar.f(12.0f, 3.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20961a = dVarB;
        return dVarB;
    }
}
