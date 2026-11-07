package p0;

import w1.d;

/* loaded from: classes.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21012a;

    public static final w1.d a() {
        w1.d dVar = f21012a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Functions", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(18.0f, 4.0f);
        eVar.d(6.0f);
        eVar.l(2.0f);
        eVar.g(6.5f, 6.0f);
        id.h.c(eVar, 6.0f, 18.0f, 2.0f, 12.0f);
        eVar.l(-3.0f);
        eVar.e(-7.0f);
        eVar.g(5.0f, -5.0f);
        eVar.g(-5.0f, -5.0f);
        eVar.e(7.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21012a = dVarB;
        return dVarB;
    }
}
