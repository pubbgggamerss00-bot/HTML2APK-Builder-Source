package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class ka {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20922a;

    public static final w1.d a() {
        w1.d dVar = f20922a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SportsBaseball", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(3.81f, 6.28f));
        arrayList.add(new g.c(2.67f, 7.9f, 2.0f, 9.87f, 2.0f, 12.0f));
        arrayList.add(new g.p(0.67f, 4.1f, 1.81f, 5.72f));
        arrayList.add(new g.c(6.23f, 16.95f, 8.0f, 14.68f, 8.0f, 12.0f));
        arrayList.add(new g.h(6.23f, 7.05f, 3.81f, 6.28f));
        g.b bVar = g.b.f31130c;
        arrayList.add(bVar);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList2 = new ArrayList(32);
        arrayList2.add(new g.f(20.19f, 6.28f));
        arrayList2.add(new g.c(17.77f, 7.05f, 16.0f, 9.32f, 16.0f, 12.0f));
        arrayList2.add(new g.p(1.77f, 4.95f, 4.19f, 5.72f));
        arrayList2.add(new g.c(21.33f, 16.1f, 22.0f, 14.13f, 22.0f, 12.0f));
        arrayList2.add(new g.h(21.33f, 7.9f, 20.19f, 6.28f));
        arrayList2.add(bVar);
        d.a.a(aVar, arrayList2, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(14.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.28f, 1.97f, -6.09f, 4.79f, -7.33f);
        eVarA.b(17.01f, 3.02f, 14.63f, 2.0f, 12.0f, 2.0f);
        eVarA.i(6.99f, 3.02f, 5.21f, 4.67f);
        eVarA.b(8.03f, 5.91f, 10.0f, 8.72f, 10.0f, 12.0f);
        eVarA.j(-1.97f, 6.09f, -4.79f, 7.33f);
        eVarA.b(6.99f, 20.98f, 9.37f, 22.0f, 12.0f, 22.0f);
        eVarA.j(5.01f, -1.02f, 6.79f, -2.67f);
        eVarA.b(15.97f, 18.09f, 14.0f, 15.28f, 14.0f, 12.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f20922a = dVarB;
        return dVarB;
    }
}
