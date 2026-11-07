package p0;

import w1.d;

/* loaded from: classes.dex */
public final class f8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20851a;

    public static final w1.d a() {
        w1.d dVar = f20851a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.PieChart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(11.0f, 2.0f);
        eVar.l(20.0f);
        eVar.c(-5.07f, -0.5f, -9.0f, -4.79f, -9.0f, -10.0f);
        eVar.j(3.93f, -9.5f, 9.0f, -10.0f);
        eVar.a();
        eVar.h(13.03f, 2.0f);
        eVar.l(8.99f);
        eVar.f(22.0f, 10.99f);
        eVar.c(-0.47f, -4.74f, -4.24f, -8.52f, -8.97f, -8.99f);
        l9.i.b(eVar, 13.03f, 13.01f, 13.03f, 22.0f);
        eVar.c(4.74f, -0.47f, 8.5f, -4.25f, 8.97f, -8.99f);
        eVar.e(-8.97f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20851a = dVarB;
        return dVarB;
    }
}
