package p0;

import w1.d;

/* loaded from: classes.dex */
public final class o5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20971a;

    public static final w1.d a() {
        w1.d dVar = f20971a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
        eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
        eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
        com.google.android.recaptcha.internal.e.c(eVarA, 13.0f, 17.0f, -2.0f, -6.0f);
        eVarA.e(2.0f);
        eVarA.l(6.0f);
        eVarA.a();
        eVarA.h(13.0f, 9.0f);
        eVarA.e(-2.0f);
        eVarA.f(11.0f, 7.0f);
        eVarA.e(2.0f);
        eVarA.l(2.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20971a = dVarB;
        return dVarB;
    }
}
