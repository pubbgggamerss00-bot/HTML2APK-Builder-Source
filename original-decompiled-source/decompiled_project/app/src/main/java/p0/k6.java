package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20918a;

    public static final w1.d a() {
        w1.d dVar = f20918a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LocalFireDepartment", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(12.0f, 12.9f));
        arrayList.add(new g.m(-2.13f, 2.09f));
        arrayList.add(new g.c(9.31f, 15.55f, 9.0f, 16.28f, 9.0f, 17.06f));
        arrayList.add(new g.c(9.0f, 18.68f, 10.35f, 20.0f, 12.0f, 20.0f));
        arrayList.add(new g.p(3.0f, -1.32f, 3.0f, -2.94f));
        arrayList.add(new g.k(CropImageView.DEFAULT_ASPECT_RATIO, -0.78f, -0.31f, -1.52f, -0.87f, -2.07f));
        arrayList.add(new g.e(12.0f, 12.9f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = n0.b.a(16.0f, 6.0f, -0.44f, 0.55f);
        eVarA.b(14.38f, 8.02f, 12.0f, 7.19f, 12.0f, 5.3f);
        eVarA.k(2.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, 4.0f, -8.0f, 11.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.92f, 1.56f, 5.47f, 3.89f, 6.86f);
        eVarA.b(7.33f, 19.07f, 7.0f, 18.1f, 7.0f, 17.06f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.32f, 0.52f, -2.56f, 1.47f, -3.5f);
        eVarA.f(12.0f, 10.1f);
        eVarA.g(3.53f, 3.47f);
        eVarA.c(0.95f, 0.93f, 1.47f, 2.17f, 1.47f, 3.5f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.02f, -0.31f, 1.96f, -0.85f, 2.75f);
        eVarA.c(1.89f, -1.15f, 3.29f, -3.06f, 3.71f, -5.3f);
        eVarA.b(20.52f, 10.97f, 18.79f, 7.62f, 16.0f, 6.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20918a = dVarB;
        return dVarB;
    }
}
