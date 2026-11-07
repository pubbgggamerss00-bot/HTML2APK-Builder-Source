package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class fa {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20853a;

    public static final w1.d a() {
        w1.d dVar = f20853a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Smartphone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(17.0f, 1.01f, 7.0f, 1.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(18.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(10.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.k(3.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
        eVarA.a();
        eVarA.h(17.0f, 19.0f);
        eVarA.d(7.0f);
        eVarA.k(5.0f);
        eVarA.e(10.0f);
        eVarA.l(14.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20853a = dVarB;
        return dVarB;
    }
}
