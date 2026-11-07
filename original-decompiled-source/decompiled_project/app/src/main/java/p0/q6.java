package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class q6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21000a;

    public static final w1.d a() {
        w1.d dVar = f21000a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LocalShipping", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 8.0f);
        eVar.e(-3.0f);
        eVar.f(17.0f, 4.0f);
        eVar.f(3.0f, 4.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVar.l(11.0f);
        eVar.e(2.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        eVar.j(3.0f, -1.34f, 3.0f, -3.0f);
        eVar.e(6.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        eVar.j(3.0f, -1.34f, 3.0f, -3.0f);
        eVar.e(2.0f);
        eVar.l(-5.0f);
        eVar.g(-3.0f, -4.0f);
        eVar.a();
        eVar.h(6.0f, 18.5f);
        eVar.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, -0.67f, -1.5f, -1.5f);
        eVar.j(0.67f, -1.5f, 1.5f, -1.5f);
        eVar.j(1.5f, 0.67f, 1.5f, 1.5f);
        eVar.j(-0.67f, 1.5f, -1.5f, 1.5f);
        l9.y.a(eVar, 19.5f, 9.5f, 1.96f, 2.5f);
        eVar.f(17.0f, 12.0f);
        eVar.f(17.0f, 9.5f);
        eVar.e(2.5f);
        eVar.a();
        eVar.h(18.0f, 18.5f);
        eVar.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, -0.67f, -1.5f, -1.5f);
        eVar.j(0.67f, -1.5f, 1.5f, -1.5f);
        eVar.j(1.5f, 0.67f, 1.5f, 1.5f);
        eVar.j(-0.67f, 1.5f, -1.5f, 1.5f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21000a = dVarB;
        return dVarB;
    }
}
