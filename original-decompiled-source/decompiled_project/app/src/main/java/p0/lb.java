package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20937a;

    public static final w1.d a() {
        w1.d dVar = f20937a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Today", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.0f, 3.0f);
        eVar.e(-1.0f);
        eVar.f(18.0f, 1.0f);
        eVar.e(-2.0f);
        eVar.l(2.0f);
        eVar.f(8.0f, 3.0f);
        eVar.f(8.0f, 1.0f);
        eVar.f(6.0f, 1.0f);
        eVar.l(2.0f);
        eVar.f(5.0f, 3.0f);
        eVar.c(-1.11f, CropImageView.DEFAULT_ASPECT_RATIO, -1.99f, 0.9f, -1.99f, 2.0f);
        eVar.f(3.0f, 19.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        eVar.e(14.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.f(21.0f, 5.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        l9.i.b(eVar, 19.0f, 19.0f, 5.0f, 19.0f);
        b6.a.c(eVar, 5.0f, 8.0f, 14.0f, 11.0f);
        n.a(eVar, 7.0f, 10.0f, 5.0f, 5.0f);
        eVar.f(7.0f, 15.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20937a = dVarB;
        return dVarB;
    }
}
