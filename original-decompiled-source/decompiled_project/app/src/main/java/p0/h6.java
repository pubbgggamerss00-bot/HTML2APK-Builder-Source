package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class h6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20876a;

    public static final w1.d a() {
        w1.d dVar = f20876a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LiveTv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(21.0f, 6.0f);
        eVar.e(-7.59f);
        eVar.g(3.29f, -3.29f);
        eVar.f(16.0f, 2.0f);
        eVar.g(-4.0f, 4.0f);
        eVar.g(-4.0f, -4.0f);
        eVar.g(-0.71f, 0.71f);
        eVar.f(10.59f, 6.0f);
        eVar.f(3.0f, 6.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.89f, -2.0f, 2.0f);
        eVar.l(12.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(18.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.f(23.0f, 8.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
        l9.i.b(eVar, 21.0f, 20.0f, 3.0f, 20.0f);
        b6.a.c(eVar, 3.0f, 8.0f, 18.0f, 12.0f);
        eVar.h(9.0f, 10.0f);
        eVar.l(8.0f);
        eVar.g(7.0f, -4.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20876a = dVarB;
        return dVarB;
    }
}
