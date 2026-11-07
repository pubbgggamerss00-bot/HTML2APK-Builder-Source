package n0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;
import w1.m;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f18295a;

    public static final w1.d a() {
        w1.d dVar = f18295a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("AutoMirrored.Filled.OpenInNew", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.0f, 19.0f);
        eVar.d(5.0f);
        eVar.k(5.0f);
        eVar.e(7.0f);
        eVar.k(3.0f);
        eVar.d(5.0f);
        eVar.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVar.l(14.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVar.e(14.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.l(-7.0f);
        eVar.e(-2.0f);
        eVar.l(7.0f);
        eVar.a();
        eVar.h(14.0f, 3.0f);
        eVar.l(2.0f);
        eVar.e(3.59f);
        eVar.g(-9.83f, 9.83f);
        eVar.g(1.41f, 1.41f);
        eVar.f(19.0f, 6.41f);
        eVar.k(10.0f);
        eVar.e(2.0f);
        eVar.k(3.0f);
        eVar.e(-7.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f18295a = dVarB;
        return dVarB;
    }
}
