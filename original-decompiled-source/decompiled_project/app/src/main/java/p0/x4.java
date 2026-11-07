package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21091a;

    public static final w1.d a() {
        w1.d dVar = f21091a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Grass", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(12.0f, 20.0f);
        eVar.d(2.0f);
        eVar.l(-2.0f);
        eVar.e(5.75f);
        eVar.g(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.b(7.02f, 15.19f, 4.81f, 12.99f, 2.0f, 12.26f);
        eVar.b(2.64f, 12.1f, 3.31f, 12.0f, 4.0f, 12.0f);
        eVar.b(8.42f, 12.0f, 12.0f, 15.58f, 12.0f, 20.0f);
        eVar.a();
        eVar.h(22.0f, 12.26f);
        eVar.b(21.36f, 12.1f, 20.69f, 12.0f, 20.0f, 12.0f);
        eVar.c(-2.93f, CropImageView.DEFAULT_ASPECT_RATIO, -5.48f, 1.58f, -6.88f, 3.93f);
        eVar.c(0.29f, 0.66f, 0.53f, 1.35f, 0.67f, 2.07f);
        eVar.c(0.13f, 0.65f, 0.2f, 1.32f, 0.2f, 2.0f);
        eVar.e(2.0f);
        eVar.e(6.0f);
        eVar.l(-2.0f);
        eVar.e(-5.75f);
        eVar.b(16.98f, 15.19f, 19.19f, 12.99f, 22.0f, 12.26f);
        eVar.a();
        eVar.h(15.64f, 11.02f);
        eVar.c(0.78f, -2.09f, 2.23f, -3.84f, 4.09f, -5.0f);
        eVar.b(15.44f, 6.16f, 12.0f, 9.67f, 12.0f, 14.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.01f, CropImageView.DEFAULT_ASPECT_RATIO, 0.02f, CropImageView.DEFAULT_ASPECT_RATIO, 0.02f);
        eVar.b(12.95f, 12.75f, 14.2f, 11.72f, 15.64f, 11.02f);
        eVar.a();
        eVar.h(11.42f, 8.85f);
        eVar.b(10.58f, 6.66f, 8.88f, 4.89f, 6.7f, 4.0f);
        eVar.b(8.14f, 5.86f, 9.0f, 8.18f, 9.0f, 10.71f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.21f, -0.03f, 0.41f, -0.04f, 0.61f);
        eVar.c(0.43f, 0.24f, 0.83f, 0.52f, 1.22f, 0.82f);
        eVar.b(10.39f, 10.96f, 10.83f, 9.85f, 11.42f, 8.85f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21091a = dVarB;
        return dVarB;
    }
}
