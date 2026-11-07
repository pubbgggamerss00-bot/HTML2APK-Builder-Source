package p0;

import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21026a;

    public static final w1.d a() {
        w1.d dVar = f21026a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Gavel", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(5.25f, 8.069f));
        arrayList.add(new g.m(2.83f, -2.827f));
        arrayList.add(new g.m(14.134f, 14.15f));
        arrayList.add(new g.m(-2.83f, 2.827f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(9.486f, 3.827f));
        arrayList2.add(new g.m(2.828f, -2.829f));
        arrayList2.add(new g.m(5.658f, 5.656f));
        arrayList2.add(new g.m(-2.828f, 2.829f));
        arrayList2.add(bVar);
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        ArrayList arrayList3 = new ArrayList(32);
        arrayList3.add(new g.f(0.999f, 12.315f));
        arrayList3.add(new g.m(2.828f, -2.828f));
        arrayList3.add(new g.m(5.657f, 5.657f));
        arrayList3.add(new g.m(-2.828f, 2.828f));
        arrayList3.add(bVar);
        d.a.a(aVar, arrayList3, 0, i2Var3);
        q1.i2 i2Var4 = new q1.i2(j10);
        ArrayList arrayList4 = new ArrayList(32);
        arrayList4.add(new g.f(1.0f, 21.0f));
        arrayList4.add(new g.l(12.0f));
        arrayList4.add(new g.r(2.0f));
        arrayList4.add(new g.l(-12.0f));
        arrayList4.add(bVar);
        d.a.a(aVar, arrayList4, 0, i2Var4);
        w1.d dVarB = aVar.b();
        f21026a = dVarB;
        return dVarB;
    }
}
