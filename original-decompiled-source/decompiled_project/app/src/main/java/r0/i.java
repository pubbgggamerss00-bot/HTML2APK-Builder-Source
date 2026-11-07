package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23023a;

    public static final w1.d a() {
        w1.d dVar = f23023a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.CheckCircle", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
        eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
        eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
        l9.i.b(eVarA, 9.29f, 16.29f, 5.7f, 12.7f);
        eVarA.c(-0.39f, -0.39f, -0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
        eVarA.c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.f(10.0f, 14.17f);
        eVarA.g(6.88f, -6.88f);
        eVarA.c(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.c(0.39f, 0.39f, 0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        eVarA.g(-7.59f, 7.59f);
        eVarA.c(-0.38f, 0.39f, -1.02f, 0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23023a = dVarB;
        return dVarB;
    }
}
