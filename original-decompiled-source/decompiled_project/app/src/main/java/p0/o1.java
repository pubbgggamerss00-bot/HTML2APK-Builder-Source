package p0;

import w1.d;

/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20967a;

    public static final w1.d a() {
        w1.d dVar = f20967a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Checklist", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(22.0f, 7.0f);
        eVar.e(-9.0f);
        eVar.l(2.0f);
        eVar.e(9.0f);
        eVar.k(7.0f);
        eVar.a();
        eVar.h(22.0f, 15.0f);
        eVar.e(-9.0f);
        eVar.l(2.0f);
        eVar.e(9.0f);
        eVar.k(15.0f);
        eVar.a();
        eVar.h(5.54f, 11.0f);
        eVar.f(2.0f, 7.46f);
        eVar.g(1.41f, -1.41f);
        eVar.g(2.12f, 2.12f);
        eVar.g(4.24f, -4.24f);
        id.i.b(eVar, 1.41f, 1.41f, 5.54f, 11.0f);
        eVar.h(5.54f, 19.0f);
        eVar.f(2.0f, 15.46f);
        eVar.g(1.41f, -1.41f);
        eVar.g(2.12f, 2.12f);
        eVar.g(4.24f, -4.24f);
        id.i.b(eVar, 1.41f, 1.41f, 5.54f, 19.0f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20967a = dVarB;
        return dVarB;
    }
}
