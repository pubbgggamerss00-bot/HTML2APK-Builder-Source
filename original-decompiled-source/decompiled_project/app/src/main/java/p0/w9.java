package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class w9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21083a;

    public static final w1.d a() {
        w1.d dVar = f21083a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.SetMeal", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(21.05f, 17.56f, 3.08f, 18.5f);
        eVarA.f(3.0f, 17.0f);
        id.i.b(eVarA, 17.98f, -0.94f, 21.05f, 17.56f);
        eVarA.h(21.0f, 19.48f);
        eVarA.d(3.0f);
        eVarA.l(1.5f);
        b0.a(eVarA, 18.0f, 19.48f, 22.0f, 5.0f);
        eVarA.l(7.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        eVarA.d(4.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, -0.9f, -2.0f, -2.0f);
        eVarA.k(5.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        eVarA.e(16.0f);
        eVarA.b(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f);
        eVarA.a();
        eVarA.h(20.0f, 6.0f);
        eVarA.c(-1.68f, CropImageView.DEFAULT_ASPECT_RATIO, -3.04f, 0.98f, -3.21f, 2.23f);
        eVarA.b(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f);
        eVarA.c(-4.67f, CropImageView.DEFAULT_ASPECT_RATIO, -6.75f, 3.0f, -6.75f, 3.0f);
        eVarA.j(2.08f, 3.0f, 6.75f, 3.0f);
        eVarA.c(3.81f, CropImageView.DEFAULT_ASPECT_RATIO, 5.9f, -2.0f, 6.54f, -2.73f);
        eVarA.b(16.96f, 10.02f, 18.32f, 11.0f, 20.0f, 11.0f);
        eVarA.k(6.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21083a = dVarB;
        return dVarB;
    }
}
