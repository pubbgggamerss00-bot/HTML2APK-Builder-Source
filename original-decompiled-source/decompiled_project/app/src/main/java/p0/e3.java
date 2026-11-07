package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20833a;

    public static final w1.d a() {
        w1.d dVar = f20833a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Egg", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 3.0f);
        eVarA.b(8.5f, 3.0f, 5.0f, 9.33f, 5.0f, 14.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.87f, 3.13f, 7.0f, 7.0f, 7.0f);
        eVarA.j(7.0f, -3.13f, 7.0f, -7.0f);
        eVarA.b(19.0f, 9.33f, 15.5f, 3.0f, 12.0f, 3.0f);
        eVarA.a();
        eVarA.h(13.0f, 18.0f);
        eVarA.c(-3.0f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, -1.99f, -5.0f, -5.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        eVarA.j(1.0f, 0.45f, 1.0f, 1.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.92f, 2.42f, 3.0f, 3.0f, 3.0f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
        eVarA.i(13.55f, 18.0f, 13.0f, 18.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20833a = dVarB;
        return dVarB;
    }
}
