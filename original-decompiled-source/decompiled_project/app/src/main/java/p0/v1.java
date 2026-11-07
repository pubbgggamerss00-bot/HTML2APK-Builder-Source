package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class v1 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21062a;

    public static final w1.d a() {
        w1.d dVar = f21062a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.CloudUpload", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(19.35f, 10.04f);
        eVarA.b(18.67f, 6.59f, 15.64f, 4.0f, 12.0f, 4.0f);
        eVarA.b(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f);
        eVarA.b(2.34f, 8.36f, CropImageView.DEFAULT_ASPECT_RATIO, 10.91f, CropImageView.DEFAULT_ASPECT_RATIO, 14.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        eVarA.e(13.0f);
        eVarA.c(2.76f, CropImageView.DEFAULT_ASPECT_RATIO, 5.0f, -2.24f, 5.0f, -5.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f);
        eVarA.a();
        eVarA.h(14.0f, 13.0f);
        eVarA.l(4.0f);
        eVarA.e(-4.0f);
        eVarA.l(-4.0f);
        eVarA.d(7.0f);
        eVarA.g(5.0f, -5.0f);
        eVarA.g(5.0f, 5.0f);
        eVarA.e(-3.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21062a = dVarB;
        return dVarB;
    }
}
