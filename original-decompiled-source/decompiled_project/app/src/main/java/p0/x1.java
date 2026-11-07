package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21088a;

    public static final w1.d a() {
        w1.d dVar = f21088a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Coffee", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(18.5f, 3.0f);
        eVar.d(6.0f);
        eVar.b(4.9f, 3.0f, 4.0f, 3.9f, 4.0f, 5.0f);
        eVar.l(5.71f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.83f, 2.95f, 7.18f, 6.78f, 7.29f);
        eVar.c(3.96f, 0.12f, 7.22f, -3.06f, 7.22f, -7.0f);
        eVar.l(-1.0f);
        eVar.e(0.5f);
        eVar.c(1.93f, CropImageView.DEFAULT_ASPECT_RATIO, 3.5f, -1.57f, 3.5f, -3.5f);
        eVar.i(20.43f, 3.0f, 18.5f, 3.0f);
        eVar.a();
        eVar.h(16.0f, 5.0f);
        eVar.l(3.0f);
        eVar.d(6.0f);
        eVar.k(5.0f);
        eVar.d(16.0f);
        eVar.a();
        eVar.h(18.5f, 8.0f);
        eVar.d(18.0f);
        eVar.k(5.0f);
        eVar.e(0.5f);
        eVar.b(19.33f, 5.0f, 20.0f, 5.67f, 20.0f, 6.5f);
        eVar.i(19.33f, 8.0f, 18.5f, 8.0f);
        com.google.android.recaptcha.internal.e.c(eVar, 4.0f, 19.0f, 16.0f, 2.0f);
        eVar.d(4.0f);
        eVar.k(19.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21088a = dVarB;
        return dVarB;
    }
}
