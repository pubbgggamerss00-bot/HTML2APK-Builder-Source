package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20859a;

    public static final w1.d a() {
        w1.d dVar = f20859a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.CreditCard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(20.0f, 4.0f, 4.0f, 4.0f);
        eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.89f, -1.99f, 2.0f);
        eVarA.f(2.0f, 18.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVarA.e(16.0f);
        eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.89f, 2.0f, -2.0f);
        eVarA.f(22.0f, 6.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        l9.i.b(eVarA, 20.0f, 18.0f, 4.0f, 18.0f);
        eVarA.l(-6.0f);
        eVarA.e(16.0f);
        eVarA.l(6.0f);
        eVarA.a();
        eVarA.h(20.0f, 8.0f);
        eVarA.f(4.0f, 8.0f);
        b6.a.c(eVarA, 4.0f, 6.0f, 16.0f, 2.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20859a = dVarB;
        return dVarB;
    }
}
