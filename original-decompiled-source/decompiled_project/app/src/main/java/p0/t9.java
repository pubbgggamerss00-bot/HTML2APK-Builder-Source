package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class t9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21044a;

    public static final w1.d a() {
        w1.d dVar = f21044a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Sell", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(21.41f, 11.41f, -8.83f, -8.83f);
        eVarA.b(12.21f, 2.21f, 11.7f, 2.0f, 11.17f, 2.0f);
        eVarA.d(4.0f);
        eVarA.b(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        eVarA.l(7.17f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f);
        eVarA.g(8.83f, 8.83f);
        eVarA.c(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(7.17f, -7.17f);
        eVarA.b(22.2f, 13.46f, 22.2f, 12.2f, 21.41f, 11.41f);
        eVarA.a();
        eVarA.h(6.5f, 8.0f);
        eVarA.b(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f);
        eVarA.i(5.67f, 5.0f, 6.5f, 5.0f);
        eVarA.i(8.0f, 5.67f, 8.0f, 6.5f);
        eVarA.i(7.33f, 8.0f, 6.5f, 8.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21044a = dVarB;
        return dVarB;
    }
}
