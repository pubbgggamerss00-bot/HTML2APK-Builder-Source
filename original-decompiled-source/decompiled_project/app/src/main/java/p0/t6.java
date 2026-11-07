package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21041a;

    public static final w1.d a() {
        w1.d dVar = f21041a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Lock", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(18.0f, 8.0f);
        eVar.e(-1.0f);
        eVar.f(17.0f, 6.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        eVar.i(7.0f, 3.24f, 7.0f, 6.0f);
        eVar.l(2.0f);
        eVar.f(6.0f, 8.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVar.l(10.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(12.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.f(20.0f, 10.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVar.a();
        eVar.h(12.0f, 17.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, -0.9f, -2.0f, -2.0f);
        eVar.j(0.9f, -2.0f, 2.0f, -2.0f);
        eVar.j(2.0f, 0.9f, 2.0f, 2.0f);
        eVar.j(-0.9f, 2.0f, -2.0f, 2.0f);
        l9.i.b(eVar, 15.1f, 8.0f, 8.9f, 8.0f);
        eVar.f(8.9f, 6.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.71f, 1.39f, -3.1f, 3.1f, -3.1f);
        eVar.c(1.71f, CropImageView.DEFAULT_ASPECT_RATIO, 3.1f, 1.39f, 3.1f, 3.1f);
        eVar.l(2.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21041a = dVarB;
        return dVarB;
    }
}
