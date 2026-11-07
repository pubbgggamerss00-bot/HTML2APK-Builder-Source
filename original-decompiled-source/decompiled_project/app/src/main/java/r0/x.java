package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23053a;

    public static final w1.d a() {
        w1.d dVar = f23053a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.ErrorOutline", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 7.0f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
        eVarA.l(4.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        eVarA.j(-1.0f, -0.45f, -1.0f, -1.0f);
        eVarA.f(11.0f, 8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        eVarA.a();
        eVarA.h(11.99f, 2.0f);
        eVarA.b(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.47f, 10.0f, 9.99f, 10.0f);
        eVarA.b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        eVarA.i(17.52f, 2.0f, 11.99f, 2.0f);
        eVarA.a();
        eVarA.h(12.0f, 20.0f);
        eVarA.c(-4.42f, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, -3.58f, -8.0f, -8.0f);
        eVarA.j(3.58f, -8.0f, 8.0f, -8.0f);
        eVarA.j(8.0f, 3.58f, 8.0f, 8.0f);
        eVarA.j(-3.58f, 8.0f, -8.0f, 8.0f);
        com.google.android.recaptcha.internal.e.c(eVarA, 13.0f, 17.0f, -2.0f, -2.0f);
        eVarA.e(2.0f);
        eVarA.l(2.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23053a = dVarB;
        return dVarB;
    }
}
