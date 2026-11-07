package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class d9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20825a;

    public static final w1.d a() {
        w1.d dVar = f20825a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.RequestQuote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(14.0f, 2.0f);
        eVar.d(6.0f);
        eVar.b(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f);
        eVar.f(4.0f, 20.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        eVar.d(18.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(8.0f);
        eVar.f(14.0f, 2.0f);
        eVar.a();
        n.a(eVar, 15.0f, 12.0f, -4.0f, 1.0f);
        eVar.e(3.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
        eVar.l(3.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        eVar.e(-1.0f);
        eVar.l(1.0f);
        eVar.e(-2.0f);
        eVar.l(-1.0f);
        eVar.d(9.0f);
        eVar.l(-2.0f);
        eVar.e(4.0f);
        eVar.l(-1.0f);
        eVar.e(-3.0f);
        eVar.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, -0.45f, -1.0f, -1.0f);
        eVar.l(-3.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        eVar.e(1.0f);
        eVar.k(9.0f);
        eVar.e(2.0f);
        eVar.l(1.0f);
        b0.a(eVar, 2.0f, 12.0f, 13.0f, 8.0f);
        eVar.k(3.5f);
        eVar.f(17.5f, 8.0f);
        eVar.d(13.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20825a = dVarB;
        return dVarB;
    }
}
