package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23019a;

    public static final w1.d a() {
        w1.d dVar = f23019a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.Bookmark", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVar = new w1.e();
        eVar.h(17.0f, 3.0f);
        eVar.d(7.0f);
        eVar.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVar.l(16.0f);
        eVar.g(7.0f, -3.0f);
        eVar.g(7.0f, 3.0f);
        eVar.k(5.0f);
        eVar.c(CropImageView.DEFAULT_ASPECT_RATIO, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        eVar.a();
        d.a.a(aVar, eVar.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23019a = dVarB;
        return dVarB;
    }
}
