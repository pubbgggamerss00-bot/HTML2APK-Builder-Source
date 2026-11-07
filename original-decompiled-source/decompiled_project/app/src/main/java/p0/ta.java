package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class ta {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21045a;

    public static final w1.d a() {
        w1.d dVar = f21045a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SportsTennis", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(19.52f, 2.49f);
        eVarA.c(-2.34f, -2.34f, -6.62f, -1.87f, -9.55f, 1.06f);
        eVarA.c(-1.6f, 1.6f, -2.52f, 3.87f, -2.54f, 5.46f);
        eVarA.c(-0.02f, 1.58f, 0.26f, 3.89f, -1.35f, 5.5f);
        eVarA.g(-4.24f, 4.24f);
        eVarA.g(1.42f, 1.42f);
        eVarA.g(4.24f, -4.24f);
        eVarA.c(1.61f, -1.61f, 3.92f, -1.33f, 5.5f, -1.35f);
        eVarA.j(3.86f, -0.94f, 5.46f, -2.54f);
        eVarA.b(21.38f, 9.11f, 21.86f, 4.83f, 19.52f, 2.49f);
        eVarA.a();
        eVarA.h(10.32f, 11.68f);
        eVarA.c(-1.53f, -1.53f, -1.05f, -4.61f, 1.06f, -6.72f);
        eVarA.j(5.18f, -2.59f, 6.72f, -1.06f);
        eVarA.c(1.53f, 1.53f, 1.05f, 4.61f, -1.06f, 6.72f);
        eVarA.i(11.86f, 13.21f, 10.32f, 11.68f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA2 = o0.d.a(18.0f, 17.0f);
        eVarA2.c(0.53f, CropImageView.DEFAULT_ASPECT_RATIO, 1.04f, 0.21f, 1.41f, 0.59f);
        eVarA2.c(0.78f, 0.78f, 0.78f, 2.05f, CropImageView.DEFAULT_ASPECT_RATIO, 2.83f);
        eVarA2.b(19.04f, 20.79f, 18.53f, 21.0f, 18.0f, 21.0f);
        eVarA2.j(-1.04f, -0.21f, -1.41f, -0.59f);
        eVarA2.c(-0.78f, -0.78f, -0.78f, -2.05f, CropImageView.DEFAULT_ASPECT_RATIO, -2.83f);
        eVarA2.b(16.96f, 17.21f, 17.47f, 17.0f, 18.0f, 17.0f);
        eVarA2.h(18.0f, 15.0f);
        eVarA2.c(-1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -2.05f, 0.39f, -2.83f, 1.17f);
        eVarA2.c(-1.56f, 1.56f, -1.56f, 4.09f, CropImageView.DEFAULT_ASPECT_RATIO, 5.66f);
        eVarA2.b(15.95f, 22.61f, 16.98f, 23.0f, 18.0f, 23.0f);
        eVarA2.j(2.05f, -0.39f, 2.83f, -1.17f);
        eVarA2.c(1.56f, -1.56f, 1.56f, -4.09f, CropImageView.DEFAULT_ASPECT_RATIO, -5.66f);
        eVarA2.b(20.05f, 15.39f, 19.02f, 15.0f, 18.0f, 15.0f);
        eVarA2.f(18.0f, 15.0f);
        eVarA2.a();
        d.a.a(aVar, eVarA2.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f21045a = dVarB;
        return dVarB;
    }
}
