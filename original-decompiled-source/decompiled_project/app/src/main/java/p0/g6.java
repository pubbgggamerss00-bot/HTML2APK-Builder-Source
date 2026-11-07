package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20863a;

    public static final w1.d a() {
        w1.d dVar = f20863a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Link", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(3.9f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        eVarA.e(4.0f);
        eVarA.f(11.0f, 7.0f);
        eVarA.f(7.0f, 7.0f);
        eVarA.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, 2.24f, -5.0f, 5.0f);
        eVarA.j(2.24f, 5.0f, 5.0f, 5.0f);
        eVarA.e(4.0f);
        eVarA.l(-1.9f);
        eVarA.f(7.0f, 15.1f);
        eVarA.c(-1.71f, CropImageView.DEFAULT_ASPECT_RATIO, -3.1f, -1.39f, -3.1f, -3.1f);
        com.google.android.recaptcha.internal.e.c(eVarA, 8.0f, 13.0f, 8.0f, -2.0f);
        eVarA.f(8.0f, 11.0f);
        eVarA.l(2.0f);
        eVarA.a();
        n.a(eVarA, 17.0f, 7.0f, -4.0f, 1.9f);
        eVarA.e(4.0f);
        eVarA.c(1.71f, CropImageView.DEFAULT_ASPECT_RATIO, 3.1f, 1.39f, 3.1f, 3.1f);
        eVarA.j(-1.39f, 3.1f, -3.1f, 3.1f);
        eVarA.e(-4.0f);
        eVarA.f(13.0f, 17.0f);
        eVarA.e(4.0f);
        eVarA.c(2.76f, CropImageView.DEFAULT_ASPECT_RATIO, 5.0f, -2.24f, 5.0f, -5.0f);
        eVarA.j(-2.24f, -5.0f, -5.0f, -5.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20863a = dVarB;
        return dVarB;
    }
}
