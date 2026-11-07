package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class d7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20823a;

    public static final w1.d a() {
        w1.d dVar = f20823a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.MilitaryTech", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(17.0f, 10.43f);
        eVar.k(2.0f);
        eVar.d(7.0f);
        eVar.l(8.43f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        eVar.g(4.18f, 2.51f);
        eVar.g(-0.99f, 2.34f);
        eVar.g(-3.41f, 0.29f);
        eVar.g(2.59f, 2.24f);
        eVar.f(9.07f, 22.0f);
        eVar.f(12.0f, 20.23f);
        eVar.f(14.93f, 22.0f);
        eVar.g(-0.78f, -3.33f);
        eVar.g(2.59f, -2.24f);
        eVar.g(-3.41f, -0.29f);
        eVar.g(-0.99f, -2.34f);
        eVar.g(4.18f, -2.51f);
        eVar.b(16.82f, 11.11f, 17.0f, 10.79f, 17.0f, 10.43f);
        l9.y.a(eVar, 13.0f, 12.23f, -1.0f, 0.6f);
        eVar.g(-1.0f, -0.6f);
        eVar.k(3.0f);
        eVar.e(2.0f);
        eVar.k(12.23f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20823a = dVarB;
        return dVarB;
    }
}
