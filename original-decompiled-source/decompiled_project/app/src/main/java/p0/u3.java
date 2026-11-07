package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class u3 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21051a;

    public static final w1.d a() {
        w1.d dVar = f21051a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.FactCheck", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 3.0f);
        eVar.d(4.0f);
        eVar.b(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        eVar.l(14.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(16.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(5.0f);
        eVar.b(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        eVar.a();
        eVar.h(10.0f, 17.0f);
        eVar.d(5.0f);
        eVar.l(-2.0f);
        b0.a(eVar, 5.0f, 17.0f, 10.0f, 13.0f);
        eVar.d(5.0f);
        eVar.l(-2.0f);
        eVar.e(5.0f);
        eVar.k(13.0f);
        eVar.a();
        eVar.h(10.0f, 9.0f);
        eVar.d(5.0f);
        eVar.k(7.0f);
        b0.a(eVar, 5.0f, 9.0f, 14.82f, 15.0f);
        eVar.f(12.0f, 12.16f);
        eVar.g(1.41f, -1.41f);
        eVar.g(1.41f, 1.42f);
        eVar.f(17.99f, 9.0f);
        id.i.b(eVar, 1.42f, 1.42f, 14.82f, 15.0f);
        d.a.a(aVar, eVar.f31100a, 1, i2Var);
        w1.d dVarB = aVar.b();
        f21051a = dVarB;
        return dVarB;
    }
}
