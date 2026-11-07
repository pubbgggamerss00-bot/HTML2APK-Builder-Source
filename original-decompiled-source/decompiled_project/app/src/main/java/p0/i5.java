package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20889a;

    public static final w1.d a() {
        w1.d dVar = f20889a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.History", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(13.0f, 3.0f);
        eVarA.c(-4.97f, CropImageView.DEFAULT_ASPECT_RATIO, -9.0f, 4.03f, -9.0f, 9.0f);
        eVarA.f(1.0f, 12.0f);
        eVarA.g(3.89f, 3.89f);
        eVarA.g(0.07f, 0.14f);
        eVarA.f(9.0f, 12.0f);
        eVarA.f(6.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.87f, 3.13f, -7.0f, 7.0f, -7.0f);
        eVarA.j(7.0f, 3.13f, 7.0f, 7.0f);
        eVarA.j(-3.13f, 7.0f, -7.0f, 7.0f);
        eVarA.c(-1.93f, CropImageView.DEFAULT_ASPECT_RATIO, -3.68f, -0.79f, -4.94f, -2.06f);
        eVarA.g(-1.42f, 1.42f);
        eVarA.b(8.27f, 19.99f, 10.51f, 21.0f, 13.0f, 21.0f);
        eVarA.c(4.97f, CropImageView.DEFAULT_ASPECT_RATIO, 9.0f, -4.03f, 9.0f, -9.0f);
        eVarA.j(-4.03f, -9.0f, -9.0f, -9.0f);
        eVarA.a();
        eVarA.h(12.0f, 8.0f);
        eVarA.l(5.0f);
        eVarA.g(4.28f, 2.54f);
        eVarA.g(0.72f, -1.21f);
        eVarA.g(-3.5f, -2.08f);
        f0.a(eVarA, 13.5f, 8.0f, 12.0f, 8.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20889a = dVarB;
        return dVarB;
    }
}
