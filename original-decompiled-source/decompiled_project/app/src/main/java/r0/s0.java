package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23044a;

    public static final w1.d a() {
        w1.d dVar = f23044a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.TextFields", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = o0.d.a(2.5f, 5.5f);
        eVarA.b(2.5f, 6.33f, 3.17f, 7.0f, 4.0f, 7.0f);
        eVarA.e(3.5f);
        eVarA.l(10.5f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        eVarA.j(1.5f, -0.67f, 1.5f, -1.5f);
        eVarA.k(7.0f);
        eVarA.d(14.0f);
        eVarA.c(0.83f, CropImageView.DEFAULT_ASPECT_RATIO, 1.5f, -0.67f, 1.5f, -1.5f);
        eVarA.i(14.83f, 4.0f, 14.0f, 4.0f);
        eVarA.d(4.0f);
        eVarA.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, 0.67f, -1.5f, 1.5f);
        p0.d0.a(eVarA, 20.0f, 9.0f, -6.0f);
        eVarA.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, 0.67f, -1.5f, 1.5f);
        eVarA.i(13.17f, 12.0f, 14.0f, 12.0f);
        eVarA.e(1.5f);
        eVarA.l(5.5f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        eVarA.j(1.5f, -0.67f, 1.5f, -1.5f);
        eVarA.k(12.0f);
        eVarA.d(20.0f);
        eVarA.c(0.83f, CropImageView.DEFAULT_ASPECT_RATIO, 1.5f, -0.67f, 1.5f, -1.5f);
        eVarA.i(20.83f, 9.0f, 20.0f, 9.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23044a = dVarB;
        return dVarB;
    }
}
