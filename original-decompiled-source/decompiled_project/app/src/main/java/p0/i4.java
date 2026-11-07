package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class i4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20888a;

    public static final w1.d a() {
        w1.d dVar = f20888a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Flight", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(21.0f, 16.0f);
        eVar.l(-2.0f);
        eVar.g(-8.0f, -5.0f);
        eVar.k(3.5f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        eVar.i(10.0f, 2.67f, 10.0f, 3.5f);
        eVar.k(9.0f);
        eVar.g(-8.0f, 5.0f);
        eVar.l(2.0f);
        eVar.g(8.0f, -2.5f);
        eVar.k(19.0f);
        eVar.g(-2.0f, 1.5f);
        eVar.k(22.0f);
        eVar.g(3.5f, -1.0f);
        eVar.g(3.5f, 1.0f);
        eVar.l(-1.5f);
        eVar.f(13.0f, 19.0f);
        eVar.l(-5.5f);
        eVar.g(8.0f, 2.5f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20888a = dVarB;
        return dVarB;
    }
}
