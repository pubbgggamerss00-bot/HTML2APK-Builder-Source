package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23017a;

    public static final w1.d a() {
        w1.d dVar = f23017a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.BookmarkBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = p0.m.a(17.0f, 3.0f, 7.0f, 3.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(16.0f);
        eVarA.g(7.0f, -3.0f);
        eVarA.g(7.0f, 3.0f);
        eVarA.f(19.0f, 5.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        l9.y.a(eVarA, 17.0f, 18.0f, -5.0f, -2.18f);
        eVarA.f(7.0f, 18.0f);
        eVarA.f(7.0f, 6.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        eVarA.e(8.0f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
        eVarA.l(12.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23017a = dVarB;
        return dVarB;
    }
}
