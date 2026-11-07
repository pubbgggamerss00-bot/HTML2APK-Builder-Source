package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20814a;

    public static final w1.d a() {
        w1.d dVar = f20814a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.TaskAlt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(22.0f, 5.18f, 10.59f, 16.6f);
        eVarA.g(-4.24f, -4.24f);
        eVarA.g(1.41f, -1.41f);
        eVarA.g(2.83f, 2.83f);
        id.i.b(eVarA, 10.0f, -10.0f, 22.0f, 5.18f);
        eVarA.h(19.79f, 10.22f);
        eVarA.b(19.92f, 10.79f, 20.0f, 11.39f, 20.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        eVarA.j(-8.0f, -3.58f, -8.0f, -8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        eVarA.c(1.58f, CropImageView.DEFAULT_ASPECT_RATIO, 3.04f, 0.46f, 4.28f, 1.25f);
        eVarA.g(1.44f, -1.44f);
        eVarA.b(16.1f, 2.67f, 14.13f, 2.0f, 12.0f, 2.0f);
        eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.19f, -0.22f, -2.33f, -0.6f, -3.39f);
        eVarA.f(19.79f, 10.22f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20814a = dVarB;
        return dVarB;
    }
}
