package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class f9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20852a;

    public static final w1.d a() {
        w1.d dVar = f20852a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.RiceBowl", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(22.0f, 12.0f, 22.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f);
        eVarA.i(2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.69f, 2.47f, 6.86f, 6.0f, 8.25f);
        eVarA.k(22.0f);
        eVarA.e(8.0f);
        eVarA.l(-1.75f);
        eVarA.b(19.53f, 18.86f, 22.0f, 15.69f, 22.0f, 12.0f);
        eVarA.a();
        eVarA.h(20.0f, 12.0f);
        eVarA.e(-4.0f);
        eVarA.k(5.08f);
        eVarA.b(18.39f, 6.47f, 20.0f, 9.05f, 20.0f, 12.0f);
        eVarA.a();
        eVarA.h(14.0f, 4.26f);
        eVarA.k(12.0f);
        eVarA.e(-4.0f);
        eVarA.k(4.26f);
        eVarA.b(10.64f, 4.1f, 11.31f, 4.0f, 12.0f, 4.0f);
        eVarA.i(13.36f, 4.1f, 14.0f, 4.26f);
        eVarA.a();
        eVarA.h(4.0f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.95f, 1.61f, -5.53f, 4.0f, -6.92f);
        eVarA.k(12.0f);
        eVarA.d(4.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20852a = dVarB;
        return dVarB;
    }
}
