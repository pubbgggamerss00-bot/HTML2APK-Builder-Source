package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21063a;

    public static final w1.d a() {
        w1.d dVar = f21063a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.DirectionsRun", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(13.49f, 5.48f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.j(-0.9f, -2.0f, -2.0f, -2.0f);
        eVarA.j(-2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.j(0.9f, 2.0f, 2.0f, 2.0f);
        l9.y.a(eVarA, 9.89f, 19.38f, 1.0f, -4.4f);
        eVarA.g(2.1f, 2.0f);
        eVarA.l(6.0f);
        eVarA.e(2.0f);
        eVarA.l(-7.5f);
        eVarA.g(-2.1f, -2.0f);
        eVarA.g(0.6f, -3.0f);
        eVarA.c(1.3f, 1.5f, 3.3f, 2.5f, 5.5f, 2.5f);
        eVarA.l(-2.0f);
        eVarA.c(-1.9f, CropImageView.DEFAULT_ASPECT_RATIO, -3.5f, -1.0f, -4.3f, -2.4f);
        eVarA.g(-1.0f, -1.6f);
        eVarA.c(-0.4f, -0.6f, -1.0f, -1.0f, -1.7f, -1.0f);
        eVarA.c(-0.3f, CropImageView.DEFAULT_ASPECT_RATIO, -0.5f, 0.1f, -0.8f, 0.1f);
        eVarA.g(-5.2f, 2.2f);
        eVarA.l(4.7f);
        eVarA.e(2.0f);
        eVarA.l(-3.4f);
        eVarA.g(1.8f, -0.7f);
        eVarA.g(-1.6f, 8.1f);
        eVarA.g(-4.9f, -1.0f);
        h.b(eVarA, -0.4f, 2.0f, 7.0f, 1.4f);
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21063a = dVarB;
        return dVarB;
    }
}
