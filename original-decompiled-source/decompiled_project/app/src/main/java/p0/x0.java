package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21087a;

    public static final w1.d a() {
        w1.d dVar = f21087a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Build", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(22.7f, 19.0f, -9.1f, -9.1f);
        eVarA.c(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
        eVarA.c(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
        eVarA.f(9.0f, 6.0f);
        eVarA.f(6.0f, 9.0f);
        eVarA.f(1.6f, 4.7f);
        eVarA.b(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
        eVarA.c(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
        eVarA.g(9.1f, 9.1f);
        eVarA.c(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(2.3f, -2.3f);
        eVarA.c(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21087a = dVarB;
        return dVarB;
    }
}
