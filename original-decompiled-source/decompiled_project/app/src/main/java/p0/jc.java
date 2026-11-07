package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class jc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20910a;

    public static final w1.d a() {
        w1.d dVar = f20910a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.WaterDrop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.c(-5.33f, 4.55f, -8.0f, 8.48f, -8.0f, 11.8f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 4.98f, 3.8f, 8.2f, 8.0f, 8.2f);
        eVarA.j(8.0f, -3.22f, 8.0f, -8.2f);
        eVarA.b(20.0f, 10.48f, 17.33f, 6.55f, 12.0f, 2.0f);
        eVarA.a();
        eVarA.h(7.83f, 14.0f);
        eVarA.c(0.37f, CropImageView.DEFAULT_ASPECT_RATIO, 0.67f, 0.26f, 0.74f, 0.62f);
        eVarA.c(0.41f, 2.22f, 2.28f, 2.98f, 3.64f, 2.87f);
        eVarA.c(0.43f, -0.02f, 0.79f, 0.32f, 0.79f, 0.75f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.4f, -0.32f, 0.73f, -0.72f, 0.75f);
        eVarA.c(-2.13f, 0.13f, -4.62f, -1.09f, -5.19f, -4.12f);
        eVarA.b(7.01f, 14.42f, 7.37f, 14.0f, 7.83f, 14.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20910a = dVarB;
        return dVarB;
    }
}
