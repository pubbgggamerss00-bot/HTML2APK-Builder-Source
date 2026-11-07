package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class fc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20855a;

    public static final w1.d a() {
        w1.d dVar = f20855a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.VpnKey", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.65f, 10.0f);
        eVarA.b(11.83f, 7.67f, 9.61f, 6.0f, 7.0f, 6.0f);
        eVarA.c(-3.31f, CropImageView.DEFAULT_ASPECT_RATIO, -6.0f, 2.69f, -6.0f, 6.0f);
        eVarA.j(2.69f, 6.0f, 6.0f, 6.0f);
        eVarA.c(2.61f, CropImageView.DEFAULT_ASPECT_RATIO, 4.83f, -1.67f, 5.65f, -4.0f);
        eVarA.d(17.0f);
        eVarA.l(4.0f);
        eVarA.e(4.0f);
        eVarA.l(-4.0f);
        eVarA.e(2.0f);
        eVarA.l(-4.0f);
        eVarA.d(12.65f);
        eVarA.a();
        eVarA.h(7.0f, 14.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, -0.9f, -2.0f, -2.0f);
        eVarA.j(0.9f, -2.0f, 2.0f, -2.0f);
        eVarA.j(2.0f, 0.9f, 2.0f, 2.0f);
        eVarA.j(-0.9f, 2.0f, -2.0f, 2.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20855a = dVarB;
        return dVarB;
    }
}
