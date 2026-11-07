package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20911a;

    public static final w1.d a() {
        w1.d dVar = f20911a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Album", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 2.0f);
        eVarA.b(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        eVarA.j(4.48f, 10.0f, 10.0f, 10.0f);
        eVarA.j(10.0f, -4.48f, 10.0f, -10.0f);
        eVarA.i(17.52f, 2.0f, 12.0f, 2.0f);
        eVarA.a();
        eVarA.h(12.0f, 16.5f);
        eVarA.c(-2.49f, CropImageView.DEFAULT_ASPECT_RATIO, -4.5f, -2.01f, -4.5f, -4.5f);
        eVarA.i(9.51f, 7.5f, 12.0f, 7.5f);
        eVarA.j(4.5f, 2.01f, 4.5f, 4.5f);
        eVarA.j(-2.01f, 4.5f, -4.5f, 4.5f);
        eVarA.a();
        eVarA.h(12.0f, 11.0f);
        eVarA.c(-0.55f, CropImageView.DEFAULT_ASPECT_RATIO, -1.0f, 0.45f, -1.0f, 1.0f);
        eVarA.j(0.45f, 1.0f, 1.0f, 1.0f);
        eVarA.j(1.0f, -0.45f, 1.0f, -1.0f);
        eVarA.j(-0.45f, -1.0f, -1.0f, -1.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20911a = dVarB;
        return dVarB;
    }
}
