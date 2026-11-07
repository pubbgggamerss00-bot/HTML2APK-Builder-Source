package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21093a;

    public static final w1.d a() {
        w1.d dVar = f21093a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Map", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(20.5f, 3.0f, -0.16f, 0.03f);
        eVarA.f(15.0f, 5.1f);
        eVarA.f(9.0f, 3.0f);
        eVarA.f(3.36f, 4.9f);
        eVarA.c(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f);
        eVarA.k(20.5f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        eVarA.g(0.16f, -0.03f);
        eVarA.f(9.0f, 18.9f);
        eVarA.g(6.0f, 2.1f);
        eVarA.g(5.64f, -1.9f);
        eVarA.c(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f);
        eVarA.k(3.5f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        l9.y.a(eVarA, 15.0f, 19.0f, -6.0f, -2.11f);
        eVarA.k(5.0f);
        eVarA.g(6.0f, 2.11f);
        eVarA.k(19.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21093a = dVarB;
        return dVarB;
    }
}
