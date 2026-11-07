package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class y6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21106a;

    public static final w1.d a() {
        w1.d dVar = f21106a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.MedicalServices", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 6.0f);
        eVar.e(-4.0f);
        eVar.k(4.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVar.e(-4.0f);
        eVar.b(8.9f, 2.0f, 8.0f, 2.9f, 8.0f, 4.0f);
        eVar.l(2.0f);
        eVar.d(4.0f);
        eVar.b(2.9f, 6.0f, 2.0f, 6.9f, 2.0f, 8.0f);
        eVar.l(12.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(16.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(8.0f);
        eVar.b(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        com.google.android.recaptcha.internal.e.c(eVar, 10.0f, 4.0f, 4.0f, 2.0f);
        b0.a(eVar, -4.0f, 4.0f, 16.0f, 15.0f);
        eVar.e(-3.0f);
        eVar.l(3.0f);
        eVar.e(-2.0f);
        eVar.l(-3.0f);
        eVar.d(8.0f);
        eVar.l(-2.0f);
        eVar.e(3.0f);
        eVar.l(-3.0f);
        eVar.e(2.0f);
        eVar.l(3.0f);
        eVar.e(3.0f);
        eVar.k(15.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21106a = dVarB;
        return dVarB;
    }
}
