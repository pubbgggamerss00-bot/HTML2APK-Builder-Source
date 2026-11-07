package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23035a;

    public static final w1.d a() {
        w1.d dVar = f23035a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.Code", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = p0.m.a(8.7f, 15.9f, 4.8f, 12.0f);
        eVarA.g(3.9f, -3.9f);
        eVarA.c(0.39f, -0.39f, 0.39f, -1.01f, CropImageView.DEFAULT_ASPECT_RATIO, -1.4f);
        eVarA.c(-0.39f, -0.39f, -1.01f, -0.39f, -1.4f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(-4.59f, 4.59f);
        eVarA.c(-0.39f, 0.39f, -0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        eVarA.g(4.59f, 4.6f);
        eVarA.c(0.39f, 0.39f, 1.01f, 0.39f, 1.4f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.c(0.39f, -0.39f, 0.39f, -1.01f, CropImageView.DEFAULT_ASPECT_RATIO, -1.4f);
        l9.y.a(eVarA, 15.3f, 15.9f, 3.9f, -3.9f);
        eVarA.g(-3.9f, -3.9f);
        eVarA.c(-0.39f, -0.39f, -0.39f, -1.01f, CropImageView.DEFAULT_ASPECT_RATIO, -1.4f);
        eVarA.c(0.39f, -0.39f, 1.01f, -0.39f, 1.4f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(4.59f, 4.59f);
        eVarA.c(0.39f, 0.39f, 0.39f, 1.02f, CropImageView.DEFAULT_ASPECT_RATIO, 1.41f);
        eVarA.g(-4.59f, 4.6f);
        eVarA.c(-0.39f, 0.39f, -1.01f, 0.39f, -1.4f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.c(-0.39f, -0.39f, -0.39f, -1.01f, CropImageView.DEFAULT_ASPECT_RATIO, -1.4f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23035a = dVarB;
        return dVarB;
    }
}
