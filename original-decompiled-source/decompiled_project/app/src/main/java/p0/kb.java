package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20923a;

    public static final w1.d a() {
        w1.d dVar = f20923a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.TipsAndUpdates", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(7.0f, 20.0f);
        eVar.e(4.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        eVar.i(7.0f, 21.1f, 7.0f, 20.0f);
        com.google.android.recaptcha.internal.e.c(eVar, 5.0f, 19.0f, 8.0f, -2.0f);
        eVar.d(5.0f);
        eVar.k(19.0f);
        eVar.a();
        eVar.h(16.5f, 9.5f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.82f, -2.66f, 5.86f, -3.77f, 6.5f);
        eVar.d(5.27f);
        eVar.b(4.16f, 15.36f, 1.5f, 13.32f, 1.5f, 9.5f);
        eVar.b(1.5f, 5.36f, 4.86f, 2.0f, 9.0f, 2.0f);
        eVar.i(16.5f, 5.36f, 16.5f, 9.5f);
        l9.i.b(eVar, 21.37f, 7.37f, 20.0f, 8.0f);
        eVar.g(1.37f, 0.63f);
        eVar.f(22.0f, 10.0f);
        eVar.g(0.63f, -1.37f);
        eVar.f(24.0f, 8.0f);
        eVar.g(-1.37f, -0.63f);
        f0.a(eVar, 22.0f, 6.0f, 21.37f, 7.37f);
        eVar.h(19.0f, 6.0f);
        eVar.g(0.94f, -2.06f);
        eVar.f(22.0f, 3.0f);
        eVar.g(-2.06f, -0.94f);
        eVar.f(19.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.g(-0.94f, 2.06f);
        eVar.f(16.0f, 3.0f);
        id.i.b(eVar, 2.06f, 0.94f, 19.0f, 6.0f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20923a = dVarB;
        return dVarB;
    }
}
