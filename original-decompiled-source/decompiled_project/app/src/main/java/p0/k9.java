package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class k9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20921a;

    public static final w1.d a() {
        w1.d dVar = f20921a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Savings", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(19.83f, 7.5f, -2.27f, -2.27f);
        eVarA.c(0.07f, -0.42f, 0.18f, -0.81f, 0.32f, -1.15f);
        eVarA.b(17.96f, 3.9f, 18.0f, 3.71f, 18.0f, 3.5f);
        eVarA.b(18.0f, 2.67f, 17.33f, 2.0f, 16.5f, 2.0f);
        eVarA.c(-1.64f, CropImageView.DEFAULT_ASPECT_RATIO, -3.09f, 0.79f, -4.0f, 2.0f);
        eVarA.g(-5.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.b(4.46f, 4.0f, 2.0f, 6.46f, 2.0f, 9.5f);
        eVarA.i(4.5f, 21.0f, 4.5f, 21.0f);
        eVarA.g(5.5f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.l(-2.0f);
        eVarA.e(2.0f);
        eVarA.l(2.0f);
        eVarA.g(5.5f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(1.68f, -5.59f);
        eVarA.f(22.0f, 14.47f);
        eVarA.k(7.5f);
        eVarA.d(19.83f);
        eVarA.a();
        eVarA.h(13.0f, 9.0f);
        eVarA.d(8.0f);
        eVarA.k(7.0f);
        b0.a(eVarA, 5.0f, 9.0f, 16.0f, 11.0f);
        eVarA.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        eVarA.j(1.0f, 0.45f, 1.0f, 1.0f);
        eVarA.b(17.0f, 10.55f, 16.55f, 11.0f, 16.0f, 11.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20921a = dVarB;
        return dVarB;
    }
}
