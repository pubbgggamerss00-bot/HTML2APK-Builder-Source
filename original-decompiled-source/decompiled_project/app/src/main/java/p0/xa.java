package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class xa {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21097a;

    public static final w1.d a() {
        w1.d dVar = f21097a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.StickyNote2", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.0f, 3.0f);
        eVar.d(4.99f);
        eVar.b(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        eVar.g(0.01f, 14.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        eVar.e(10.0f);
        eVar.g(6.0f, -6.0f);
        eVar.k(5.0f);
        eVar.b(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        com.google.android.recaptcha.internal.e.c(eVar, 7.0f, 8.0f, 10.0f, 2.0f);
        eVar.d(7.0f);
        eVar.k(8.0f);
        eVar.a();
        eVar.h(12.0f, 14.0f);
        eVar.d(7.0f);
        eVar.l(-2.0f);
        eVar.e(5.0f);
        eVar.k(14.0f);
        eVar.a();
        eVar.h(14.0f, 19.5f);
        eVar.k(14.0f);
        eVar.e(5.5f);
        eVar.f(14.0f, 19.5f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21097a = dVarB;
        return dVarB;
    }
}
