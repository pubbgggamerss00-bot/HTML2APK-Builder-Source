package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class t3 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21038a;

    public static final w1.d a() {
        w1.d dVar = f21038a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Face", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(9.0f, 11.75f);
        eVarA.c(-0.69f, CropImageView.DEFAULT_ASPECT_RATIO, -1.25f, 0.56f, -1.25f, 1.25f);
        eVarA.j(0.56f, 1.25f, 1.25f, 1.25f);
        eVarA.j(1.25f, -0.56f, 1.25f, -1.25f);
        eVarA.j(-0.56f, -1.25f, -1.25f, -1.25f);
        eVarA.a();
        eVarA.h(15.0f, 11.75f);
        eVarA.c(-0.69f, CropImageView.DEFAULT_ASPECT_RATIO, -1.25f, 0.56f, -1.25f, 1.25f);
        eVarA.j(0.56f, 1.25f, 1.25f, 1.25f);
        eVarA.j(1.25f, -0.56f, 1.25f, -1.25f);
        eVarA.j(-0.56f, -1.25f, -1.25f, -1.25f);
        eVarA.a();
        eVarA.h(12.0f, 2.0f);
        eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
        eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
        eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
        eVarA.a();
        eVarA.h(12.0f, 20.0f);
        eVarA.c(-4.41f, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, -3.59f, -8.0f, -8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.29f, 0.02f, -0.58f, 0.05f, -0.86f);
        eVarA.c(2.36f, -1.05f, 4.23f, -2.98f, 5.21f, -5.37f);
        eVarA.b(11.07f, 8.33f, 14.05f, 10.0f, 17.42f, 10.0f);
        eVarA.c(0.78f, CropImageView.DEFAULT_ASPECT_RATIO, 1.53f, -0.09f, 2.25f, -0.26f);
        eVarA.c(0.21f, 0.71f, 0.33f, 1.47f, 0.33f, 2.26f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21038a = dVarB;
        return dVarB;
    }
}
