package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class q9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21003a;

    public static final w1.d a() {
        w1.d dVar = f21003a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(15.5f, 14.0f);
        eVar.e(-0.79f);
        eVar.g(-0.28f, -0.27f);
        eVar.b(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
        eVar.b(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
        eVar.i(3.0f, 5.91f, 3.0f, 9.5f);
        eVar.i(5.91f, 16.0f, 9.5f, 16.0f);
        eVar.c(1.61f, CropImageView.DEFAULT_ASPECT_RATIO, 3.09f, -0.59f, 4.23f, -1.57f);
        eVar.g(0.27f, 0.28f);
        eVar.l(0.79f);
        eVar.g(5.0f, 4.99f);
        eVar.f(20.49f, 19.0f);
        eVar.g(-4.99f, -5.0f);
        eVar.a();
        eVar.h(9.5f, 14.0f);
        eVar.b(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        eVar.i(7.01f, 5.0f, 9.5f, 5.0f);
        eVar.i(14.0f, 7.01f, 14.0f, 9.5f);
        eVar.i(11.99f, 14.0f, 9.5f, 14.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21003a = dVarB;
        return dVarB;
    }
}
