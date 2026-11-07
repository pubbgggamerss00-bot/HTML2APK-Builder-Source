package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21048a;

    public static final w1.d a() {
        w1.d dVar = f21048a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Brush", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(7.0f, 14.0f);
        eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.31f, -1.16f, 2.0f, -2.0f, 2.0f);
        eVarA.c(0.92f, 1.22f, 2.49f, 2.0f, 4.0f, 2.0f);
        eVarA.c(2.21f, CropImageView.DEFAULT_ASPECT_RATIO, 4.0f, -1.79f, 4.0f, -4.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        l9.y.a(eVarA, 20.71f, 4.63f, -1.34f, -1.34f);
        eVarA.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.f(9.0f, 12.25f);
        eVarA.f(11.75f, 15.0f);
        eVarA.g(8.96f, -8.96f);
        eVarA.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21048a = dVarB;
        return dVarB;
    }
}
