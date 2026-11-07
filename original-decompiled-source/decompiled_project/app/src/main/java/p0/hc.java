package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class hc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20882a;

    public static final w1.d a() {
        w1.d dVar = f20882a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Watch", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(20.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.54f, -1.19f, -4.81f, -3.04f, -6.27f);
        eVarA.f(16.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.d(8.0f);
        eVarA.g(-0.95f, 5.73f);
        eVarA.b(5.19f, 7.19f, 4.0f, 9.45f, 4.0f, 12.0f);
        eVarA.j(1.19f, 4.81f, 3.05f, 6.27f);
        eVarA.f(8.0f, 24.0f);
        eVarA.e(8.0f);
        eVarA.g(0.96f, -5.73f);
        eVarA.b(18.81f, 16.81f, 20.0f, 14.54f, 20.0f, 12.0f);
        eVarA.a();
        eVarA.h(6.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        eVarA.j(6.0f, 2.69f, 6.0f, 6.0f);
        eVarA.j(-2.69f, 6.0f, -6.0f, 6.0f);
        eVarA.j(-6.0f, -2.69f, -6.0f, -6.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20882a = dVarB;
        return dVarB;
    }
}
