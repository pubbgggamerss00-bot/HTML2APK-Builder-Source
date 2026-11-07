package p0;

import w1.d;

/* loaded from: classes.dex */
public final class j5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20903a;

    public static final w1.d a() {
        w1.d dVar = f20903a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Home", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(10.0f, 20.0f);
        eVar.l(-6.0f);
        eVar.e(4.0f);
        eVar.l(6.0f);
        eVar.e(5.0f);
        eVar.l(-8.0f);
        eVar.e(3.0f);
        eVar.f(12.0f, 3.0f);
        b6.a.c(eVar, 2.0f, 12.0f, 3.0f, 8.0f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20903a = dVarB;
        return dVarB;
    }
}
