package n0;

import q1.b1;
import q1.i2;
import w1.d;
import w1.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f18290a;

    public static final w1.d a() {
        w1.d dVar = f18290a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 11.0f);
        eVar.d(7.83f);
        eVar.g(5.59f, -5.59f);
        eVar.f(12.0f, 4.0f);
        eVar.g(-8.0f, 8.0f);
        eVar.g(8.0f, 8.0f);
        eVar.g(1.41f, -1.41f);
        eVar.f(7.83f, 13.0f);
        eVar.d(20.0f);
        eVar.l(-2.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f18290a = dVarB;
        return dVarB;
    }
}
