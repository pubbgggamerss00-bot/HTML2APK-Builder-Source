package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class f7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20850a;

    public static final w1.d a() {
        w1.d dVar = f20850a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.MonitorHeart", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        long j10 = q1.b1.f21648b;
        q1.i2 i2Var = new q1.i2(j10);
        w1.e eVarA = m.a(15.11f, 12.45f, 14.0f, 10.24f);
        eVarA.g(-3.11f, 6.21f);
        eVarA.b(10.73f, 16.79f, 10.38f, 17.0f, 10.0f, 17.0f);
        eVarA.j(-0.73f, -0.21f, -0.89f, -0.55f);
        eVarA.f(7.38f, 13.0f);
        eVarA.d(2.0f);
        eVarA.l(5.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.e(16.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.l(-5.0f);
        eVarA.e(-6.0f);
        eVarA.b(15.62f, 13.0f, 15.27f, 12.79f, 15.11f, 12.45f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        q1.i2 i2Var2 = new q1.i2(j10);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 4.0f);
        eVar.d(4.0f);
        eVar.b(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f);
        eVar.l(5.0f);
        eVar.e(6.0f);
        eVar.c(0.38f, CropImageView.DEFAULT_ASPECT_RATIO, 0.73f, 0.21f, 0.89f, 0.55f);
        eVar.f(10.0f, 13.76f);
        eVar.g(3.11f, -6.21f);
        eVar.c(0.34f, -0.68f, 1.45f, -0.68f, 1.79f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.f(16.62f, 11.0f);
        eVar.d(22.0f);
        eVar.k(6.0f);
        eVar.b(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var2);
        w1.d dVarB = aVar.b();
        f20850a = dVarB;
        return dVarB;
    }
}
