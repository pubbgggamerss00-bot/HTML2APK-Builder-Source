package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20832a;

    public static final w1.d a() {
        w1.d dVar = f20832a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Create", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(3.0f, 17.25f);
        eVar.k(21.0f);
        eVar.e(3.75f);
        eVar.f(17.81f, 9.94f);
        id.i.b(eVar, -3.75f, -3.75f, 3.0f, 17.25f);
        eVar.h(20.71f, 7.04f);
        eVar.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
        eVar.g(-2.34f, -2.34f);
        eVar.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.g(-1.83f, 1.83f);
        h.b(eVar, 3.75f, 3.75f, 1.83f, -1.83f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20832a = dVarB;
        return dVarB;
    }
}
