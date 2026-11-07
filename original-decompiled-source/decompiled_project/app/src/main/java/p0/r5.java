package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class r5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21013a;

    public static final w1.d a() {
        w1.d dVar = f21013a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Inventory2", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(20.0f, 2.0f);
        eVar.d(4.0f);
        eVar.b(3.0f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        eVar.l(3.01f);
        eVar.b(2.0f, 7.73f, 2.43f, 8.35f, 3.0f, 8.7f);
        eVar.k(20.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 1.1f, 2.0f, 2.0f, 2.0f);
        eVar.e(14.0f);
        eVar.c(0.9f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(8.7f);
        eVar.c(0.57f, -0.35f, 1.0f, -0.97f, 1.0f, -1.69f);
        eVar.k(4.0f);
        eVar.b(22.0f, 2.9f, 21.0f, 2.0f, 20.0f, 2.0f);
        eVar.a();
        eVar.h(15.0f, 14.0f);
        eVar.d(9.0f);
        eVar.l(-2.0f);
        b0.a(eVar, 6.0f, 14.0f, 20.0f, 7.0f);
        eVar.d(4.0f);
        eVar.k(4.0f);
        eVar.e(16.0f);
        eVar.k(7.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21013a = dVarB;
        return dVarB;
    }
}
