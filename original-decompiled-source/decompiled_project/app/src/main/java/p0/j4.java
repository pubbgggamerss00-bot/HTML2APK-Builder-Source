package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class j4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20902a;

    public static final w1.d a() {
        w1.d dVar = f20902a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.FlightTakeoff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(2.5f, 19.0f);
        eVar.e(19.0f);
        eVar.l(2.0f);
        eVar.e(-19.0f);
        eVar.k(19.0f);
        eVar.a();
        eVar.h(22.07f, 9.64f);
        eVar.c(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f);
        eVar.f(14.92f, 10.0f);
        eVar.g(-6.9f, -6.43f);
        eVar.f(6.09f, 4.08f);
        eVar.g(4.14f, 7.17f);
        eVar.g(-4.97f, 1.33f);
        eVar.g(-1.97f, -1.54f);
        eVar.g(-1.45f, 0.39f);
        eVar.g(2.59f, 4.49f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 7.12f, -1.9f, 16.57f, -4.43f);
        eVar.b(21.81f, 11.26f, 22.28f, 10.44f, 22.07f, 9.64f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20902a = dVarB;
        return dVarB;
    }
}
