package r0;

import com.yalantis.ucrop.view.CropImageView;
import q1.b1;
import q1.i2;
import w1.d;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f23024a;

    public static final w1.d a() {
        w1.d dVar = f23024a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Rounded.MoreVert", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        i2 i2Var = new i2(b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 8.0f);
        eVarA.c(1.1f, CropImageView.DEFAULT_ASPECT_RATIO, 2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.j(-0.9f, -2.0f, -2.0f, -2.0f);
        eVarA.j(-2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.j(0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.a();
        eVarA.h(12.0f, 10.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.j(0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.j(2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.j(-0.9f, -2.0f, -2.0f, -2.0f);
        eVarA.a();
        eVarA.h(12.0f, 16.0f);
        eVarA.c(-1.1f, CropImageView.DEFAULT_ASPECT_RATIO, -2.0f, 0.9f, -2.0f, 2.0f);
        eVarA.j(0.9f, 2.0f, 2.0f, 2.0f);
        eVarA.j(2.0f, -0.9f, 2.0f, -2.0f);
        eVarA.j(-0.9f, -2.0f, -2.0f, -2.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f23024a = dVarB;
        return dVarB;
    }
}
