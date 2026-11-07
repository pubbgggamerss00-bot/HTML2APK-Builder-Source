package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class e9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20839a;

    public static final w1.d a() {
        w1.d dVar = f20839a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Restaurant", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(11.0f, 9.0f, 9.0f, 9.0f);
        eVarA.f(9.0f, 2.0f);
        eVarA.f(7.0f, 2.0f);
        eVarA.l(7.0f);
        eVarA.f(5.0f, 9.0f);
        eVarA.f(5.0f, 2.0f);
        eVarA.f(3.0f, 2.0f);
        eVarA.l(7.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.12f, 1.66f, 3.84f, 3.75f, 3.97f);
        eVarA.f(6.75f, 22.0f);
        eVarA.e(2.5f);
        eVarA.l(-9.03f);
        eVarA.b(11.34f, 12.84f, 13.0f, 11.12f, 13.0f, 9.0f);
        b6.a.c(eVarA, 13.0f, 2.0f, -2.0f, 7.0f);
        eVarA.h(16.0f, 6.0f);
        eVarA.l(8.0f);
        eVarA.e(2.5f);
        eVarA.l(8.0f);
        eVarA.f(21.0f, 22.0f);
        eVarA.f(21.0f, 2.0f);
        eVarA.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, 2.24f, -5.0f, 4.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20839a = dVarB;
        return dVarB;
    }
}
