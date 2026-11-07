package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class n5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20957a;

    public static final w1.d a() {
        w1.d dVar = f20957a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Image", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(21.0f, 19.0f);
        eVar.k(5.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVar.d(5.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVar.l(14.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(14.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        l9.y.a(eVar, 8.5f, 13.5f, 2.5f, 3.01f);
        eVar.f(14.5f, 12.0f);
        eVar.g(4.5f, 6.0f);
        eVar.d(5.0f);
        eVar.g(3.5f, -4.5f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20957a = dVarB;
        return dVarB;
    }
}
