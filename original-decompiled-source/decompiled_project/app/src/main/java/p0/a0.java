package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20776a;

    public static final w1.d a() {
        w1.d dVar = f20776a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.AutoStories", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.0f, 1.0f);
        eVar.g(-5.0f, 5.0f);
        eVar.l(11.0f);
        id.i.b(eVar, 5.0f, -4.5f, 19.0f, 1.0f);
        eVar.h(1.0f, 6.0f);
        eVar.l(14.65f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.25f, 0.25f, 0.5f, 0.5f, 0.5f);
        eVar.c(0.1f, CropImageView.DEFAULT_ASPECT_RATIO, 0.15f, -0.05f, 0.25f, -0.05f);
        eVar.b(3.1f, 20.45f, 5.05f, 20.0f, 6.5f, 20.0f);
        eVar.c(1.95f, CropImageView.DEFAULT_ASPECT_RATIO, 4.05f, 0.4f, 5.5f, 1.5f);
        eVar.f(12.0f, 6.0f);
        eVar.c(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        eVar.i(2.45f, 4.9f, 1.0f, 6.0f);
        l9.i.b(eVar, 23.0f, 19.5f, 23.0f, 6.0f);
        eVar.c(-0.6f, -0.45f, -1.25f, -0.75f, -2.0f, -1.0f);
        eVar.l(13.5f);
        eVar.c(-1.1f, -0.35f, -2.3f, -0.5f, -3.5f, -0.5f);
        eVar.c(-1.7f, CropImageView.DEFAULT_ASPECT_RATIO, -4.15f, 0.65f, -5.5f, 1.5f);
        eVar.l(2.0f);
        eVar.c(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        eVar.c(1.65f, CropImageView.DEFAULT_ASPECT_RATIO, 3.35f, 0.3f, 4.75f, 1.05f);
        eVar.c(0.1f, 0.05f, 0.15f, 0.05f, 0.25f, 0.05f);
        eVar.c(0.25f, CropImageView.DEFAULT_ASPECT_RATIO, 0.5f, -0.25f, 0.5f, -0.5f);
        eVar.l(-1.1f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20776a = dVarB;
        return dVarB;
    }
}
