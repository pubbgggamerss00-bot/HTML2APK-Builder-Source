package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23009a;

    public static final w1.d a() {
        w1.d dVar = f23009a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.Android", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = n0.b.a(17.6f, 9.48f, 1.84f, -3.18f);
        eVarA.c(0.16f, -0.31f, 0.04f, -0.69f, -0.26f, -0.85f);
        eVarA.c(-0.29f, -0.15f, -0.65f, -0.06f, -0.83f, 0.22f);
        eVarA.g(-1.88f, 3.24f);
        eVarA.c(-2.86f, -1.21f, -6.08f, -1.21f, -8.94f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.f(5.65f, 5.67f);
        eVarA.c(-0.19f, -0.29f, -0.58f, -0.38f, -0.87f, -0.2f);
        eVarA.b(4.5f, 5.65f, 4.41f, 6.01f, 4.56f, 6.3f);
        eVarA.f(6.4f, 9.48f);
        eVarA.b(3.3f, 11.25f, 1.28f, 14.44f, 1.0f, 18.0f);
        eVarA.e(22.0f);
        eVarA.b(22.72f, 14.44f, 20.7f, 11.25f, 17.6f, 9.48f);
        eVarA.a();
        eVarA.h(7.0f, 15.25f);
        eVarA.c(-0.69f, CropImageView.DEFAULT_ASPECT_RATIO, -1.25f, -0.56f, -1.25f, -1.25f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        eVarA.i(8.25f, 13.31f, 8.25f, 14.0f);
        eVarA.b(8.25f, 14.69f, 7.69f, 15.25f, 7.0f, 15.25f);
        eVarA.a();
        eVarA.h(17.0f, 15.25f);
        eVarA.c(-0.69f, CropImageView.DEFAULT_ASPECT_RATIO, -1.25f, -0.56f, -1.25f, -1.25f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f);
        eVarA.j(1.25f, 0.56f, 1.25f, 1.25f);
        eVarA.b(18.25f, 14.69f, 17.69f, 15.25f, 17.0f, 15.25f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23009a = dVarB;
        return dVarB;
    }
}
