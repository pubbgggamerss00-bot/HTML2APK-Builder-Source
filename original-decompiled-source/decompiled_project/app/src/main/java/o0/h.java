package o0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;
import w1.m;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f18846a;

    public static final w1.d a() {
        w1.d dVar = f18846a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("AutoMirrored.Rounded.Undo", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i10 = m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = d.a(12.5f, 8.0f);
        eVarA.c(-2.65f, CropImageView.DEFAULT_ASPECT_RATIO, -5.05f, 0.99f, -6.9f, 2.6f);
        eVarA.f(3.71f, 8.71f);
        eVarA.b(3.08f, 8.08f, 2.0f, 8.52f, 2.0f, 9.41f);
        eVarA.k(15.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        eVarA.e(5.59f);
        eVarA.c(0.89f, CropImageView.DEFAULT_ASPECT_RATIO, 1.34f, -1.08f, 0.71f, -1.71f);
        eVarA.g(-1.91f, -1.91f);
        eVarA.c(1.39f, -1.16f, 3.16f, -1.88f, 5.12f, -1.88f);
        eVarA.c(3.16f, CropImageView.DEFAULT_ASPECT_RATIO, 5.89f, 1.84f, 7.19f, 4.5f);
        eVarA.c(0.27f, 0.56f, 0.91f, 0.84f, 1.5f, 0.64f);
        eVarA.c(0.71f, -0.23f, 1.07f, -1.04f, 0.75f, -1.72f);
        eVarA.b(20.23f, 10.42f, 16.65f, 8.0f, 12.5f, 8.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f18846a = dVarB;
        return dVarB;
    }
}
