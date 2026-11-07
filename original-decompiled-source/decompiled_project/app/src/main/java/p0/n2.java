package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20954a;

    public static final w1.d a() {
        w1.d dVar = f20954a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.DeleteForever", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(6.0f, 19.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(8.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.f(18.0f, 7.0f);
        eVarA.f(6.0f, 7.0f);
        eVarA.l(12.0f);
        eVarA.a();
        eVarA.h(8.46f, 11.88f);
        eVarA.g(1.41f, -1.41f);
        eVarA.f(12.0f, 12.59f);
        eVarA.g(2.12f, -2.12f);
        eVarA.g(1.41f, 1.41f);
        eVarA.f(13.41f, 14.0f);
        eVarA.g(2.12f, 2.12f);
        eVarA.g(-1.41f, 1.41f);
        eVarA.f(12.0f, 15.41f);
        eVarA.g(-2.12f, 2.12f);
        eVarA.g(-1.41f, -1.41f);
        eVarA.f(10.59f, 14.0f);
        eVarA.g(-2.13f, -2.12f);
        eVarA.a();
        eVarA.h(15.5f, 4.0f);
        eVarA.g(-1.0f, -1.0f);
        eVarA.e(-5.0f);
        eVarA.g(-1.0f, 1.0f);
        id.h.c(eVarA, 5.0f, 4.0f, 2.0f, 14.0f);
        eVarA.f(19.0f, 4.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20954a = dVarB;
        return dVarB;
    }
}
