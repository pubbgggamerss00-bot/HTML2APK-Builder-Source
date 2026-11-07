package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class u5 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21053a;

    public static final w1.d a() {
        w1.d dVar = f21053a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Key", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(21.0f, 10.0f);
        eVar.e(-8.35f);
        eVar.b(11.83f, 7.67f, 9.61f, 6.0f, 7.0f, 6.0f);
        eVar.c(-3.31f, CropImageView.DEFAULT_ASPECT_RATIO, -6.0f, 2.69f, -6.0f, 6.0f);
        eVar.j(2.69f, 6.0f, 6.0f, 6.0f);
        eVar.c(2.61f, CropImageView.DEFAULT_ASPECT_RATIO, 4.83f, -1.67f, 5.65f, -4.0f);
        eVar.d(13.0f);
        eVar.g(2.0f, 2.0f);
        eVar.g(2.0f, -2.0f);
        eVar.g(2.0f, 2.0f);
        id.i.b(eVar, 4.0f, -4.04f, 21.0f, 10.0f);
        eVar.h(7.0f, 15.0f);
        eVar.c(-1.65f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, -1.35f, -3.0f, -3.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.65f, 1.35f, -3.0f, 3.0f, -3.0f);
        eVar.j(3.0f, 1.35f, 3.0f, 3.0f);
        eVar.b(10.0f, 13.65f, 8.65f, 15.0f, 7.0f, 15.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21053a = dVarB;
        return dVarB;
    }
}
