package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class p8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20988a;

    public static final w1.d a() {
        w1.d dVar = f20988a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Public", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
        eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
        eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
        eVarA.a();
        eVarA.h(11.0f, 19.93f);
        eVarA.c(-3.95f, -0.49f, -7.0f, -3.85f, -7.0f, -7.93f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.62f, 0.08f, -1.21f, 0.21f, -1.79f);
        eVarA.f(9.0f, 15.0f);
        eVarA.l(1.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.l(1.93f);
        eVarA.a();
        eVarA.h(17.9f, 17.39f);
        eVarA.c(-0.26f, -0.81f, -1.0f, -1.39f, -1.9f, -1.39f);
        eVarA.e(-1.0f);
        eVarA.l(-3.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        id.h.c(eVarA, 8.0f, 12.0f, -2.0f, 2.0f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVarA.f(11.0f, 7.0f);
        eVarA.e(2.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.l(-0.41f);
        eVarA.c(2.93f, 1.19f, 5.0f, 4.06f, 5.0f, 7.41f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.08f, -0.8f, 3.97f, -2.1f, 5.39f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20988a = dVarB;
        return dVarB;
    }
}
