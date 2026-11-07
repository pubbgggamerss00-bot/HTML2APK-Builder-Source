package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23033a;

    public static final w1.d a() {
        w1.d dVar = f23033a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = o0.d.a(18.3f, 5.71f);
        eVarA.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.f(12.0f, 10.59f);
        eVarA.f(7.11f, 5.7f);
        eVarA.c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.c(-0.39f, 0.39f, -0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        eVarA.f(10.59f, 12.0f);
        eVarA.f(5.7f, 16.89f);
        eVarA.c(-0.39f, 0.39f, -0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        eVarA.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.f(12.0f, 13.41f);
        eVarA.g(4.89f, 4.89f);
        eVarA.c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.c(0.39f, -0.39f, 0.39f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.41f);
        eVarA.f(13.41f, 12.0f);
        eVarA.g(4.89f, -4.89f);
        eVarA.c(0.38f, -0.38f, 0.38f, -1.02f, CropImageView.DEFAULT_ASPECT_RATIO, -1.4f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23033a = dVarB;
        return dVarB;
    }
}
