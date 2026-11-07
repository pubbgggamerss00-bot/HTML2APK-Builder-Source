package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class xb {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21098a;

    public static final w1.d a() {
        w1.d dVar = f21098a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Update", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(21.0f, 10.12f);
        eVar.e(-6.78f);
        eVar.g(2.74f, -2.82f);
        eVar.c(-2.73f, -2.7f, -7.15f, -2.8f, -9.88f, -0.1f);
        eVar.c(-2.73f, 2.71f, -2.73f, 7.08f, CropImageView.DEFAULT_ASPECT_RATIO, 9.79f);
        eVar.j(7.15f, 2.71f, 9.88f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.b(18.32f, 15.65f, 19.0f, 14.08f, 19.0f, 12.1f);
        eVar.e(2.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.98f, -0.88f, 4.55f, -2.64f, 6.29f);
        eVar.c(-3.51f, 3.48f, -9.21f, 3.48f, -12.72f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.c(-3.5f, -3.47f, -3.53f, -9.11f, -0.02f, -12.58f);
        eVar.j(9.14f, -3.47f, 12.65f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.f(21.0f, 3.0f);
        eVar.k(10.12f);
        eVar.a();
        eVar.h(12.5f, 8.0f);
        eVar.l(4.25f);
        eVar.g(3.5f, 2.08f);
        eVar.g(-0.72f, 1.21f);
        eVar.f(11.0f, 13.0f);
        eVar.k(8.0f);
        eVar.d(12.5f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21098a = dVarB;
        return dVarB;
    }
}
