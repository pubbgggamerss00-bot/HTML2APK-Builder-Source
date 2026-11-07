package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class i6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20890a;

    public static final w1.d a() {
        w1.d dVar = f20890a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LocalAtm", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(11.0f, 17.0f);
        eVar.e(2.0f);
        eVar.l(-1.0f);
        eVar.e(1.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar.l(-3.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        eVar.e(-3.0f);
        eVar.l(-1.0f);
        eVar.e(4.0f);
        eVar.f(15.0f, 8.0f);
        eVar.e(-2.0f);
        eVar.f(13.0f, 7.0f);
        eVar.e(-2.0f);
        eVar.l(1.0f);
        eVar.e(-1.0f);
        eVar.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, 0.45f, -1.0f, 1.0f);
        eVar.l(3.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVar.e(3.0f);
        eVar.l(1.0f);
        eVar.f(9.0f, 14.0f);
        eVar.l(2.0f);
        eVar.e(2.0f);
        eVar.l(1.0f);
        eVar.a();
        eVar.h(20.0f, 4.0f);
        eVar.f(4.0f, 4.0f);
        eVar.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.89f, -1.99f, 2.0f);
        eVar.f(2.0f, 18.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVar.e(16.0f);
        eVar.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.89f, 2.0f, -2.0f);
        eVar.f(22.0f, 6.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        l9.i.b(eVar, 20.0f, 18.0f, 4.0f, 18.0f);
        b6.a.c(eVar, 4.0f, 6.0f, 16.0f, 12.0f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20890a = dVarB;
        return dVarB;
    }
}
