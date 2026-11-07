package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20899a;

    public static final w1.d a() {
        w1.d dVar = f20899a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Chat", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(20.0f, 2.0f, 4.0f, 2.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.9f, -1.99f, 2.0f);
        eVarA.f(2.0f, 22.0f);
        eVarA.g(4.0f, -4.0f);
        eVarA.e(14.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.f(22.0f, 4.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        com.google.android.recaptcha.internal.e.c(eVarA, 6.0f, 9.0f, 12.0f, 2.0f);
        f0.a(eVarA, 6.0f, 11.0f, 6.0f, 9.0f);
        eVarA.h(14.0f, 14.0f);
        id.h.c(eVarA, 6.0f, 14.0f, -2.0f, 8.0f);
        eVarA.l(2.0f);
        eVarA.a();
        eVarA.h(18.0f, 8.0f);
        eVarA.f(6.0f, 8.0f);
        b6.a.c(eVarA, 6.0f, 6.0f, 12.0f, 2.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20899a = dVarB;
        return dVarB;
    }
}
