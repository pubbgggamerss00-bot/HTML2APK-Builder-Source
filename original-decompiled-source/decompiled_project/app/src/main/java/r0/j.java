package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23025a;

    public static final w1.d a() {
        w1.d dVar = f23025a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.Check", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = p0.m.a(9.0f, 16.17f, 5.53f, 12.7f);
        eVarA.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.c(-0.39f, 0.39f, -0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        eVarA.g(4.18f, 4.18f);
        eVarA.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.f(20.29f, 7.71f);
        eVarA.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
        eVarA.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.f(9.0f, 16.17f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23025a = dVarB;
        return dVarB;
    }
}
