package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class g9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20866a;

    public static final w1.d a() {
        w1.d dVar = f20866a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.RocketLaunch", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(9.19f, 6.35f);
        eVarA.c(-2.04f, 2.29f, -3.44f, 5.58f, -3.57f, 5.89f);
        eVarA.f(2.0f, 10.69f);
        eVarA.g(4.05f, -4.05f);
        eVarA.c(0.47f, -0.47f, 1.15f, -0.68f, 1.81f, -0.55f);
        f0.a(eVarA, 9.19f, 6.35f, 9.19f, 6.35f);
        eVarA.h(11.17f, 17.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 3.74f, -1.55f, 5.89f, -3.7f);
        eVarA.c(5.4f, -5.4f, 4.5f, -9.62f, 4.21f, -10.57f);
        eVarA.c(-0.95f, -0.3f, -5.17f, -1.19f, -10.57f, 4.21f);
        eVarA.b(8.55f, 9.09f, 7.0f, 12.83f, 7.0f, 12.83f);
        ji.a.b(eVarA, 11.17f, 17.0f, 17.65f, 14.81f);
        eVarA.c(-2.29f, 2.04f, -5.58f, 3.44f, -5.89f, 3.57f);
        eVarA.f(13.31f, 22.0f);
        eVarA.g(4.05f, -4.05f);
        eVarA.c(0.47f, -0.47f, 0.68f, -1.15f, 0.55f, -1.81f);
        f0.a(eVarA, 17.65f, 14.81f, 17.65f, 14.81f);
        eVarA.h(9.0f, 18.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.83f, -0.34f, 1.58f, -0.88f, 2.12f);
        eVarA.b(6.94f, 21.3f, 2.0f, 22.0f, 2.0f, 22.0f);
        eVarA.j(0.7f, -4.94f, 1.88f, -6.12f);
        eVarA.b(4.42f, 15.34f, 5.17f, 15.0f, 6.0f, 15.0f);
        eVarA.b(7.66f, 15.0f, 9.0f, 16.34f, 9.0f, 18.0f);
        eVarA.a();
        eVarA.h(13.0f, 9.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        eVarA.j(2.0f, 0.9f, 2.0f, 2.0f);
        eVarA.j(-0.9f, 2.0f, -2.0f, 2.0f);
        eVarA.i(13.0f, 10.1f, 13.0f, 9.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20866a = dVarB;
        return dVarB;
    }
}
