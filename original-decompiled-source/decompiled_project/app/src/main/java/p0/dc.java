package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class dc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20828a;

    public static final w1.d a() {
        w1.d dVar = f20828a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Visibility", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = o0.d.a(12.0f, 4.5f);
        eVarA.b(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f);
        eVarA.c(1.73f, 4.39f, 6.0f, 7.5f, 11.0f, 7.5f);
        eVarA.j(9.27f, -3.11f, 11.0f, -7.5f);
        eVarA.c(-1.73f, -4.39f, -6.0f, -7.5f, -11.0f, -7.5f);
        eVarA.a();
        eVarA.h(12.0f, 17.0f);
        eVarA.c(-2.76f, CropImageView.DEFAULT_ASPECT_RATIO, -5.0f, -2.24f, -5.0f, -5.0f);
        eVarA.j(2.24f, -5.0f, 5.0f, -5.0f);
        eVarA.j(5.0f, 2.24f, 5.0f, 5.0f);
        eVarA.j(-2.24f, 5.0f, -5.0f, 5.0f);
        eVarA.a();
        eVarA.h(12.0f, 9.0f);
        eVarA.c(-1.66f, CropImageView.DEFAULT_ASPECT_RATIO, -3.0f, 1.34f, -3.0f, 3.0f);
        eVarA.j(1.34f, 3.0f, 3.0f, 3.0f);
        eVarA.j(3.0f, -1.34f, 3.0f, -3.0f);
        eVarA.j(-1.34f, -3.0f, -3.0f, -3.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20828a = dVarB;
        return dVarB;
    }
}
