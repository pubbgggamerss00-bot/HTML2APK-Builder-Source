package p0;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import w1.d;
import w1.g;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20778a;

    public static final w1.d a() {
        w1.d dVar = f20778a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Construction", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new g.f(13.783f, 15.172f));
        arrayList.add(new g.m(2.121f, -2.121f));
        arrayList.add(new g.m(5.996f, 5.996f));
        arrayList.add(new g.m(-2.121f, 2.121f));
        arrayList.add(g.b.f31130c);
        d.a.a(aVar, arrayList, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = o0.d.a(17.5f, 10.0f);
        eVarA.c(1.93f, CropImageView.DEFAULT_ASPECT_RATIO, 3.5f, -1.57f, 3.5f, -3.5f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.58f, -0.16f, -1.12f, -0.41f, -1.6f);
        eVarA.g(-2.7f, 2.7f);
        eVarA.f(16.4f, 6.11f);
        eVarA.g(2.7f, -2.7f);
        eVarA.b(18.62f, 3.16f, 18.08f, 3.0f, 17.5f, 3.0f);
        eVarA.b(15.57f, 3.0f, 14.0f, 4.57f, 14.0f, 6.5f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.41f, 0.08f, 0.8f, 0.21f, 1.16f);
        eVarA.g(-1.85f, 1.85f);
        eVarA.g(-1.78f, -1.78f);
        eVarA.g(0.71f, -0.71f);
        eVarA.f(9.88f, 5.61f);
        eVarA.f(12.0f, 3.49f);
        eVarA.c(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.f(4.22f, 7.03f);
        eVarA.g(1.41f, 1.41f);
        eVarA.d(2.81f);
        eVarA.f(2.1f, 9.15f);
        eVarA.g(3.54f, 3.54f);
        eVarA.g(0.71f, -0.71f);
        eVarA.k(9.15f);
        eVarA.g(1.41f, 1.41f);
        eVarA.g(0.71f, -0.71f);
        eVarA.g(1.78f, 1.78f);
        eVarA.g(-7.41f, 7.41f);
        eVarA.g(2.12f, 2.12f);
        eVarA.f(16.34f, 9.79f);
        eVarA.b(16.7f, 9.92f, 17.09f, 10.0f, 17.5f, 10.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20778a = dVarB;
        return dVarB;
    }
}
