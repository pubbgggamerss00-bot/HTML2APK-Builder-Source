package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20900a;

    public static final w1.d a() {
        w1.d dVar = f20900a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Cyclone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(12.0f, 8.0f);
        eVarA.c(-2.21f, CropImageView.DEFAULT_ASPECT_RATIO, -4.0f, 1.79f, -4.0f, 4.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        eVarA.c(2.21f, CropImageView.DEFAULT_ASPECT_RATIO, 4.0f, -1.79f, 4.0f, -4.0f);
        eVarA.b(16.0f, 9.79f, 14.21f, 8.0f, 12.0f, 8.0f);
        eVarA.a();
        eVarA.h(12.0f, 14.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, -0.9f, -2.0f, -2.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        eVarA.j(2.0f, 0.9f, 2.0f, 2.0f);
        eVarA.b(14.0f, 13.1f, 13.1f, 14.0f, 12.0f, 14.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(22.0f, 7.47f);
        eVar.k(5.35f);
        eVar.b(20.05f, 4.77f, 16.56f, 4.0f, 12.0f, 4.0f);
        eVar.b(9.85f, 4.0f, 7.89f, 4.86f, 6.46f, 6.24f);
        eVar.b(6.59f, 5.39f, 6.86f, 3.84f, 7.47f, 2.0f);
        eVar.d(5.35f);
        eVar.b(4.77f, 3.95f, 4.0f, 7.44f, 4.0f, 12.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.15f, 0.86f, 4.11f, 2.24f, 5.54f);
        eVar.c(-0.85f, -0.14f, -2.4f, -0.4f, -4.24f, -1.01f);
        eVar.l(2.12f);
        eVar.b(3.95f, 19.23f, 7.44f, 20.0f, 12.0f, 20.0f);
        eVar.c(2.15f, CropImageView.DEFAULT_ASPECT_RATIO, 4.11f, -0.86f, 5.54f, -2.24f);
        eVar.c(-0.14f, 0.85f, -0.4f, 2.4f, -1.01f, 4.24f);
        eVar.e(2.12f);
        eVar.b(19.23f, 20.05f, 20.0f, 16.56f, 20.0f, 12.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.15f, -0.86f, -4.11f, -2.24f, -5.54f);
        eVar.b(18.61f, 6.59f, 20.16f, 6.86f, 22.0f, 7.47f);
        eVar.a();
        eVar.h(12.0f, 18.0f);
        eVar.c(-3.31f, CropImageView.DEFAULT_ASPECT_RATIO, -6.0f, -2.69f, -6.0f, -6.0f);
        eVar.j(2.69f, -6.0f, 6.0f, -6.0f);
        eVar.j(6.0f, 2.69f, 6.0f, 6.0f);
        eVar.i(15.31f, 18.0f, 12.0f, 18.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20900a = dVarB;
        return dVarB;
    }
}
