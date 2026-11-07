package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21035a;

    public static final w1.d a() {
        w1.d dVar = f21035a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.BrightnessHigh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 8.69f);
        eVar.f(20.0f, 4.0f);
        eVar.e(-4.69f);
        eVar.f(12.0f, 0.69f);
        eVar.f(8.69f, 4.0f);
        eVar.f(4.0f, 4.0f);
        eVar.l(4.69f);
        eVar.f(0.69f, 12.0f);
        eVar.f(4.0f, 15.31f);
        eVar.f(4.0f, 20.0f);
        eVar.e(4.69f);
        eVar.f(12.0f, 23.31f);
        eVar.f(15.31f, 20.0f);
        eVar.f(20.0f, 20.0f);
        eVar.l(-4.69f);
        f0.a(eVar, 23.31f, 12.0f, 20.0f, 8.69f);
        eVar.h(12.0f, 18.0f);
        eVar.c(-3.31f, CropImageView.DEFAULT_ASPECT_RATIO, -6.0f, -2.69f, -6.0f, -6.0f);
        eVar.j(2.69f, -6.0f, 6.0f, -6.0f);
        eVar.j(6.0f, 2.69f, 6.0f, 6.0f);
        eVar.j(-2.69f, 6.0f, -6.0f, 6.0f);
        eVar.a();
        eVar.h(12.0f, 8.0f);
        eVar.c(-2.21f, CropImageView.DEFAULT_ASPECT_RATIO, -4.0f, 1.79f, -4.0f, 4.0f);
        eVar.j(1.79f, 4.0f, 4.0f, 4.0f);
        eVar.j(4.0f, -1.79f, 4.0f, -4.0f);
        eVar.j(-1.79f, -4.0f, -4.0f, -4.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21035a = dVarB;
        return dVarB;
    }
}
