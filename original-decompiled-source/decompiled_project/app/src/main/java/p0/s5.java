package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class s5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21027a;

    public static final w1.d a() {
        w1.d dVar = f21027a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Inventory", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(20.0f, 2.0f, 4.0f, 2.0f);
        eVarA.c(-1.0f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(3.01f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.72f, 0.43f, 1.34f, 1.0f, 1.69f);
        eVarA.f(3.0f, 20.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f);
        eVarA.e(14.0f);
        eVarA.c(0.9f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.f(21.0f, 8.7f);
        eVarA.c(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f);
        eVarA.f(22.0f, 4.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -1.0f, -2.0f, -2.0f, -2.0f);
        l9.i.b(eVarA, 15.0f, 14.0f, 9.0f, 14.0f);
        eVarA.l(-2.0f);
        eVarA.e(6.0f);
        eVarA.l(2.0f);
        eVarA.a();
        eVarA.h(20.0f, 7.0f);
        eVarA.f(4.0f, 7.0f);
        eVarA.f(4.0f, 4.0f);
        id.i.b(eVarA, 16.0f, -0.02f, 20.0f, 7.0f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21027a = dVarB;
        return dVarB;
    }
}
