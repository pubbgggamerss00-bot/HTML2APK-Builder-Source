package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21017a;

    public static final w1.d a() {
        w1.d dVar = f21017a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Security", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(12.0f, 1.0f);
        eVar.f(3.0f, 5.0f);
        eVar.l(6.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        eVar.c(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        eVar.f(21.0f, 5.0f);
        eVar.g(-9.0f, -4.0f);
        eVar.a();
        eVar.h(12.0f, 11.99f);
        eVar.e(7.0f);
        eVar.c(-0.53f, 4.12f, -3.28f, 7.79f, -7.0f, 8.94f);
        eVar.f(12.0f, 12.0f);
        eVar.f(5.0f, 12.0f);
        eVar.f(5.0f, 6.3f);
        eVar.g(7.0f, -3.11f);
        eVar.l(8.8f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21017a = dVarB;
        return dVarB;
    }
}
