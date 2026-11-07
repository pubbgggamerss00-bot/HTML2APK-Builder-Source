package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20856a;

    public static final w1.d a() {
        w1.d dVar = f20856a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Air", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(14.5f, 17.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        eVarA.j(-3.0f, -1.35f, -3.0f, -3.0f);
        eVarA.e(2.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVarA.j(1.0f, -0.45f, 1.0f, -1.0f);
        eVarA.j(-0.45f, -1.0f, -1.0f, -1.0f);
        eVarA.d(2.0f);
        eVarA.l(-2.0f);
        eVarA.e(9.5f);
        eVarA.b(13.15f, 14.0f, 14.5f, 15.35f, 14.5f, 17.0f);
        eVarA.a();
        eVarA.h(19.0f, 6.5f);
        eVarA.b(19.0f, 4.57f, 17.43f, 3.0f, 15.5f, 3.0f);
        eVarA.i(12.0f, 4.57f, 12.0f, 6.5f);
        eVarA.e(2.0f);
        eVarA.b(14.0f, 5.67f, 14.67f, 5.0f, 15.5f, 5.0f);
        eVarA.i(17.0f, 5.67f, 17.0f, 6.5f);
        eVarA.i(16.33f, 8.0f, 15.5f, 8.0f);
        eVarA.d(2.0f);
        eVarA.l(2.0f);
        eVarA.e(13.5f);
        eVarA.b(17.43f, 10.0f, 19.0f, 8.43f, 19.0f, 6.5f);
        eVarA.a();
        eVarA.h(18.5f, 11.0f);
        eVarA.d(2.0f);
        eVarA.l(2.0f);
        eVarA.e(16.5f);
        eVarA.c(0.83f, CropImageView.DEFAULT_ASPECT_RATIO, 1.5f, 0.67f, 1.5f, 1.5f);
        eVarA.i(19.33f, 16.0f, 18.5f, 16.0f);
        eVarA.l(2.0f);
        eVarA.c(1.93f, CropImageView.DEFAULT_ASPECT_RATIO, 3.5f, -1.57f, 3.5f, -3.5f);
        eVarA.i(20.43f, 11.0f, 18.5f, 11.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20856a = dVarB;
        return dVarB;
    }
}
