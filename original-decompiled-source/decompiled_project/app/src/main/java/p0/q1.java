package p0;

import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20995a;

    public static final w1.d a() {
        w1.d dVar = f20995a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Circle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.0f, 2.0f));
        arrayList.add(new g.c(6.47f, 2.0f, 2.0f, 6.47f, 2.0f, 12.0f));
        arrayList.add(new g.p(4.47f, 10.0f, 10.0f, 10.0f));
        arrayList.add(new g.p(10.0f, -4.47f, 10.0f, -10.0f));
        arrayList.add(new g.h(17.53f, 2.0f, 12.0f, 2.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20995a = dVarB;
        return dVarB;
    }
}
