package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21076a;

    public static final w1.d a() {
        w1.d dVar = f21076a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.DirectionsWalk", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(13.5f, 5.5f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.j(-0.9f, -2.0f, -2.0f, -2.0f);
        eVarA.j(-2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.j(0.9f, 2.0f, 2.0f, 2.0f);
        l9.i.b(eVarA, 9.8f, 8.9f, 7.0f, 23.0f);
        eVarA.e(2.1f);
        eVarA.g(1.8f, -8.0f);
        eVarA.g(2.1f, 2.0f);
        eVarA.l(6.0f);
        eVarA.e(2.0f);
        eVarA.l(-7.5f);
        eVarA.g(-2.1f, -2.0f);
        eVarA.g(0.6f, -3.0f);
        eVarA.b(14.8f, 12.0f, 16.8f, 13.0f, 19.0f, 13.0f);
        eVarA.l(-2.0f);
        eVarA.c(-1.9f, CropImageView.DEFAULT_ASPECT_RATIO, -3.5f, -1.0f, -4.3f, -2.4f);
        eVarA.g(-1.0f, -1.6f);
        eVarA.c(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f);
        eVarA.c(-0.3f, CropImageView.DEFAULT_ASPECT_RATIO, -0.5f, 0.1f, -0.8f, 0.1f);
        eVarA.f(6.0f, 8.3f);
        eVarA.k(13.0f);
        eVarA.e(2.0f);
        eVarA.k(9.6f);
        eVarA.g(1.8f, -0.7f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21076a = dVarB;
        return dVarB;
    }
}
