package n0;

import java.util.ArrayList;
import q1.b1;
import q1.i2;
import w1.d;
import w1.g;
import w1.m;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f18293a;

    public static final w1.d a() {
        w1.d dVar = f18293a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("AutoMirrored.Filled.KeyboardArrowRight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(8.59f, 16.59f));
        arrayList.add(new g.e(13.17f, 12.0f));
        arrayList.add(new g.e(8.59f, 7.41f));
        arrayList.add(new g.e(10.0f, 6.0f));
        arrayList.add(new g.m(6.0f, 6.0f));
        arrayList.add(new g.m(-6.0f, 6.0f));
        arrayList.add(new g.m(-1.41f, -1.41f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        w1.d dVarB = aVar.b();
        f18293a = dVarB;
        return dVarB;
    }
}
