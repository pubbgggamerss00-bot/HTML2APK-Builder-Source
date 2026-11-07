package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class m9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20948a;

    public static final w1.d a() {
        w1.d dVar = f20948a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Schedule", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(11.99f, 2.0f);
        eVarA.b(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.47f, 10.0f, 9.99f, 10.0f);
        eVarA.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        eVarA.i(17.52f, 2.0f, 11.99f, 2.0f);
        eVarA.a();
        eVarA.h(12.0f, 20.0f);
        eVarA.c(-4.42f, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, -3.58f, -8.0f, -8.0f);
        eVarA.j(3.58f, -8.0f, 8.0f, -8.0f);
        eVarA.j(8.0f, 3.58f, 8.0f, 8.0f);
        eVarA.j(-3.58f, 8.0f, -8.0f, 8.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.5f, 7.0f));
        arrayList.add(new g.d(11.0f));
        arrayList.add(new g.r(6.0f));
        arrayList.add(new g.m(5.25f, 3.15f));
        arrayList.add(new g.m(0.75f, -1.23f));
        arrayList.add(new g.m(-4.5f, -2.67f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20948a = dVarB;
        return dVarB;
    }
}
