package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20786a;

    public static final w1.d a() {
        w1.d dVar = f20786a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Shop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(16.0f, 6.0f, 16.0f, 4.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        eVarA.e(-4.0f);
        eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.89f, -2.0f, 2.0f);
        eVarA.l(2.0f);
        eVarA.f(2.0f, 6.0f);
        eVarA.l(13.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVarA.e(16.0f);
        eVarA.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.89f, 2.0f, -2.0f);
        eVarA.f(22.0f, 6.0f);
        eVarA.e(-6.0f);
        eVarA.a();
        n.a(eVarA, 10.0f, 4.0f, 4.0f, 2.0f);
        eVarA.e(-4.0f);
        eVarA.f(10.0f, 4.0f);
        eVarA.a();
        eVarA.h(9.0f, 18.0f);
        eVarA.f(9.0f, 9.0f);
        id.i.b(eVarA, 7.5f, 4.0f, 9.0f, 18.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20786a = dVarB;
        return dVarB;
    }
}
