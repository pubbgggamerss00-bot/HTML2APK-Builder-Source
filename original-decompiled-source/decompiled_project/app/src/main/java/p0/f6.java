package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class f6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20849a;

    public static final w1.d a() {
        w1.d dVar = f20849a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Lightbulb", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(9.0f, 21.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        eVarA.e(4.0f);
        eVarA.c(0.6f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.5f, 1.0f, -1.0f);
        eVarA.l(-1.0f);
        eVarA.f(9.0f, 20.0f);
        eVarA.l(1.0f);
        eVarA.a();
        eVarA.h(12.0f, 2.0f);
        eVarA.b(8.1f, 2.0f, 5.0f, 5.1f, 5.0f, 9.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.4f, 1.2f, 4.5f, 3.0f, 5.7f);
        eVarA.f(8.0f, 17.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, 0.4f, 1.0f, 1.0f, 1.0f);
        eVarA.e(6.0f);
        eVarA.c(0.6f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.5f, 1.0f, -1.0f);
        eVarA.l(-2.3f);
        eVarA.c(1.8f, -1.3f, 3.0f, -3.4f, 3.0f, -5.7f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.9f, -3.1f, -7.0f, -7.0f, -7.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20849a = dVarB;
        return dVarB;
    }
}
