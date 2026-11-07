package p0;

import com.yalantis.ucrop.view.CropImageView;
import w1.d;

/* loaded from: classes.dex */
public final class oc {

    /* renamed from: a, reason: collision with root package name */
    public static w1.d f20978a;

    public static final w1.d a() {
        w1.d dVar = f20978a;
        if (dVar != null) {
            return dVar;
        }
        d.a aVar = new d.a("Filled.Wifi", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i10 = w1.m.f31210a;
        q1.i2 i2Var = new q1.i2(q1.b1.f21648b);
        w1.e eVarA = n0.b.a(1.0f, 9.0f, 2.0f, 2.0f);
        eVarA.c(4.97f, -4.97f, 13.03f, -4.97f, 18.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(2.0f, -2.0f);
        eVarA.b(16.93f, 2.93f, 7.08f, 2.93f, 1.0f, 9.0f);
        l9.y.a(eVarA, 9.0f, 17.0f, 3.0f, 3.0f);
        eVarA.g(3.0f, -3.0f);
        eVarA.c(-1.65f, -1.66f, -4.34f, -1.66f, -6.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        l9.y.a(eVarA, 5.0f, 13.0f, 2.0f, 2.0f);
        eVarA.c(2.76f, -2.76f, 7.24f, -2.76f, 10.0f, CropImageView.DEFAULT_ASPECT_RATIO);
        eVarA.g(2.0f, -2.0f);
        eVarA.b(15.14f, 9.14f, 8.87f, 9.14f, 5.0f, 13.0f);
        eVarA.a();
        d.a.a(aVar, eVarA.f31100a, 0, i2Var);
        w1.d dVarB = aVar.b();
        f20978a = dVarB;
        return dVarB;
    }
}
