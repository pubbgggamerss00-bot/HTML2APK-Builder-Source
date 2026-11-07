package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20980a;

    public static final w1.d a() {
        w1.d dVar = f20980a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Bolt", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(11.0f, 21.0f);
        eVar.e(-1.0f);
        eVar.g(1.0f, -7.0f);
        eVar.d(7.5f);
        eVar.c(-0.58f, CropImageView.DEFAULT_ASPECT_RATIO, -0.57f, -0.32f, -0.38f, -0.66f);
        eVar.c(0.19f, -0.34f, 0.05f, -0.08f, 0.07f, -0.12f);
        eVar.b(8.48f, 10.94f, 10.42f, 7.54f, 13.0f, 3.0f);
        eVar.e(1.0f);
        eVar.g(-1.0f, 7.0f);
        eVar.e(3.5f);
        eVar.c(0.49f, CropImageView.DEFAULT_ASPECT_RATIO, 0.56f, 0.33f, 0.47f, 0.51f);
        eVar.g(-0.07f, 0.15f);
        eVar.b(12.96f, 17.55f, 11.0f, 21.0f, 11.0f, 21.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20980a = dVarB;
        return dVarB;
    }
}
