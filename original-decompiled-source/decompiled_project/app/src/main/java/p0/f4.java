package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class f4 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20847a;

    public static final w1.d a() {
        w1.d dVar = f20847a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Flare", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(7.0f, 11.0f);
        eVar.f(1.0f, 11.0f);
        eVar.l(2.0f);
        eVar.e(6.0f);
        eVar.l(-2.0f);
        eVar.a();
        eVar.h(9.17f, 7.76f);
        eVar.f(7.05f, 5.64f);
        eVar.f(5.64f, 7.05f);
        h.b(eVar, 2.12f, 2.12f, 1.41f, -1.41f);
        n.a(eVar, 13.0f, 1.0f, -2.0f, 6.0f);
        eVar.e(2.0f);
        eVar.f(13.0f, 1.0f);
        eVar.a();
        eVar.h(18.36f, 7.05f);
        eVar.g(-1.41f, -1.41f);
        eVar.g(-2.12f, 2.12f);
        h.b(eVar, 1.41f, 1.41f, 2.12f, -2.12f);
        eVar.h(17.0f, 11.0f);
        eVar.l(2.0f);
        eVar.e(6.0f);
        eVar.l(-2.0f);
        eVar.e(-6.0f);
        eVar.a();
        eVar.h(12.0f, 9.0f);
        eVar.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
        eVar.j(1.34f, 3.0f, 3.0f, 3.0f);
        eVar.j(3.0f, -1.34f, 3.0f, -3.0f);
        eVar.j(-1.34f, -3.0f, -3.0f, -3.0f);
        l9.y.a(eVar, 14.83f, 16.24f, 2.12f, 2.12f);
        eVar.g(1.41f, -1.41f);
        h.b(eVar, -2.12f, -2.12f, -1.41f, 1.41f);
        eVar.h(5.64f, 16.95f);
        eVar.g(1.41f, 1.41f);
        eVar.g(2.12f, -2.12f);
        h.b(eVar, -1.41f, -1.41f, -2.12f, 2.12f);
        n.a(eVar, 11.0f, 23.0f, 2.0f, -6.0f);
        eVar.e(-2.0f);
        eVar.l(6.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20847a = dVarB;
        return dVarB;
    }
}
