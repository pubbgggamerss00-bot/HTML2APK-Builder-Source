package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20777a;

    public static final w1.d a() {
        w1.d dVar = f20777a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Calculate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(19.0f, 3.0f);
        eVar.d(5.0f);
        eVar.b(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        eVar.l(14.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        eVar.e(14.0f);
        eVar.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVar.k(5.0f);
        eVar.b(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        l9.i.b(eVar, 13.03f, 7.06f, 14.09f, 6.0f);
        eVar.g(1.41f, 1.41f);
        eVar.f(16.91f, 6.0f);
        eVar.g(1.06f, 1.06f);
        eVar.g(-1.41f, 1.41f);
        eVar.g(1.41f, 1.41f);
        eVar.g(-1.06f, 1.06f);
        eVar.f(15.5f, 9.54f);
        eVar.g(-1.41f, 1.41f);
        eVar.g(-1.06f, -1.06f);
        id.i.b(eVar, 1.41f, -1.41f, 13.03f, 7.06f);
        n.a(eVar, 6.25f, 7.72f, 5.0f, 1.5f);
        b0.a(eVar, -5.0f, 7.72f, 11.5f, 16.0f);
        eVar.e(-2.0f);
        eVar.l(2.0f);
        eVar.d(8.0f);
        eVar.l(-2.0f);
        eVar.d(6.0f);
        eVar.l(-1.5f);
        eVar.e(2.0f);
        eVar.l(-2.0f);
        eVar.e(1.5f);
        eVar.l(2.0f);
        eVar.e(2.0f);
        eVar.k(16.0f);
        eVar.a();
        n.a(eVar, 18.0f, 17.25f, -5.0f, -1.5f);
        b0.a(eVar, 5.0f, 17.25f, 18.0f, 14.75f);
        eVar.e(-5.0f);
        eVar.l(-1.5f);
        eVar.e(5.0f);
        eVar.k(14.75f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20777a = dVarB;
        return dVarB;
    }
}
