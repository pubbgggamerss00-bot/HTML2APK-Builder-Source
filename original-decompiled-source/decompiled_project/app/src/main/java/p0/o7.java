package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class o7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20973a;

    public static final w1.d a() {
        w1.d dVar = f20973a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.NightsStay", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(11.1f, 12.08f);
        eVarA.b(8.77f, 7.57f, 10.6f, 3.6f, 11.63f, 2.01f);
        eVarA.b(6.27f, 2.2f, 1.98f, 6.59f, 1.98f, 12.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.14f, 0.02f, 0.28f, 0.02f, 0.42f);
        eVarA.b(2.62f, 12.15f, 3.29f, 12.0f, 4.0f, 12.0f);
        eVarA.c(1.66f, CropImageView.DEFAULT_ASPECT_RATIO, 3.18f, 0.83f, 4.1f, 2.15f);
        eVarA.b(9.77f, 14.63f, 11.0f, 16.17f, 11.0f, 18.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.52f, -0.87f, 2.83f, -2.12f, 3.51f);
        eVarA.c(0.98f, 0.32f, 2.03f, 0.5f, 3.11f, 0.5f);
        eVarA.c(3.5f, CropImageView.DEFAULT_ASPECT_RATIO, 6.58f, -1.8f, 8.37f, -4.52f);
        eVarA.b(18.0f, 17.72f, 13.38f, 16.52f, 11.1f, 12.08f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA2 = n0.b.a(7.0f, 16.0f, -0.18f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA2.b(6.4f, 14.84f, 5.3f, 14.0f, 4.0f, 14.0f);
        eVarA2.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
        eVarA2.j(1.34f, 3.0f, 3.0f, 3.0f);
        eVarA2.c(0.62f, CropImageView.DEFAULT_ASPECT_RATIO, 2.49f, CropImageView.DEFAULT_ASPECT_RATIO, 3.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA2.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA2.b(9.0f, 16.9f, 8.1f, 16.0f, 7.0f, 16.0f);
        eVarA2.a();
        d.a.a(aVar, eVarA2.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20973a = dVarB;
        return dVarB;
    }
}
