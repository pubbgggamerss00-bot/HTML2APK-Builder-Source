package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class y8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21108a;

    public static final w1.d a() {
        w1.d dVar = f21108a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Radio", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(3.24f, 6.15f);
        eVarA.b(2.51f, 6.43f, 2.0f, 7.17f, 2.0f, 8.0f);
        eVarA.l(12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVarA.e(16.0f);
        eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.f(22.0f, 8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        eVarA.f(8.3f, 6.0f);
        eVarA.g(8.26f, -3.34f);
        f0.a(eVarA, 15.88f, 1.0f, 3.24f, 6.15f);
        eVarA.h(7.0f, 20.0f);
        eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, -1.34f, -3.0f, -3.0f);
        eVarA.j(1.34f, -3.0f, 3.0f, -3.0f);
        eVarA.j(3.0f, 1.34f, 3.0f, 3.0f);
        eVarA.j(-1.34f, 3.0f, -3.0f, 3.0f);
        com.google.android.recaptcha.internal.e.c(eVarA, 20.0f, 12.0f, -2.0f, -2.0f);
        eVarA.e(-2.0f);
        eVarA.l(2.0f);
        eVarA.f(4.0f, 12.0f);
        b6.a.c(eVarA, 4.0f, 8.0f, 16.0f, 4.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21108a = dVarB;
        return dVarB;
    }
}
