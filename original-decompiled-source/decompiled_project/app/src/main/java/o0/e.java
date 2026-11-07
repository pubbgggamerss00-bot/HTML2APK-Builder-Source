package o0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;
import w1.m;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f18843a;

    public static final w1.d a() {
        w1.d dVar = f18843a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("AutoMirrored.Rounded.Redo", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = d.a(18.4f, 10.6f);
        eVarA.b(16.55f, 8.99f, 14.15f, 8.0f, 11.5f, 8.0f);
        eVarA.c(-4.16f, CropImageView.DEFAULT_ASPECT_RATIO, -7.74f, 2.42f, -9.44f, 5.93f);
        eVarA.c(-0.32f, 0.67f, 0.04f, 1.47f, 0.75f, 1.71f);
        eVarA.c(0.59f, 0.2f, 1.23f, -0.08f, 1.5f, -0.64f);
        eVarA.c(1.3f, -2.66f, 4.03f, -4.5f, 7.19f, -4.5f);
        eVarA.c(1.95f, CropImageView.DEFAULT_ASPECT_RATIO, 3.73f, 0.72f, 5.12f, 1.88f);
        eVarA.g(-1.91f, 1.91f);
        eVarA.c(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        eVarA.d(21.0f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVarA.k(9.41f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        eVarA.g(-1.89f, 1.9f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f18843a = dVarB;
        return dVarB;
    }
}
