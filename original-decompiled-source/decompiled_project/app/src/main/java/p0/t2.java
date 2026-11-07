package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21037a;

    public static final w1.d a() {
        w1.d dVar = f21037a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.DirectionsBus", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(4.0f, 16.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f);
        eVarA.f(5.0f, 20.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVarA.e(1.0f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVarA.l(-1.0f);
        eVarA.e(8.0f);
        eVarA.l(1.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVarA.e(1.0f);
        eVarA.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVarA.l(-1.78f);
        eVarA.c(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        eVarA.f(20.0f, 6.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.5f, -3.58f, -4.0f, -8.0f, -4.0f);
        eVarA.j(-8.0f, 0.5f, -8.0f, 4.0f);
        eVarA.l(10.0f);
        eVarA.a();
        eVarA.h(7.5f, 17.0f);
        eVarA.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, -0.67f, -1.5f, -1.5f);
        eVarA.i(6.67f, 14.0f, 7.5f, 14.0f);
        eVarA.j(1.5f, 0.67f, 1.5f, 1.5f);
        eVarA.i(8.33f, 17.0f, 7.5f, 17.0f);
        eVarA.a();
        eVarA.h(16.5f, 17.0f);
        eVarA.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, -0.67f, -1.5f, -1.5f);
        eVarA.j(0.67f, -1.5f, 1.5f, -1.5f);
        eVarA.j(1.5f, 0.67f, 1.5f, 1.5f);
        eVarA.j(-0.67f, 1.5f, -1.5f, 1.5f);
        l9.i.b(eVarA, 18.0f, 11.0f, 6.0f, 11.0f);
        b6.a.c(eVarA, 6.0f, 6.0f, 12.0f, 5.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21037a = dVarB;
        return dVarB;
    }
}
