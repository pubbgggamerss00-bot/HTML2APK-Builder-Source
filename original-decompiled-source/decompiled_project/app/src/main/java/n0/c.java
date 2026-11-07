package n0;

import q1.b1;
import q1.i2;
import w1.d;
import w1.m;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f18291a;

    public static final w1.d a() {
        w1.d dVar = f18291a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("AutoMirrored.Filled.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = b.a(12.0f, 4.0f, -1.41f, 1.41f);
        eVarA.f(16.17f, 11.0f);
        eVarA.d(4.0f);
        eVarA.l(2.0f);
        eVarA.e(12.17f);
        eVarA.g(-5.58f, 5.59f);
        eVarA.f(12.0f, 20.0f);
        eVarA.g(8.0f, -8.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f18291a = dVarB;
        return dVarB;
    }
}
