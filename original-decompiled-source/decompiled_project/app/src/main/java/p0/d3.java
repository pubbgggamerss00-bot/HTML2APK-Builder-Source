package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20819a;

    public static final w1.d a() {
        w1.d dVar = f20819a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.EditNote", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(3.0f, 10.0f);
        eVar.e(11.0f);
        eVar.l(2.0f);
        eVar.d(3.0f);
        eVar.k(10.0f);
        eVar.a();
        eVar.h(3.0f, 8.0f);
        eVar.e(11.0f);
        eVar.k(6.0f);
        eVar.d(3.0f);
        eVar.k(8.0f);
        eVar.a();
        n.a(eVar, 3.0f, 16.0f, 7.0f, -2.0f);
        eVar.d(3.0f);
        eVar.k(16.0f);
        eVar.a();
        eVar.h(18.01f, 12.87f);
        eVar.g(0.71f, -0.71f);
        eVar.c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.g(0.71f, 0.71f);
        eVar.c(0.39f, 0.39f, 0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        id.i.b(eVar, -0.71f, 0.71f, 18.01f, 12.87f);
        eVar.h(17.3f, 13.58f);
        eVar.g(-5.3f, 5.3f);
        eVar.k(21.0f);
        eVar.e(2.12f);
        id.i.b(eVar, 5.3f, -5.3f, 17.3f, 13.58f);
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20819a = dVarB;
        return dVarB;
    }
}
