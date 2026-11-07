package p0;

import w1.d;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21115a;

    public static final w1.d a() {
        w1.d dVar = f21115a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(5.0f, 20.0f);
        eVar.e(14.0f);
        eVar.l(-2.0f);
        eVar.d(5.0f);
        eVar.k(20.0f);
        eVar.a();
        eVar.h(19.0f, 9.0f);
        eVar.e(-4.0f);
        eVar.k(3.0f);
        eVar.d(9.0f);
        eVar.l(6.0f);
        eVar.d(5.0f);
        id.i.b(eVar, 7.0f, 7.0f, 19.0f, 9.0f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21115a = dVarB;
        return dVarB;
    }
}
