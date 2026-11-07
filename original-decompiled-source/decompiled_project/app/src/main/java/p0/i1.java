package p0;

import w1.d;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20885a;

    public static final w1.d a() {
        w1.d dVar = f20885a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.ChangeHistory", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(12.0f, 7.77f);
        eVar.f(18.39f, 18.0f);
        eVar.d(5.61f);
        eVar.f(12.0f, 7.77f);
        eVar.h(12.0f, 4.0f);
        eVar.f(2.0f, 20.0f);
        eVar.e(20.0f);
        eVar.f(12.0f, 4.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20885a = dVarB;
        return dVarB;
    }
}
