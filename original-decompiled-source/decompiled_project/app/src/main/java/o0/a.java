package o0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;
import w1.m;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f18840a;

    public static final w1.d a() {
        w1.d dVar = f18840a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("AutoMirrored.Rounded.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.0f, 11.0f);
        eVar.d(7.83f);
        eVar.g(4.88f, -4.88f);
        eVar.c(0.39f, -0.39f, 0.39f, -1.03f, CropImageView.DEFAULT_ASPECT_RATIO, -1.42f);
        eVar.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.g(-6.59f, 6.59f);
        eVar.c(-0.39f, 0.39f, -0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        eVar.g(6.59f, 6.59f);
        eVar.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
        eVar.f(7.83f, 13.0f);
        eVar.d(19.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar.j(-0.45f, -1.0f, -1.0f, -1.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f18840a = dVarB;
        return dVarB;
    }
}
