package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class cc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20815a;

    public static final w1.d a() {
        w1.d dVar = f20815a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.VideogameAsset", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = m.a(21.0f, 6.0f, 3.0f, 6.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.l(8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(18.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.f(23.0f, 8.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        l9.i.b(eVarA, 11.0f, 13.0f, 8.0f, 13.0f);
        eVarA.l(3.0f);
        eVarA.f(6.0f, 16.0f);
        eVarA.l(-3.0f);
        id.h.c(eVarA, 3.0f, 13.0f, -2.0f, 3.0f);
        eVarA.f(6.0f, 8.0f);
        eVarA.e(2.0f);
        eVarA.l(3.0f);
        eVarA.e(3.0f);
        eVarA.l(2.0f);
        eVarA.a();
        eVarA.h(15.5f, 15.0f);
        eVarA.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, -0.67f, -1.5f, -1.5f);
        eVarA.j(0.67f, -1.5f, 1.5f, -1.5f);
        eVarA.j(1.5f, 0.67f, 1.5f, 1.5f);
        eVarA.j(-0.67f, 1.5f, -1.5f, 1.5f);
        eVarA.a();
        eVarA.h(19.5f, 12.0f);
        eVarA.c(-0.83f, CropImageView.DEFAULT_ASPECT_RATIO, -1.5f, -0.67f, -1.5f, -1.5f);
        eVarA.i(18.67f, 9.0f, 19.5f, 9.0f);
        eVarA.j(1.5f, 0.67f, 1.5f, 1.5f);
        eVarA.j(-0.67f, 1.5f, -1.5f, 1.5f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20815a = dVarB;
        return dVarB;
    }
}
