package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20794a;

    public static final w1.d a() {
        w1.d dVar = f20794a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Handyman", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(21.67f, 18.17f);
        eVar.g(-5.3f, -5.3f);
        eVar.e(-0.99f);
        eVar.g(-2.54f, 2.54f);
        eVar.l(0.99f);
        eVar.g(5.3f, 5.3f);
        eVar.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.g(2.12f, -2.12f);
        eVar.b(22.06f, 19.2f, 22.06f, 18.56f, 21.67f, 18.17f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA = n0.b.a(17.34f, 10.19f, 1.41f, -1.41f);
        eVarA.g(2.12f, 2.12f);
        eVarA.c(1.17f, -1.17f, 1.17f, -3.07f, CropImageView.DEFAULT_ASPECT_RATIO, -4.24f);
        eVarA.g(-3.54f, -3.54f);
        eVarA.g(-1.41f, 1.41f);
        eVarA.k(1.71f);
        eVarA.f(15.22f, 1.0f);
        eVarA.g(-3.54f, 3.54f);
        eVarA.g(0.71f, 0.71f);
        eVarA.e(2.83f);
        eVarA.g(-1.41f, 1.41f);
        eVarA.g(1.06f, 1.06f);
        eVarA.g(-2.89f, 2.89f);
        eVarA.f(7.85f, 6.48f);
        eVarA.k(5.06f);
        eVarA.f(4.83f, 2.04f);
        eVarA.f(2.0f, 4.87f);
        eVarA.g(3.03f, 3.03f);
        eVarA.e(1.41f);
        eVarA.g(4.13f, 4.13f);
        eVarA.g(-0.85f, 0.85f);
        eVarA.d(7.6f);
        eVarA.g(-5.3f, 5.3f);
        eVarA.c(-0.39f, 0.39f, -0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        eVarA.g(2.12f, 2.12f);
        eVarA.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(5.3f, -5.3f);
        eVarA.l(-2.12f);
        id.i.b(eVarA, 5.15f, -5.15f, 17.34f, 10.19f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20794a = dVarB;
        return dVarB;
    }
}
