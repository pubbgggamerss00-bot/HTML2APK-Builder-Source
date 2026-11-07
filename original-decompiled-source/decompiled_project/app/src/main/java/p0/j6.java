package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20904a;

    public static final w1.d a() {
        w1.d dVar = f20904a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.LocalCafe", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 3.0f);
        eVar.f(4.0f, 3.0f);
        eVar.l(10.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        eVar.e(6.0f);
        eVar.c(2.21f, CropImageView.DEFAULT_ASPECT_RATIO, 4.0f, -1.79f, 4.0f, -4.0f);
        eVar.l(-3.0f);
        eVar.e(2.0f);
        eVar.c(1.11f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.f(22.0f, 5.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
        d0.a(eVar, 20.0f, 8.0f, -2.0f);
        b6.a.c(eVar, 18.0f, 5.0f, 2.0f, 3.0f);
        n.a(eVar, 4.0f, 19.0f, 16.0f, 2.0f);
        eVar.f(4.0f, 21.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20904a = dVarB;
        return dVarB;
    }
}
