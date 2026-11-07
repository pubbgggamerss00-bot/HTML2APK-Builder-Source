package p0;

import w1.d;

/* loaded from: classes.dex */
public final class gc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20869a;

    public static final w1.d a() {
        w1.d dVar = f20869a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(1.0f, 21.0f);
        eVar.e(22.0f);
        eVar.f(12.0f, 2.0f);
        ji.a.b(eVar, 1.0f, 21.0f, 13.0f, 18.0f);
        eVar.e(-2.0f);
        eVar.l(-2.0f);
        eVar.e(2.0f);
        eVar.l(2.0f);
        eVar.a();
        n.a(eVar, 13.0f, 14.0f, -2.0f, -4.0f);
        eVar.e(2.0f);
        eVar.l(4.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20869a = dVarB;
        return dVarB;
    }
}
