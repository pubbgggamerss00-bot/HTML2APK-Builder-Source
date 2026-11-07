package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20871a;

    public static final w1.d a() {
        w1.d dVar = f20871a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Celebration", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(2.0f, 22.0f));
        arrayList.add(new g.m(14.0f, -5.0f));
        arrayList.add(new g.m(-9.0f, -9.0f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = n0.b.a(14.53f, 12.53f, 5.59f, -5.59f);
        eVarA.c(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(0.59f, 0.59f);
        eVarA.g(1.06f, -1.06f);
        eVarA.g(-0.59f, -0.59f);
        eVarA.c(-1.07f, -1.07f, -2.82f, -1.07f, -3.89f, CropImageView.DEFAULT_ASPECT_RATIO);
        id.i.b(eVarA, -5.59f, 5.59f, 14.53f, 12.53f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        w1.e eVarA2 = m.a(10.06f, 6.88f, 9.47f, 7.47f);
        eVarA2.g(1.06f, 1.06f);
        eVarA2.g(0.59f, -0.59f);
        eVarA2.c(1.07f, -1.07f, 1.07f, -2.82f, CropImageView.DEFAULT_ASPECT_RATIO, -3.89f);
        eVarA2.g(-0.59f, -0.59f);
        eVarA2.f(9.47f, 4.53f);
        eVarA2.g(0.59f, 0.59f);
        eVarA2.b(10.54f, 5.6f, 10.54f, 6.4f, 10.06f, 6.88f);
        eVarA2.a();
        d.a.a(aVar, eVarA2.f31100a, 0, i2Var3);
        q1.i2 i2Var4 = new q1.i2(j10);
        w1.e eVarA3 = n0.b.a(17.06f, 11.88f, -1.59f, 1.59f);
        eVarA3.g(1.06f, 1.06f);
        eVarA3.g(1.59f, -1.59f);
        eVarA3.c(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA3.g(1.61f, 1.61f);
        eVarA3.g(1.06f, -1.06f);
        eVarA3.g(-1.61f, -1.61f);
        eVarA3.b(19.87f, 10.81f, 18.13f, 10.81f, 17.06f, 11.88f);
        eVarA3.a();
        d.a.a(aVar, eVarA3.f31100a, 0, i2Var4);
        q1.i2 i2Var5 = new q1.i2(j10);
        w1.e eVarA4 = n0.b.a(15.06f, 5.88f, -3.59f, 3.59f);
        eVarA4.g(1.06f, 1.06f);
        eVarA4.g(3.59f, -3.59f);
        eVarA4.c(1.07f, -1.07f, 1.07f, -2.82f, CropImageView.DEFAULT_ASPECT_RATIO, -3.89f);
        eVarA4.g(-1.59f, -1.59f);
        eVarA4.g(-1.06f, 1.06f);
        eVarA4.g(1.59f, 1.59f);
        eVarA4.b(15.54f, 4.6f, 15.54f, 5.4f, 15.06f, 5.88f);
        eVarA4.a();
        d.a.a(aVar, eVarA4.f31100a, 0, i2Var5);
        w1.d dVarB = aVar.b();
        f20871a = dVarB;
        return dVarB;
    }
}
