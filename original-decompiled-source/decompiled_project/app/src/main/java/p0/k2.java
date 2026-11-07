package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20914a;

    public static final w1.d a() {
        w1.d dVar = f20914a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.DarkMode", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 3.0f);
        eVarA.c(-4.97f, CropImageView.DEFAULT_ASPECT_RATIO, -9.0f, 4.03f, -9.0f, 9.0f);
        eVarA.j(4.03f, 9.0f, 9.0f, 9.0f);
        eVarA.j(9.0f, -4.03f, 9.0f, -9.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.46f, -0.04f, -0.92f, -0.1f, -1.36f);
        eVarA.c(-0.98f, 1.37f, -2.58f, 2.26f, -4.4f, 2.26f);
        eVarA.c(-2.98f, CropImageView.DEFAULT_ASPECT_RATIO, -5.4f, -2.42f, -5.4f, -5.4f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.81f, 0.89f, -3.42f, 2.26f, -4.4f);
        eVarA.b(12.92f, 3.04f, 12.46f, 3.0f, 12.0f, 3.0f);
        eVarA.f(12.0f, 3.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20914a = dVarB;
        return dVarB;
    }
}
