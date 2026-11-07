package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class ub {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21059a;

    public static final w1.d a() {
        w1.d dVar = f21059a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Tv", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(21.0f, 3.0f, 3.0f, 3.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(5.0f);
        eVarA.l(2.0f);
        eVarA.e(8.0f);
        eVarA.l(-2.0f);
        eVarA.e(5.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 1.99f, -0.9f, 1.99f, -2.0f);
        eVarA.f(23.0f, 5.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        l9.i.b(eVarA, 21.0f, 17.0f, 3.0f, 17.0f);
        b6.a.c(eVarA, 3.0f, 5.0f, 18.0f, 12.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21059a = dVarB;
        return dVarB;
    }
}
