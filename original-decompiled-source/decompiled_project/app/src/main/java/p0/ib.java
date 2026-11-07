package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class ib {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20895a;

    public static final w1.d a() {
        w1.d dVar = f20895a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Thunderstorm", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = o0.d.a(17.92f, 7.02f);
        eVarA.b(17.45f, 4.18f, 14.97f, 2.0f, 12.0f, 2.0f);
        eVarA.b(9.82f, 2.0f, 7.83f, 3.18f, 6.78f, 5.06f);
        eVarA.b(4.09f, 5.41f, 2.0f, 7.74f, 2.0f, 10.5f);
        eVarA.b(2.0f, 13.53f, 4.47f, 16.0f, 7.5f, 16.0f);
        eVarA.e(10.0f);
        eVarA.c(2.48f, CropImageView.DEFAULT_ASPECT_RATIO, 4.5f, -2.02f, 4.5f, -4.5f);
        eVarA.b(22.0f, 9.16f, 20.21f, 7.23f, 17.92f, 7.02f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVarA2 = n0.b.a(14.8f, 17.0f, -2.9f, 3.32f);
        eVarA2.g(2.0f, 1.0f);
        eVarA2.g(-2.35f, 2.68f);
        eVarA2.g(2.65f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA2.g(2.9f, -3.32f);
        h.b(eVarA2, -2.0f, -1.0f, 2.35f, -2.68f);
        d.a.a(aVar, eVarA2.f31100a, 0, i2Var2);
        q1.i2 i2Var3 = new q1.i2(j10);
        w1.e eVarA3 = n0.b.a(8.8f, 17.0f, -2.9f, 3.32f);
        eVarA3.g(2.0f, 1.0f);
        eVarA3.g(-2.35f, 2.68f);
        eVarA3.g(2.65f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA3.g(2.9f, -3.32f);
        h.b(eVarA3, -2.0f, -1.0f, 2.35f, -2.68f);
        d.a.a(aVar, eVarA3.f31100a, 0, i2Var3);
        w1.d dVarB = aVar.b();
        f20895a = dVarB;
        return dVarB;
    }
}
