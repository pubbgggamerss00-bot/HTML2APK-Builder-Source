package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class v7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21068a;

    public static final w1.d a() {
        w1.d dVar = f21068a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Payments", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(19.0f, 14.0f, 19.0f, 6.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVarA.f(3.0f, 4.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(14.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.a();
        eVarA.h(10.0f, 13.0f);
        eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, -1.34f, -3.0f, -3.0f);
        eVarA.j(1.34f, -3.0f, 3.0f, -3.0f);
        eVarA.j(3.0f, 1.34f, 3.0f, 3.0f);
        eVarA.j(-1.34f, 3.0f, -3.0f, 3.0f);
        eVarA.a();
        eVarA.h(23.0f, 7.0f);
        eVarA.l(11.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        id.h.c(eVarA, 4.0f, 20.0f, -2.0f, 17.0f);
        eVarA.f(21.0f, 7.0f);
        eVarA.e(2.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21068a = dVarB;
        return dVarB;
    }
}
