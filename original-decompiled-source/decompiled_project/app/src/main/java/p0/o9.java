package p0;

import w1.d;

/* loaded from: classes.dex */
public final class o9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20975a;

    public static final w1.d a() {
        w1.d dVar = f20975a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Science", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.8f, 18.4f);
        eVar.f(14.0f, 10.67f);
        eVar.k(6.5f);
        eVar.g(1.35f, -1.69f);
        eVar.b(15.61f, 4.48f, 15.38f, 4.0f, 14.96f, 4.0f);
        eVar.d(9.04f);
        eVar.b(8.62f, 4.0f, 8.39f, 4.48f, 8.65f, 4.81f);
        eVar.f(10.0f, 6.5f);
        eVar.l(4.17f);
        eVar.f(4.2f, 18.4f);
        eVar.b(3.71f, 19.06f, 4.18f, 20.0f, 5.0f, 20.0f);
        eVar.e(14.0f);
        eVar.b(19.82f, 20.0f, 20.29f, 19.06f, 19.8f, 18.4f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20975a = dVarB;
        return dVarB;
    }
}
