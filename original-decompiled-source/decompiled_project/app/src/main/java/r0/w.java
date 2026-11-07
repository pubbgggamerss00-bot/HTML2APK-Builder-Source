package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23051a;

    public static final w1.d a() {
        w1.d dVar = f23051a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.Edit", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(3.0f, 17.46f);
        eVar.l(3.04f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        eVar.e(3.04f);
        eVar.c(0.13f, CropImageView.DEFAULT_ASPECT_RATIO, 0.26f, -0.05f, 0.35f, -0.15f);
        eVar.f(17.81f, 9.94f);
        eVar.g(-3.75f, -3.75f);
        eVar.f(3.15f, 17.1f);
        eVar.c(-0.1f, 0.1f, -0.15f, 0.22f, -0.15f, 0.36f);
        eVar.a();
        eVar.h(20.71f, 7.04f);
        eVar.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
        eVar.g(-2.34f, -2.34f);
        eVar.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.g(-1.83f, 1.83f);
        p0.h.b(eVar, 3.75f, 3.75f, 1.83f, -1.83f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23051a = dVarB;
        return dVarB;
    }
}
