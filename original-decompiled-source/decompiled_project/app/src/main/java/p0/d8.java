package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class d8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20824a;

    public static final w1.d a() {
        w1.d dVar = f20824a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Piano", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.0f, 3.0f);
        eVar.d(5.0f);
        eVar.b(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        eVar.l(14.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(14.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(5.0f);
        eVar.b(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        eVar.a();
        eVar.h(14.0f, 14.5f);
        eVar.e(0.25f);
        eVar.k(19.0f);
        eVar.e(-4.5f);
        eVar.l(-4.5f);
        eVar.d(10.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar.k(5.0f);
        eVar.e(2.0f);
        eVar.l(8.5f);
        eVar.b(13.0f, 14.05f, 13.45f, 14.5f, 14.0f, 14.5f);
        com.google.android.recaptcha.internal.e.c(eVar, 5.0f, 5.0f, 2.0f, 8.5f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVar.e(0.25f);
        eVar.k(19.0f);
        eVar.d(5.0f);
        eVar.k(5.0f);
        eVar.a();
        n.a(eVar, 19.0f, 19.0f, -3.25f, -4.5f);
        eVar.d(16.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar.k(5.0f);
        eVar.e(2.0f);
        eVar.k(19.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20824a = dVarB;
        return dVarB;
    }
}
