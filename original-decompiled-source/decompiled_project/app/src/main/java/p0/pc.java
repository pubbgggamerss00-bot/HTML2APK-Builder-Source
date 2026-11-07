package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class pc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20992a;

    public static final w1.d a() {
        w1.d dVar = f20992a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.WineBar", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(6.0f, 3.0f, CropImageView.DEFAULT_ASPECT_RATIO, 6.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.97f, 2.16f, 5.43f, 5.0f, 5.91f);
        eVarA.k(19.0f);
        eVarA.d(8.0f);
        eVarA.l(2.0f);
        eVarA.e(8.0f);
        eVarA.l(-2.0f);
        eVarA.e(-3.0f);
        eVarA.l(-4.09f);
        eVarA.c(2.84f, -0.48f, 5.0f, -2.94f, 5.0f, -5.91f);
        eVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, -6.0f);
        eVarA.d(6.0f);
        eVarA.a();
        eVarA.h(16.0f, 8.0f);
        eVarA.d(8.0f);
        eVarA.g(CropImageView.DEFAULT_ASPECT_RATIO, -3.0f);
        eVarA.e(8.0f);
        eVarA.b(16.0f, 5.0f, 16.0f, 8.0f, 16.0f, 8.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20992a = dVarB;
        return dVarB;
    }
}
