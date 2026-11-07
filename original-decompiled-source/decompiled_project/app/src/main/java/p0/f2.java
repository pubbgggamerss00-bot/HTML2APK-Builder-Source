package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class f2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20845a;

    public static final w1.d a() {
        w1.d dVar = f20845a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.CreateNewFolder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 6.0f);
        eVar.e(-8.0f);
        eVar.g(-2.0f, -2.0f);
        eVar.f(4.0f, 4.0f);
        eVar.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.89f, -1.99f, 2.0f);
        eVar.f(2.0f, 18.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVar.e(16.0f);
        eVar.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.89f, 2.0f, -2.0f);
        eVar.f(22.0f, 8.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        com.google.android.recaptcha.internal.e.c(eVar, 19.0f, 14.0f, -3.0f, 3.0f);
        eVar.e(-2.0f);
        eVar.l(-3.0f);
        eVar.e(-3.0f);
        eVar.l(-2.0f);
        eVar.e(3.0f);
        eVar.f(14.0f, 9.0f);
        eVar.e(2.0f);
        eVar.l(3.0f);
        eVar.e(3.0f);
        eVar.l(2.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20845a = dVarB;
        return dVarB;
    }
}
