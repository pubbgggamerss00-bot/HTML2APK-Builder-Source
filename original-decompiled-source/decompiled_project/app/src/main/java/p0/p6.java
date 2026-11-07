package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20986a;

    public static final w1.d a() {
        w1.d dVar = f20986a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LocalPizza", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.b(8.43f, 2.0f, 5.23f, 3.54f, 3.01f, 6.0f);
        eVarA.f(12.0f, 22.0f);
        eVarA.g(8.99f, -16.0f);
        eVarA.b(18.78f, 3.55f, 15.57f, 2.0f, 12.0f, 2.0f);
        eVarA.a();
        eVarA.h(7.0f, 7.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        eVarA.j(2.0f, 0.9f, 2.0f, 2.0f);
        eVarA.j(-0.9f, 2.0f, -2.0f, 2.0f);
        eVarA.j(-2.0f, -0.9f, -2.0f, -2.0f);
        eVarA.a();
        eVarA.h(12.0f, 15.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, -0.9f, -2.0f, -2.0f);
        eVarA.j(0.9f, -2.0f, 2.0f, -2.0f);
        eVarA.j(2.0f, 0.9f, 2.0f, 2.0f);
        eVarA.j(-0.9f, 2.0f, -2.0f, 2.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20986a = dVarB;
        return dVarB;
    }
}
