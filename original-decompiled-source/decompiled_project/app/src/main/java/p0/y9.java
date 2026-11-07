package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class y9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21109a;

    public static final w1.d a() {
        w1.d dVar = f21109a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Share", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(18.0f, 16.08f);
        eVarA.c(-0.76f, CropImageView.DEFAULT_ASPECT_RATIO, -1.44f, 0.3f, -1.96f, 0.77f);
        eVarA.f(8.91f, 12.7f);
        eVarA.c(0.05f, -0.23f, 0.09f, -0.46f, 0.09f, -0.7f);
        eVarA.j(-0.04f, -0.47f, -0.09f, -0.7f);
        eVarA.g(7.05f, -4.11f);
        eVarA.c(0.54f, 0.5f, 1.25f, 0.81f, 2.04f, 0.81f);
        eVarA.c(1.66f, CropImageView.DEFAULT_ASPECT_RATIO, 3.0f, -1.34f, 3.0f, -3.0f);
        eVarA.j(-1.34f, -3.0f, -3.0f, -3.0f);
        eVarA.j(-3.0f, 1.34f, -3.0f, 3.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.24f, 0.04f, 0.47f, 0.09f, 0.7f);
        eVarA.f(8.04f, 9.81f);
        eVarA.b(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f);
        eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
        eVarA.j(1.34f, 3.0f, 3.0f, 3.0f);
        eVarA.c(0.79f, CropImageView.DEFAULT_ASPECT_RATIO, 1.5f, -0.31f, 2.04f, -0.81f);
        eVarA.g(7.12f, 4.16f);
        eVarA.c(-0.05f, 0.21f, -0.08f, 0.43f, -0.08f, 0.65f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.61f, 1.31f, 2.92f, 2.92f, 2.92f);
        eVarA.c(1.61f, CropImageView.DEFAULT_ASPECT_RATIO, 2.92f, -1.31f, 2.92f, -2.92f);
        eVarA.j(-1.31f, -2.92f, -2.92f, -2.92f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21109a = dVarB;
        return dVarB;
    }
}
