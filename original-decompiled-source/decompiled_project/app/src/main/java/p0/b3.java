package p0;

import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20792a;

    public static final w1.d a() {
        w1.d dVar = f20792a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Eco", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(6.05f, 8.05f));
        arrayList.add(new g.k(-2.73f, 2.73f, -2.73f, 7.15f, -0.02f, 9.88f));
        arrayList.add(new g.k(1.47f, -3.4f, 4.09f, -6.24f, 7.36f, -7.93f));
        arrayList.add(new g.k(-2.77f, 2.34f, -4.71f, 5.61f, -5.39f, 9.32f));
        arrayList.add(new g.k(2.6f, 1.23f, 5.8f, 0.78f, 7.95f, -1.37f));
        arrayList.add(new g.c(19.43f, 14.47f, 20.0f, 4.0f, 20.0f, 4.0f));
        arrayList.add(new g.h(9.53f, 4.57f, 6.05f, 8.05f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20792a = dVarB;
        return dVarB;
    }
}
