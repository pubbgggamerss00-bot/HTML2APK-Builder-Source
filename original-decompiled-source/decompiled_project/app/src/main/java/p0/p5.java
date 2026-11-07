package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20985a;

    public static final w1.d a() {
        w1.d dVar = f20985a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Insights", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(21.0f, 8.0f);
        eVarA.c(-1.45f, CropImageView.DEFAULT_ASPECT_RATIO, -2.26f, 1.44f, -1.93f, 2.51f);
        eVarA.g(-3.55f, 3.56f);
        eVarA.c(-0.3f, -0.09f, -0.74f, -0.09f, -1.04f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(-2.55f, -2.55f);
        eVarA.b(12.27f, 10.45f, 11.46f, 9.0f, 10.0f, 9.0f);
        eVarA.c(-1.45f, CropImageView.DEFAULT_ASPECT_RATIO, -2.27f, 1.44f, -1.93f, 2.52f);
        eVarA.g(-4.56f, 4.55f);
        eVarA.b(2.44f, 15.74f, 1.0f, 16.55f, 1.0f, 18.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.c(1.45f, CropImageView.DEFAULT_ASPECT_RATIO, 2.26f, -1.44f, 1.93f, -2.51f);
        eVarA.g(4.55f, -4.56f);
        eVarA.c(0.3f, 0.09f, 0.74f, 0.09f, 1.04f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(2.55f, 2.55f);
        eVarA.b(12.73f, 16.55f, 13.54f, 18.0f, 15.0f, 18.0f);
        eVarA.c(1.45f, CropImageView.DEFAULT_ASPECT_RATIO, 2.27f, -1.44f, 1.93f, -2.52f);
        eVarA.g(3.56f, -3.55f);
        eVarA.b(21.56f, 12.26f, 23.0f, 11.45f, 23.0f, 10.0f);
        eVarA.b(23.0f, 8.9f, 22.1f, 8.0f, 21.0f, 8.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA2 = n0.b.a(15.0f, 9.0f, 0.94f, -2.07f);
        eVarA2.g(2.06f, -0.93f);
        eVarA2.g(-2.06f, -0.93f);
        eVarA2.g(-0.94f, -2.07f);
        eVarA2.g(-0.92f, 2.07f);
        h.b(eVarA2, -2.08f, 0.93f, 2.08f, 0.93f);
        d.a.a(aVar, eVarA2.f31100a, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        w1.e eVarA3 = n0.b.a(3.5f, 11.0f, 0.5f, -2.0f);
        eVarA3.g(2.0f, -0.5f);
        eVarA3.g(-2.0f, -0.5f);
        eVarA3.g(-0.5f, -2.0f);
        eVarA3.g(-0.5f, 2.0f);
        h.b(eVarA3, -2.0f, 0.5f, 2.0f, 0.5f);
        d.a.a(aVar, eVarA3.f31100a, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f20985a = dVarB;
        return dVarB;
    }
}
