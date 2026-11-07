package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20818a;

    public static final w1.d a() {
        w1.d dVar = f20818a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Contrast", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 22.0f);
        eVarA.c(5.52f, CropImageView.DEFAULT_ASPECT_RATIO, 10.0f, -4.48f, 10.0f, -10.0f);
        eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
        eVarA.i(2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.i(6.48f, 22.0f, 12.0f, 22.0f);
        eVarA.a();
        eVarA.h(13.0f, 4.07f);
        eVarA.c(3.94f, 0.49f, 7.0f, 3.85f, 7.0f, 7.93f);
        eVarA.j(-3.05f, 7.44f, -7.0f, 7.93f);
        eVarA.k(4.07f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20818a = dVarB;
        return dVarB;
    }
}
