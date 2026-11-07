package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21008a;

    public static final w1.d a() {
        w1.d dVar = f21008a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Bookmark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(17.0f, 3.0f);
        eVar.d(7.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.9f, -1.99f, 2.0f);
        eVar.f(5.0f, 21.0f);
        eVar.g(7.0f, -3.0f);
        eVar.g(7.0f, 3.0f);
        eVar.k(5.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21008a = dVarB;
        return dVarB;
    }
}
