package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class c2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20805a;

    public static final w1.d a() {
        w1.d dVar = f20805a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.ContentPaste", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.0f, 2.0f);
        eVar.e(-4.18f);
        eVar.b(14.4f, 0.84f, 13.3f, CropImageView.DEFAULT_ASPECT_RATIO, 12.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.c(-1.3f, CropImageView.DEFAULT_ASPECT_RATIO, -2.4f, 0.84f, -2.82f, 2.0f);
        eVar.f(5.0f, 2.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVar.l(16.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(14.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.f(21.0f, 4.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVar.a();
        eVar.h(12.0f, 2.0f);
        eVar.c(0.55f, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 0.45f, 1.0f, 1.0f);
        eVar.j(-0.45f, 1.0f, -1.0f, 1.0f);
        eVar.j(-1.0f, -0.45f, -1.0f, -1.0f);
        eVar.j(0.45f, -1.0f, 1.0f, -1.0f);
        l9.i.b(eVar, 19.0f, 20.0f, 5.0f, 20.0f);
        eVar.f(5.0f, 4.0f);
        eVar.e(2.0f);
        eVar.l(3.0f);
        eVar.e(10.0f);
        eVar.f(17.0f, 4.0f);
        eVar.e(2.0f);
        eVar.l(16.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20805a = dVarB;
        return dVarB;
    }
}
