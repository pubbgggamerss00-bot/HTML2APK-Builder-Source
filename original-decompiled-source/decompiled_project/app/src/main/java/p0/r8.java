package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class r8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21016a;

    public static final w1.d a() {
        w1.d dVar = f21016a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.PushPin", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(16.0f, 9.0f);
        eVar.k(4.0f);
        eVar.g(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, -0.45f, 1.0f, -1.0f);
        eVar.l(CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        eVar.d(7.0f);
        eVar.b(6.45f, 2.0f, 6.0f, 2.45f, 6.0f, 3.0f);
        eVar.l(CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVar.g(1.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.l(5.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.66f, -1.34f, 3.0f, -3.0f, 3.0f);
        eVar.e(CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.l(2.0f);
        eVar.e(5.97f);
        eVar.l(7.0f);
        eVar.g(1.0f, 1.0f);
        eVar.g(1.0f, -1.0f);
        eVar.l(-7.0f);
        eVar.d(19.0f);
        eVar.l(-2.0f);
        eVar.e(CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.b(17.34f, 12.0f, 16.0f, 10.66f, 16.0f, 9.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 1, i2Var);
        w1.d dVarB = aVar.b();
        f21016a = dVarB;
        return dVarB;
    }
}
