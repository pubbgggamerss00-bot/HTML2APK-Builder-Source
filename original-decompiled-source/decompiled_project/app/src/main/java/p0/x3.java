package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f21090a;

    public static final w1.d a() {
        w1.d dVar = f21090a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Favorite", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(12.0f, 21.35f, -1.45f, -1.32f);
        eVarA.b(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        eVarA.b(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        eVarA.c(1.74f, CropImageView.DEFAULT_ASPECT_RATIO, 3.41f, 0.81f, 4.5f, 2.09f);
        eVarA.b(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        eVarA.b(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        eVarA.c(CropImageView.DEFAULT_ASPECT_RATIO, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        eVarA.f(12.0f, 21.35f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f21090a = dVarB;
        return dVarB;
    }
}
