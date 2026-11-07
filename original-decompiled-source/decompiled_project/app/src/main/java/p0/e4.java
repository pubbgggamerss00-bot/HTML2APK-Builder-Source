package p0;

import w1.d;

/* loaded from: classes.dex */
public final class e4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20834a;

    public static final w1.d a() {
        w1.d dVar = f20834a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Flag", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(14.4f, 6.0f);
        eVar.f(14.0f, 4.0f);
        eVar.d(5.0f);
        eVar.l(17.0f);
        eVar.e(2.0f);
        eVar.l(-7.0f);
        eVar.e(5.6f);
        eVar.g(0.4f, 2.0f);
        eVar.e(7.0f);
        eVar.k(6.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20834a = dVarB;
        return dVarB;
    }
}
