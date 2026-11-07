package p0;

import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class na {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20962a;

    public static final w1.d a() {
        w1.d dVar = f20962a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SportsFootball", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(3.02f, 15.62f));
        arrayList.add(new g.k(-0.08f, 2.42f, 0.32f, 4.34f, 0.67f, 4.69f));
        arrayList.add(new g.p(2.28f, 0.76f, 4.69f, 0.67f));
        arrayList.add(new g.e(3.02f, 15.62f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(13.08f, 3.28f);
        eVarA.b(10.75f, 3.7f, 8.29f, 4.62f, 6.46f, 6.46f);
        eVarA.j(-2.76f, 4.29f, -3.18f, 6.62f);
        eVarA.g(7.63f, 7.63f);
        eVarA.c(2.34f, -0.41f, 4.79f, -1.34f, 6.62f, -3.18f);
        eVarA.j(2.76f, -4.29f, 3.18f, -6.62f);
        ji.a.b(eVarA, 13.08f, 3.28f, 9.9f, 15.5f);
        eVarA.g(-1.4f, -1.4f);
        eVarA.g(5.6f, -5.6f);
        id.i.b(eVarA, 1.4f, 1.4f, 9.9f, 15.5f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(20.98f, 8.38f));
        arrayList2.add(new g.k(0.08f, -2.42f, -0.32f, -4.34f, -0.67f, -4.69f));
        arrayList2.add(new g.p(-2.28f, -0.76f, -4.69f, -0.67f));
        arrayList2.add(new g.e(20.98f, 8.38f));
        arrayList2.add(bVar);
        d.a.a(aVar, arrayList2, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f20962a = dVarB;
        return dVarB;
    }
}
