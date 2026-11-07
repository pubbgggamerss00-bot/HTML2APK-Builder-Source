package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23038a;

    public static final w1.d a() {
        w1.d dVar = f23038a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.Search", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(15.5f, 14.0f);
        eVar.e(-0.79f);
        eVar.g(-0.28f, -0.27f);
        eVar.c(1.2f, -1.4f, 1.82f, -3.31f, 1.48f, -5.34f);
        eVar.c(-0.47f, -2.78f, -2.79f, -5.0f, -5.59f, -5.34f);
        eVar.c(-4.23f, -0.52f, -7.79f, 3.04f, -7.27f, 7.27f);
        eVar.c(0.34f, 2.8f, 2.56f, 5.12f, 5.34f, 5.59f);
        eVar.c(2.03f, 0.34f, 3.94f, -0.28f, 5.34f, -1.48f);
        eVar.g(0.27f, 0.28f);
        eVar.l(0.79f);
        eVar.g(4.25f, 4.25f);
        eVar.c(0.41f, 0.41f, 1.08f, 0.41f, 1.49f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVar.c(0.41f, -0.41f, 0.41f, -1.08f, CropImageView.DEFAULT_ASPECT_RATIO, -1.49f);
        ji.a.b(eVar, 15.5f, 14.0f, 9.5f, 14.0f);
        eVar.b(7.01f, 14.0f, 5.0f, 11.99f, 5.0f, 9.5f);
        eVar.i(7.01f, 5.0f, 9.5f, 5.0f);
        eVar.i(14.0f, 7.01f, 14.0f, 9.5f);
        eVar.i(11.99f, 14.0f, 9.5f, 14.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23038a = dVarB;
        return dVarB;
    }
}
