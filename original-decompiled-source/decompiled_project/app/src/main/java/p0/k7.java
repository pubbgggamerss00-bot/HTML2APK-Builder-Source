package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class k7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20919a;

    public static final w1.d a() {
        w1.d dVar = f20919a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.MyLocation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 8.0f);
        eVarA.c(-2.21f, CropImageView.DEFAULT_ASPECT_RATIO, -4.0f, 1.79f, -4.0f, 4.0f);
        eVarA.j(1.79f, 4.0f, 4.0f, 4.0f);
        eVarA.j(4.0f, -1.79f, 4.0f, -4.0f);
        eVarA.j(-1.79f, -4.0f, -4.0f, -4.0f);
        eVarA.a();
        eVarA.h(20.94f, 11.0f);
        eVarA.c(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        eVarA.f(13.0f, 1.0f);
        eVarA.e(-2.0f);
        eVarA.l(2.06f);
        eVarA.b(6.83f, 3.52f, 3.52f, 6.83f, 3.06f, 11.0f);
        id.h.c(eVarA, 1.0f, 11.0f, 2.0f, 2.06f);
        eVarA.c(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        eVarA.f(11.0f, 23.0f);
        eVarA.e(2.0f);
        eVarA.l(-2.06f);
        eVarA.c(4.17f, -0.46f, 7.48f, -3.77f, 7.94f, -7.94f);
        eVarA.f(23.0f, 13.0f);
        eVarA.l(-2.0f);
        eVarA.e(-2.06f);
        eVarA.a();
        eVarA.h(12.0f, 19.0f);
        eVarA.c(-3.87f, CropImageView.DEFAULT_ASPECT_RATIO, -7.0f, -3.13f, -7.0f, -7.0f);
        eVarA.j(3.13f, -7.0f, 7.0f, -7.0f);
        eVarA.j(7.0f, 3.13f, 7.0f, 7.0f);
        eVarA.j(-3.13f, 7.0f, -7.0f, 7.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20919a = dVarB;
        return dVarB;
    }
}
