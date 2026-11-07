package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class n6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20958a;

    public static final w1.d a() {
        w1.d dVar = f20958a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LocalOffer", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(21.41f, 11.58f, -9.0f, -9.0f);
        eVarA.b(12.05f, 2.22f, 11.55f, 2.0f, 11.0f, 2.0f);
        eVarA.d(4.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(7.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.22f, 1.05f, 0.59f, 1.42f);
        eVarA.g(9.0f, 9.0f);
        eVarA.c(0.36f, 0.36f, 0.86f, 0.58f, 1.41f, 0.58f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.05f, -0.22f, 1.41f, -0.59f);
        eVarA.g(7.0f, -7.0f);
        eVarA.c(0.37f, -0.36f, 0.59f, -0.86f, 0.59f, -1.41f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.23f, -1.06f, -0.59f, -1.42f);
        eVarA.a();
        eVarA.h(5.5f, 7.0f);
        eVarA.b(4.67f, 7.0f, 4.0f, 6.33f, 4.0f, 5.5f);
        eVarA.i(4.67f, 4.0f, 5.5f, 4.0f);
        eVarA.i(7.0f, 4.67f, 7.0f, 5.5f);
        eVarA.i(6.33f, 7.0f, 5.5f, 7.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20958a = dVarB;
        return dVarB;
    }
}
