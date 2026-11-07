package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23050a;

    public static final w1.d a() {
        w1.d dVar = f23050a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.WarningAmber", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = p0.m.a(12.0f, 5.99f, 19.53f, 19.0f);
        eVarA.f(4.47f, 19.0f);
        eVarA.f(12.0f, 5.99f);
        eVarA.h(2.74f, 18.0f);
        eVarA.c(-0.77f, 1.33f, 0.19f, 3.0f, 1.73f, 3.0f);
        eVarA.e(15.06f);
        eVarA.c(1.54f, CropImageView.DEFAULT_ASPECT_RATIO, 2.5f, -1.67f, 1.73f, -3.0f);
        eVarA.f(13.73f, 4.99f);
        eVarA.c(-0.77f, -1.33f, -2.69f, -1.33f, -3.46f, CropImageView.DEFAULT_ASPECT_RATIO);
        ji.a.b(eVarA, 2.74f, 18.0f, 11.0f, 11.0f);
        eVarA.l(2.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVarA.j(1.0f, -0.45f, 1.0f, -1.0f);
        eVarA.l(-2.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        eVarA.j(-1.0f, 0.45f, -1.0f, 1.0f);
        com.google.android.recaptcha.internal.e.c(eVarA, 11.0f, 16.0f, 2.0f, 2.0f);
        eVarA.e(-2.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23050a = dVarB;
        return dVarB;
    }
}
