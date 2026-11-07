package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class mc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20951a;

    public static final w1.d a() {
        w1.d dVar = f20951a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Whatshot", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(13.5f, 0.67f);
        eVarA.j(0.74f, 2.65f, 0.74f, 4.8f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.06f, -1.35f, 3.73f, -3.41f, 3.73f);
        eVarA.c(-2.07f, CropImageView.DEFAULT_ASPECT_RATIO, -3.63f, -1.67f, -3.63f, -3.73f);
        eVarA.g(0.03f, -0.36f);
        eVarA.b(5.21f, 7.51f, 4.0f, 10.62f, 4.0f, 14.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        eVarA.j(8.0f, -3.58f, 8.0f, -8.0f);
        eVarA.b(20.0f, 8.61f, 17.41f, 3.8f, 13.5f, 0.67f);
        eVarA.a();
        eVarA.h(11.71f, 19.0f);
        eVarA.c(-1.78f, CropImageView.DEFAULT_ASPECT_RATIO, -3.22f, -1.4f, -3.22f, -3.14f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.62f, 1.05f, -2.76f, 2.81f, -3.12f);
        eVarA.c(1.77f, -0.36f, 3.6f, -1.21f, 4.62f, -2.58f);
        eVarA.c(0.39f, 1.29f, 0.59f, 2.65f, 0.59f, 4.04f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.65f, -2.15f, 4.8f, -4.8f, 4.8f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20951a = dVarB;
        return dVarB;
    }
}
