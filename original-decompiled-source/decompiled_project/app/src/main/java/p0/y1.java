package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class y1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21101a;

    public static final w1.d a() {
        w1.d dVar = f21101a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Collections", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(22.0f, 16.0f, 22.0f, 4.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVarA.f(8.0f, 2.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(12.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        l9.y.a(eVarA, 11.0f, 12.0f, 2.03f, 2.71f);
        eVarA.f(16.0f, 11.0f);
        eVarA.g(4.0f, 5.0f);
        eVarA.f(8.0f, 16.0f);
        eVarA.g(3.0f, -4.0f);
        eVarA.a();
        eVarA.h(2.0f, 6.0f);
        eVarA.l(14.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(14.0f);
        eVarA.l(-2.0f);
        eVarA.f(4.0f, 20.0f);
        f0.a(eVarA, 4.0f, 6.0f, 2.0f, 6.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21101a = dVarB;
        return dVarB;
    }
}
