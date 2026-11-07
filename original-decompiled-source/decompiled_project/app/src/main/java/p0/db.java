package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20827a;

    public static final w1.d a() {
        w1.d dVar = f20827a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Terminal", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 4.0f);
        eVar.d(4.0f);
        eVar.b(2.89f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        eVar.l(12.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVar.e(16.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(6.0f);
        eVar.b(22.0f, 4.9f, 21.11f, 4.0f, 20.0f, 4.0f);
        eVar.a();
        eVar.h(20.0f, 18.0f);
        eVar.d(4.0f);
        eVar.k(8.0f);
        b0.a(eVar, 16.0f, 18.0f, 18.0f, 17.0f);
        eVar.e(-6.0f);
        eVar.l(-2.0f);
        eVar.e(6.0f);
        eVar.k(17.0f);
        eVar.a();
        eVar.h(7.5f, 17.0f);
        eVar.g(-1.41f, -1.41f);
        eVar.f(8.67f, 13.0f);
        eVar.g(-2.59f, -2.59f);
        eVar.f(7.5f, 9.0f);
        id.i.b(eVar, 4.0f, 4.0f, 7.5f, 17.0f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20827a = dVarB;
        return dVarB;
    }
}
