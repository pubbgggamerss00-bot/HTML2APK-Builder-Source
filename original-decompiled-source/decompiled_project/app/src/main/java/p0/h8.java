package p0;

import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class h8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20878a;

    public static final w1.d a() {
        w1.d dVar = f20878a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(8.0f, 5.0f));
        arrayList.add(new g.r(14.0f));
        arrayList.add(new g.m(11.0f, -7.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20878a = dVarB;
        return dVarB;
    }
}
