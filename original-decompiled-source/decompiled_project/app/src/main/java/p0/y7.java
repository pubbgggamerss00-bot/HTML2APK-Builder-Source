package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21107a;

    public static final w1.d a() {
        w1.d dVar = f21107a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Person", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 12.0f);
        eVarA.c(2.21f, CropImageView.DEFAULT_ASPECT_RATIO, 4.0f, -1.79f, 4.0f, -4.0f);
        eVarA.j(-1.79f, -4.0f, -4.0f, -4.0f);
        eVarA.j(-4.0f, 1.79f, -4.0f, 4.0f);
        eVarA.j(1.79f, 4.0f, 4.0f, 4.0f);
        eVarA.a();
        eVarA.h(12.0f, 14.0f);
        eVarA.c(-2.67f, CropImageView.DEFAULT_ASPECT_RATIO, -8.0f, 1.34f, -8.0f, 4.0f);
        eVarA.l(2.0f);
        eVarA.e(16.0f);
        eVarA.l(-2.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.66f, -5.33f, -4.0f, -8.0f, -4.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21107a = dVarB;
        return dVarB;
    }
}
