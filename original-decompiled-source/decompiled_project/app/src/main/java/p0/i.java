package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20883a;

    public static final w1.d a() {
        w1.d dVar = f20883a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Alarm", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(22.0f, 5.72f, -4.6f, -3.86f);
        eVarA.g(-1.29f, 1.53f);
        id.i.b(eVarA, 4.6f, 3.86f, 22.0f, 5.72f);
        eVarA.h(7.88f, 3.39f);
        eVarA.f(6.6f, 1.86f);
        eVarA.f(2.0f, 5.71f);
        h.b(eVarA, 1.29f, 1.53f, 4.59f, -3.85f);
        eVarA.h(12.5f, 8.0f);
        eVarA.f(11.0f, 8.0f);
        eVarA.l(6.0f);
        eVarA.g(4.75f, 2.85f);
        eVarA.g(0.75f, -1.23f);
        id.i.b(eVarA, -4.0f, -2.37f, 12.5f, 8.0f);
        eVarA.h(12.0f, 4.0f);
        eVarA.c(-4.97f, CropImageView.DEFAULT_ASPECT_RATIO, -9.0f, 4.03f, -9.0f, 9.0f);
        eVarA.j(4.02f, 9.0f, 9.0f, 9.0f);
        eVarA.c(4.97f, CropImageView.DEFAULT_ASPECT_RATIO, 9.0f, -4.03f, 9.0f, -9.0f);
        eVarA.j(-4.03f, -9.0f, -9.0f, -9.0f);
        eVarA.a();
        eVarA.h(12.0f, 20.0f);
        eVarA.c(-3.87f, CropImageView.DEFAULT_ASPECT_RATIO, -7.0f, -3.13f, -7.0f, -7.0f);
        eVarA.j(3.13f, -7.0f, 7.0f, -7.0f);
        eVarA.j(7.0f, 3.13f, 7.0f, 7.0f);
        eVarA.j(-3.13f, 7.0f, -7.0f, 7.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20883a = dVarB;
        return dVarB;
    }
}
