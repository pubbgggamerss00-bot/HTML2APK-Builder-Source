package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class u6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21054a;

    public static final w1.d a() {
        w1.d dVar = f21054a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Luggage", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(17.0f, 6.0f);
        eVar.e(-2.0f);
        eVar.k(3.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        eVar.e(-4.0f);
        eVar.b(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        eVar.l(3.0f);
        eVar.d(7.0f);
        eVar.b(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f);
        eVar.l(11.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar.e(6.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(8.0f);
        eVar.b(19.0f, 6.9f, 18.1f, 6.0f, 17.0f, 6.0f);
        eVar.a();
        eVar.h(9.5f, 18.0f);
        eVar.d(8.0f);
        eVar.k(9.0f);
        b0.a(eVar, 1.5f, 18.0f, 12.75f, 18.0f);
        eVar.e(-1.5f);
        eVar.k(9.0f);
        eVar.e(1.5f);
        eVar.k(18.0f);
        eVar.a();
        eVar.h(13.5f, 6.0f);
        eVar.e(-3.0f);
        eVar.k(3.5f);
        b0.a(eVar, 3.0f, 6.0f, 16.0f, 18.0f);
        eVar.e(-1.5f);
        eVar.k(9.0f);
        eVar.d(16.0f);
        eVar.k(18.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21054a = dVarB;
        return dVarB;
    }
}
