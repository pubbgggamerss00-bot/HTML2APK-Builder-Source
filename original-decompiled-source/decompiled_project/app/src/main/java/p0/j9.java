package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20907a;

    public static final w1.d a() {
        w1.d dVar = f20907a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Save", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(17.0f, 3.0f, 5.0f, 3.0f);
        eVarA.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(14.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVarA.e(14.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.f(21.0f, 7.0f);
        eVarA.g(-4.0f, -4.0f);
        eVarA.a();
        eVarA.h(12.0f, 19.0f);
        eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, -1.34f, -3.0f, -3.0f);
        eVarA.j(1.34f, -3.0f, 3.0f, -3.0f);
        eVarA.j(3.0f, 1.34f, 3.0f, 3.0f);
        eVarA.j(-1.34f, 3.0f, -3.0f, 3.0f);
        l9.i.b(eVarA, 15.0f, 9.0f, 5.0f, 9.0f);
        b6.a.c(eVarA, 5.0f, 5.0f, 10.0f, 4.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20907a = dVarB;
        return dVarB;
    }
}
