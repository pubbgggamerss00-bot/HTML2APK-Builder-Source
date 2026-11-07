package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class g8 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20865a;

    public static final w1.d a() {
        w1.d dVar = f20865a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Place", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.b(8.13f, 2.0f, 5.0f, 5.13f, 5.0f, 9.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        eVarA.j(7.0f, -7.75f, 7.0f, -13.0f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        eVarA.a();
        eVarA.h(12.0f, 11.5f);
        eVarA.c(-1.38f, CropImageView.DEFAULT_ASPECT_RATIO, -2.5f, -1.12f, -2.5f, -2.5f);
        eVarA.j(1.12f, -2.5f, 2.5f, -2.5f);
        eVarA.j(2.5f, 1.12f, 2.5f, 2.5f);
        eVarA.j(-1.12f, 2.5f, -2.5f, 2.5f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20865a = dVarB;
        return dVarB;
    }
}
