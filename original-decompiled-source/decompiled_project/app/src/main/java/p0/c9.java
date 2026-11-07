package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class c9 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20812a;

    public static final w1.d a() {
        w1.d dVar = f20812a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(17.65f, 6.35f);
        eVarA.b(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        eVarA.c(-4.42f, CropImageView.DEFAULT_ASPECT_RATIO, -7.99f, 3.58f, -7.99f, 8.0f);
        eVarA.j(3.57f, 8.0f, 7.99f, 8.0f);
        eVarA.c(3.73f, CropImageView.DEFAULT_ASPECT_RATIO, 6.84f, -2.55f, 7.73f, -6.0f);
        eVarA.e(-2.08f);
        eVarA.c(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        eVarA.c(-3.31f, CropImageView.DEFAULT_ASPECT_RATIO, -6.0f, -2.69f, -6.0f, -6.0f);
        eVarA.j(2.69f, -6.0f, 6.0f, -6.0f);
        eVarA.c(1.66f, CropImageView.DEFAULT_ASPECT_RATIO, 3.14f, 0.69f, 4.22f, 1.78f);
        eVarA.f(13.0f, 11.0f);
        eVarA.e(7.0f);
        eVarA.k(4.0f);
        eVarA.g(-2.35f, 2.35f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20812a = dVarB;
        return dVarB;
    }
}
